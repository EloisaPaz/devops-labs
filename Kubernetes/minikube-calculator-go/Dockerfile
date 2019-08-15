FROM golang
EXPOSE 8080
RUN mkdir /calc 
ADD calculator.go /calc
WORKDIR /calc
RUN go get -u github.com/gorilla/mux
RUN go build -o calculator calculator.go
CMD ["./calculator"]