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

     stage('Integration test') {
       steps {
         withMaven(publisherStrategy: 'EXPLICIT') {
           sh "./mvnw clean install"
         }
       }
     }

     stage('Release') {
       when {
         branch 'master'
       }
       steps {
         withMaven(publisherStrategy: 'EXPLICIT') {
           sh "./mvnw clean install"
         }
       }
     }

   }
 }