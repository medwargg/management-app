pipeline {
    agent any

    stages {
        stage('Build') {
            tools{
                jdk "Java 11"
            }
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
    }

    post {
        always {
            echo 'Done'
        }
    }
}