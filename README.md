# Test for DB -> Spring -> webui
Small skeleton project for basic Spring project with a connection Postgres DB

## Docker setup

1. create data container: `docker create -v /var/lib/postgresql/data --name PostgresData alpine`
2. run postgres container with data container: `docker run --name local-postgres -e POSTGRES_PASSWORD=password -d --volumes-from PostgresData -p 5432:5432 postgres`
3. start spring: `gradle bootRun`
	- DB gets initialized via liquibase
