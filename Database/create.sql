-- simple table example

CREATE TABLE Persons (
    Personid bigint GENERATED ALWAYS AS IDENTITY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255)
);

INSERT into Persons (firstname, lastname)
VALUEs ('bob', 'builder');
