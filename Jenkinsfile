pipeline {
    agent any
    
    environment
    {
        dockerImage = ''
        registry = 'prasanna33/scientificcalculator:latest'
        hubCred = 'b3c7089d-5735-4aa5-a93d-9de281659a83'
    }

    stages
    {     
        stage("cloning Repo") 
        {
            steps
            {
                git credentialsId: '5657f810-4de3-4fd1-9ecf-f7968e90f368',
                    branch: 'main',
                    url: 'https://github.com/hanzohasashi33/SPE-scientific-calculator.git'
            }
        }
        
        stage('Testing the Project')
        {
            steps
            {
                sh "mvn clean test"
            }
        }
        
        stage('Building the Project')
        {
            steps
            {
                sh "mvn clean install"
            }
        }
        
        stage('Building Docker Image')
        {
            steps
            {
                script
                {
                    dockerimage = docker.build registry
                }
            }
        }
        
        stage('Pushing Docker Image')
        {
            steps
            {
                script
                {
                    withDockerRegistry(credentialsId: hubCred)
                    {
                        dockerimage.push();    
                    }
                }
            }
        }
        
        stage('Deploying on the Nodes')
        {
            steps
            {
                // ansiblePlaybook colorized: false, disableHostKeyChecking: true, installation: 'Ansible', inventory: './inventory', playbook: './p2.yml'
                sh "ansible --version"
                sh "/usr/bin/python3 --version"
                sh "/usr/bin/pip3 install docker"
                ansiblePlaybook credentialsId: 'prasanna_vm_ssh', disableHostKeyChecking: true, installation: 'ansible_1', inventory: 'inventory', playbook: 'p2.yml'
            }
        }

    }
}