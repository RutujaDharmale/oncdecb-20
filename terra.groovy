//pipeline given by sir 
pipeline {
    agent any

    stages {
        stage('Code-Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/RutujaDharmale/oncdecb-20.git'
            }
        }

        stage('Terraform Init') {
            steps {
                sh '''
                cd terraform/instance
                terraform init '''
            }
        }

        stage('Terraform Plan') {
            steps {
                sh '''
                cd terraform/instance
                terraform plan '''
            }
        }

        stage('Terraform apply') {
            steps {
                sh '''
                cd terraform/instance 
                terraform apply --auto-approve'''
            }
        }
    }
}





pipeline {
    agent any

    stages {
        stage('Code-Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/RutujaDharmale/oncdecb-20.git'
            }
        }

        stage('Terraform Init') {
            steps {
                sh 'terraform init'
            }
        }

        stage('Terraform Plan') {
            steps {
                sh 'terraform plan '
            
            }
        }

        stage('Terraform apply') {
            steps {
                sh 'terraform apply --auto-approve'
                
            }
        }
    }
}

