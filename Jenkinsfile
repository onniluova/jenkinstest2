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
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run the tests using Maven
                bat 'mvn test'
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
                bat 'printenv'
                bat 'mvn --version'
                bat 'java -version'
                bat 'git --version'
                bat 'git config --list'
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