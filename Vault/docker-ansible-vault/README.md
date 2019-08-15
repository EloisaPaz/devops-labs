# Vault

## Docker 
- To build the image use: 

         docker build -t vault .

- To run the container use: 

        docker run -p 8088:8088 vault

## Ansible and Jenkins 

### Jenkins configuration:

- Plugin used:  
` Ansible`

- Credentials needed: 
    
    - git_credentials: A "User with password" credentials configuration.

    - vault_password: A "Secret text" credentials with the vault password given when the ansible-vaulted is created.

    - system_credentials: Your system credentials, required to run `ansiblePlaybook` of Ansible plugin.

#### Encrypted file configuration

- Create a encrypted file in Jenkins directory with `ansible-vault create /var/lib/jenkins/secrets.yml`

- Choose the vault password

- Edit the file opened with the `ansible_become_pass: "<system_credentials>"`

- Configure Jenkins as owner of Jenkins path and vault path with `chown -R jenkins /var/lib/jenkins/ /usr/local/bin/`

#### Pipeline configuration

- Create a pipeline job, copy and paste the Jenkinsfile script inside the Jenkins/vault paste