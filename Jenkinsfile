pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git url: 'https://github.com/onniluova/jenkinstest2.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run the tests using Maven
                sh 'mvn test'
            }
        }

        stage('Archive Results') {
            steps {
                // Archive the test results
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Debug Info') {
            steps {
                // Print environment variables and debug information
                sh 'printenv'
                sh 'mvn --version'
                sh 'java -version'
                sh 'git --version'
                sh 'git config --list'
            }
        }
    }

    post {
        always {
            // Clean up workspace after build
            cleanWs()
        }
    }
}