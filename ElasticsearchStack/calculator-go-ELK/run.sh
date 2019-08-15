#!/bin/bash

startCollectd() {
    /etc/init.d/collectd start
}

startCalculator() {
    ./calculator
}

startCollectd
startCalculator