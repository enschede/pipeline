pipeline {
    agent any

    environment {
        MYENV = 'Hello Pipeline Hacker'
     }


    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
        stage('Deploy') {
            environment {
                GITHUB = credentials('github')
            }

            steps {
                echo 'Deploy'
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "MYENV =  ${env.MYENV}"
                echo "Github =  ${env.GITHUB}"
                echo "Github =  ${env.GITHUB_USR}"
                echo "Github =  ${env.GITHUB_PSW}"
            }
        }
        stage('Back-end') {
            agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
                sh 'mvn --version'
            }
        }

    }
}