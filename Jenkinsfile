pipeline {
    agent any

    environment {
        MYENV = 'Hello Pipeline Hacker'
    }

    tools{
        maven 'maven 3'
        jdk 'java 8'
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
        stage('Maven') {
            // Maven installation declared in the Jenkins "Global Tool Configuration"
            //withMaven(maven: 'M3') {

                // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
                // Maven settings and global settings can also be defined in Jenkins Global Tools Configuration


              // Run the maven build
              //sh "mvn clean install"

            //} // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs reports...

            steps {
                echo 'Maven'
            }
        }
    }
}