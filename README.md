# Test for DB -> Spring -> webui

## Docker setup

1. create data container: `docker create -v /var/lib/postgresql/data --name PostgresData alpine`
2. run postres container with data container: `docker run --name local-postgres -e POSTGRES_PASSWORD=<the_password> -d --volumes-from PostgresData postgres`
   1. connect to db and create databe if it doesn't exist
   2. create tables (example see `create.sql` in Database)
