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
    }
}