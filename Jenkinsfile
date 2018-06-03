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

          echo "M2_HOME = ${M2_HOME}"
          sh "mvn clean install"
        }
      }
    }

    stage('Integration test') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT') {
          sh "mvn clean install"
        }
      }
    }

    stage('Release') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT') {
          sh "mvn clean install"
        }
      }
    }

  }
}