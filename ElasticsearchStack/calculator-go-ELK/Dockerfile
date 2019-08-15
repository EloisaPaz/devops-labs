FROM golang:latest
RUN apt-get update && apt-get install -y collectd collectd-utils && \
go get -u github.com/gorilla/mux
RUN mkdir /calc 
WORKDIR /calc
ADD calculator.go ./
ADD run.sh ./
ADD config/collectd.conf /etc/collectd/
RUN go build -o ./calculator ./calculator.go
CMD ["sh", "run.sh"]