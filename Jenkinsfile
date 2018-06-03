pipeline {
  agent any

  tools {
    jdk 'jdk8'
    maven 'M3.5'
  }

  stages {
    stage('Build') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT',
            maven: 'M3.5',
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