pipeline{
	agent any
	
	environment{
		DOCKER_IMAGE_NAME='calculator'
		GITHUB_REPO_URL='https://github.com/Sumith1908/Calculator.git'
	}
	
	stages{
		stage('Checkout'){
			steps{
				script{
					git branch: 'master', url: "${GITHUB_REPO_URL}"
				}
			}
		}
		
		stage('Build Docker Image'){
			steps{
				script{
					docker.build("${DOCKER_IMAGE_NAME}", '.')
				}
			}
		}
		
		stage('Push Docker Images'){
			steps{
				script{
					docker.withRegistry('', 'DockerHubCred') {
                    				sh 'docker tag calculator sumith783/calculator:latest'
                    				sh 'docker push sumith783/calculator'
					}
				}
			}
		}
		
		stage('Run Ansible Playbook'){
			steps{
				script{
					ansiblePlaybook(
                        			playbook: 'deploy.yaml'
                     			)
				}
			}
		}
	}
	
}
