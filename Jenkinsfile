pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/codeapexbydas/cad.patient-management-system.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
