pipeline {
    agent any

    tools {
       
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {
                
                git 'https://github.com/Devops8-9AM/mvnproj.git'

               
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

          }
    }
}
