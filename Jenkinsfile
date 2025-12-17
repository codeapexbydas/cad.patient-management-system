node {
    try {
        // Clean workspace first
        cleanWs()
        
        // Checkout code
        stage('Checkout') {
            checkout([
                $class: 'GitSCM',
                branches: [[name: '*/main']],
                userRemoteConfigs: [[
                    url: 'https://github.com/codeapexbydas/cad.patient-management-system.git'
                ]]
            ])
            sh 'ls -la'
        }
        
        // Setup environment
        stage('Setup Environment') {
            sh '''
                echo "=== Environment ==="
                java -version
                mvn --version
                echo "Working directory:"
                pwd
            '''
        }
        
        // Build
        stage('Build') {
            sh 'mvn clean compile -DskipTests'
        }
        
        // Test
        stage('Test') {
            sh 'mvn test'
            junit 'target/surefire-reports/*.xml'
        }
        
        // Package
        stage('Package') {
            sh 'mvn package -DskipTests'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        
        // Success message
        echo '✅ Build successful!'
        currentBuild.result = 'SUCCESS'
        
    } catch (Exception e) {
        // Failure message
        echo "❌ Build failed: ${e}"
        currentBuild.result = 'FAILURE'
        throw e
    } finally {
        // Always clean workspace
        cleanWs()
        echo "Build finished with status: ${currentBuild.result}"
    }
}
