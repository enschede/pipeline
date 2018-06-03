pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT',
            jdk: 'jdk8') {
          sh "./mvnw clean install"
        }
      }
    }

    stage('Integration test') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT') {
          sh "./mvnw clean install"
        }
      }
    }

    stage('Release') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT') {
          sh "./mvnw clean install"
        }
      }
    }

  }
}