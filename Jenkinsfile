pipeline {
    environment {
        registry = "19chaudhary/scientificcalculatordevopstools"
        registryCredential = 'docker-cred'
        dockerImage = ''
    }
    agent any
    stages {
        stage('step 1 Git') {
            steps {
                 git url: 'https://github.com/19chaudhary/MiniProject.git', branch: 'master',
                 credentialsId: 'git-cred'
            }
        }
        stage('step 2 Build maven') {
            steps {
                sh "mvn -B -DskipTests clean package"
            }
        }

        stage('step 3 Test') {
            steps {
                sh "mvn test"
            }
        }

        stage('step 4 Building docker image') {
            steps{
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
    }
}