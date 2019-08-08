# Vagrant - Provisioning Calculator Go with Docker on Vagrant

## For install Vagrant open the terminal and use the command: 

     sudo apt install vagrant

## For start the Vagrant machine use: 

     vagrant up 

## To get into the Vagrant machine use: 

     vagrant ssh 

## To get out the Vagrant machine use: 

     exit 

## To safely shutdown the Vagrant machine use:

     vagrant halt 

## And for destroy the Vagrant machine use:

     vagrant destroy 

___

## Once inside your Vagrant machine you can run:

### To start the service:

     ./runService start {serviceName} 

### To stop the service: 

     ./runService.sh stop {serviceName}  

### And for check the status:

     ./runService.sh status {serviceName} 

___

## The calculator will be available in the following url

### For instructions of use:

-  http://55.55.55.5:8080/calc/

### For additions:

- http://55.55.55.5:8080/calc/sum/{firstNum}/{secondNum}

### For subtractions:

- http://55.55.55.5:8080/calc/sub/{firstNum}/{secondNum}

### For multiplications:

- http://55.55.55.5:8080/calc/mul/{firstNum}/{secondNum}

### For divisions:

- http://55.55.55.5:8080/calc/div/{firstNum}/{secondNum}

### You can also check the history through the following url:

- http://55.55.55.5:8080/calc/history
