# Packer

## For start the Packer backing use:

    sudo packer build {jsonName} 

___ 

## For start the Docker use:

    sudo docker run -ti -p 8080:8080 golang-calculator

___ 

### The calculator will be available in the following url

#### For instructions of use:

- http://localhost:8080/calc/

#### For additions:

- http://localhost:8080/calc/sum/{firstNum}/{secondNum}

#### For subtractions:

- http://localhost:8080/calc/sub/{firstNum}/{secondNum}

#### For multiplications:

- http://localhost:8080/calc/mul/{firstNum}/{secondNum}

#### For divisions:

- http://localhost:8080/calc/div/{firstNum}/{secondNum}

#### You can also check the history through the following url:

- http://localhost:8080/calc/history
