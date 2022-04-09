/* The environment specifies the credentials required to push my image to dockerhub */
    environment {
        registry = "19chaudhary/scientificcalculatordevopstools"
        registryCredential = 'docker-cred'
        dockerImage = ''
    }
pipeline {
    agent any
    stages {
        stage('step 1 Git') {
            steps {
                 git url: 'https://github.com/19chaudhary/MIniProject.git', branch: 'master',
                 credentialsId: 'git-cred'
            }
        }
        stage('step 2 Build maven') {
            steps {
                sh "mvn -B -DskipTests clean package"
            }
        }
        stage('step 3 Test'){
            steps{
                sh "mvn test"
            }
        }
        stage('stage 4 Building docker image') {
                    steps{
                        script {
                            dockerImage = docker.build registry + ":latest"
                        }
                    }
    }
}