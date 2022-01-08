pipeline{
    stages{
        stage('Build'){
            steps{
                bat "mvn clean"
            }
        }
		stage('Testing'){
		   steps{
				bat "mvn test"
		   }
 
		}
		stage('Package'){
		    steps{
		        bat "mvn package"
		    }

		}

    }

}
