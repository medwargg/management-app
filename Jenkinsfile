pipeline {
    agent any

    stages {
        stage('Compile') {
            tools{
                jdk "Java 11"
            }
            steps {
                sh './gradlew clean compileJava'
            }
        }
        stage('Test') {
            tools{
                jdk "Java 11"
            }
            steps {
                sh './gradlew clean test'
            }
        }
        stage('Build') {
            tools{
                jdk "Java 11"
            }
            steps {
                sh './gradlew clean build'
            }
        }
    }

    post {
        always {
            echo 'Demo for Mariana who is very curious'
        }
    }
}