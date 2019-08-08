#!/bin/bash

function startMicroservice() {
    if ! existImage; then
        echo "Building Docker image... :)"
        sudo docker build -t $name .
    fi

    if isRunning; then
        echo "Docker image is already running :)"
    else
        sudo docker run --rm --name $name -p 8080:8080 $name
        echo "Docker image is running on: http://localhost:8080/ :)"
    fi
}

function existImage() {
    [ "$(sudo docker images -q $name)" ]
}

function statusMicroservice() {
    if isRunning; then
        echo "Service is running :)"
    else
        echo "Service is not running :)"
    fi
}

function stopMicroservice() {
    if isRunning; then
        sudo docker stop $name
        echo "Service stopped! :)"
    else
        echo "Image it's not running! :)"
    fi
}

function isRunning() {
     [ "$(sudo docker ps -a -q -f name=$name)" ]
}

function setMicroserviceName() {
    name=$1
}

function setCommand() {
    command=$1
}

function runCommand() {
    case $command in 
    start)
        startMicroservice
    ;;
    status)
        statusMicroservice
    ;;
    stop)
        stopMicroservice
    ;;
    *)
        echo "Invalid command! :("
    esac
}

setCommand $1
setMicroserviceName $2
runCommand