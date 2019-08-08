# Jenkins

## Instructions

### Create a pipeline job for bake the image, copy and paste the Jenkinsfile inside the Bake paste. The Jenkinsfile will:

- Download the archives from github
- Use Packer to build a Docker image

### Create a pipeline job for launch to deploy the calculator, copy and paste the Jenkinsfile inside the Launch paste. The Jenkinsfile will:

- Deploy the calculator on port 8085

___

### The calculator will be available in the following url

#### For instructions of use:

- http://localhost:8085/calc/

#### For additions:

- http://localhost:8085/calc/sum/{firstNum}/{secondNum}

#### For subtractions:

- http://localhost:8085/calc/sub/{firstNum}/{secondNum}

#### For multiplications:

- http://localhost:8085/calc/mul/{firstNum}/{secondNum}

#### For divisions:

- http://localhost:8085/calc/div/{firstNum}/{secondNum}

#### You can also check the history through the following url:

- http://localhost:8085/calc/history
