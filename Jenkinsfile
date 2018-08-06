pipeline {
  agent any

  triggers {
    cron('H */4 * * 1-5')
  }

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