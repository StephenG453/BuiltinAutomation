pipeline {
//    agent any {
////        node {
////            customWorkspace '/Users/cbrat62'
////        }
//        customWorkspace '/Users/cbrat62'
//    }
    agent any
//        customWorkspace '/User/cbrat62'

    tools {
        maven 'Maven 3.6.3'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh  '''
                    pwd
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    '''
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -Dmaven.test.failure.ignore=true clean install'
            }
            post {
                success {
                    echo 'Maven build succeeded!'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'

                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}