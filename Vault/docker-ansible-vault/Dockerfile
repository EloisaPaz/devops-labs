FROM golang
EXPOSE 8088
RUN apt update && \
apt install unzip && \
curl https://releases.hashicorp.com/vault/1.0.1/vault_1.0.1_linux_amd64.zip -O vault.zip  && \
unzip vault.zip && \
mv vault /usr/local/bin/
ENTRYPOINT ["vault server -dev"]
