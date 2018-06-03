pipeline {
    agent any

    environment {
        MYENV = 'Hello Pipeline Hacker'
        GITHUB = credentials('github')
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
            steps {
                echo 'Deploy'
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "Github =  ${env.MYENV}"
                echo "Github =  ${env.GITHUB}"
                echo "Github =  ${env.GITHUB_USR}"
                echo "Github =  ${env.GITHUB_PSW}"
            }
        }
    }
}