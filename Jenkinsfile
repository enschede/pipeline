pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT')
      }
    }
  }
}