# Kubernetes - Minikube

### Configuration: 

- Plugin used:  
`kubernetes` 

#### Jenkins Kubernetes Plugin configuration

- Create a Jenkins Credential of type "certificate" named `kubernetes-certificate` 
     - Use `secret` as the password.
     - Upload the `~/.minikube/minikube.pfx` certificate.

- Kubernetes requires a server certificate key. The key for Minikube cluster can be found in `~/.minikube/ca.crt`

#### Jenkins pipeline 

- First run the minikube using:  
    
        minikube start

- Create a Jenkins pipeline, copy and paste the jenkinsfile script 

- The calculator will be available using `minikube service calculator` command, this will open `https://192.168.99.100:<service_port>` on the browser
