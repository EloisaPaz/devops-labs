# Telemetry / Observability


## For start:

```docker-compose up```

### Check the follow location:

```http://localhost:5601```

### Create a new Index Pattern for the collectD metrics

- Define the index pattern with the name: ```calculator```

### You can see the metrics on Kibana Discover:

```http://localhost:5601/app/kibana#/discover```
____

### The calculator will be available in the following url

#### For instructions of use:

- http://localhost:8088/calc/

#### For additions:

- http://localhost:8088/calc/sum/{firstNum}/{secondNum}

#### For subtractions:

- http://localhost:8088/calc/sub/{firstNum}/{secondNum}

#### For multiplications:

- http://localhost:8088/calc/mul/{firstNum}/{secondNum}

#### For divisions:

- http://localhost:8088/calc/div/{firstNum}/{secondNum}

#### You can also check the history through the following url:

- http://localhost:8088/calc/history
