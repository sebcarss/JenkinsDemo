pipeline {
	// Run this stage against all instances
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Building Project'
                bat 'gradle build'
            }
        }
    }
}