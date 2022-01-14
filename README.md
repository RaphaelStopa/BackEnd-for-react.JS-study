## Rodando o projeto

Este projeto foi desenvolvido, usando uma técnica para desenvolvimento ágil que usa um Docker de Mysql com migrations do liquibase. Para rodar o Docker use o comando abaixo:

```
docker-compose -p “project_raphael” -f src/main/docker/mysql.yml up -d
```
