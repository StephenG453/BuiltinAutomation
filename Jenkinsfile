pipeline {
    agent any
    label {
        label ""
        customWorkspace "C:/work/${BRANCH_NAME}"
    }
    tools {
        maven 'Maven 3.6.3'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh  '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    '''
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -Dmaven.test.failure.ignore=true install'
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
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}