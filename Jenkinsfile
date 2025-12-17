pipeline {
    agent any
    
    options {
        timeout(time: 10, unit: 'MINUTES')
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }
    
    environment {
        // Conservative memory settings for EC2
        MAVEN_OPTS = '-Xmx512m -XX:MaxPermSize=128m -Dmaven.test.skip=true'
        // Skip downloads for faster builds
        MAVEN_CLI_OPTS = '--batch-mode --no-transfer-progress -DskipTests -o'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build (Skip Tests)') {
            steps {
                sh '''
                    echo "Build started at: $(date)"
                    mvn clean compile $MAVEN_CLI_OPTS
                    echo "Build completed at: $(date)"
                '''
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test -DskipITs'
            }
        }
        
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
    
    post {
        always {
            echo "Build time: ${currentBuild.durationString}"
            cleanWs()  // Clean workspace to save disk
        }
    }
}
