pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        // Stage 1: Get code from GitHub
        stage('Checkout Code') {
            steps {
                echo 'Getting code from GitHub...'
                git branch: 'main',
                    url: 'https://github.com/NoelNinanSheri1307/NOELPAYMENT.git'
            }
        }

        // Stage 2: Build using Maven
        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'mvn clean compile'
            }
        }

        // Stage 3: Run JUnit Tests
        stage('Run Tests') {
            steps {
                echo 'Running JUnit Tests...'
                bat 'mvn test'
            }
            post {
                always {
                    // Show test results in Jenkins
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        // Stage 4: Package as JAR
        stage('Package') {
            steps {
                echo 'Packaging as JAR...'
                bat 'mvn package -DskipTests'
            }
        }

        // Stage 5: Show Result
        stage('Done') {
            steps {
                echo 'Build and Test Complete!'
            }
        }

    }

    // After pipeline finishes
    post {
        success {
            echo 'Pipeline SUCCESS'
        }
        failure {
            echo 'Pipeline FAILED - Check logs'
        }
    }

}