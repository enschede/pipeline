pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(publisherStrategy: 'EXPLICIT') {
          sh "./mvnw clean install"
        }
      }
    }
  }
}