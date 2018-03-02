pipeline {
	// Run this stage against all instances
    agent any
    stages {
        stage('Run unit tests') {
            steps {
                echo 'Running unit tests'
                bat 'gradle test'
            }
        }
        stage('Run build') {
            steps {
                echo 'Building Project'
                bat 'gradle build -x test'
            }
        }
    }
}