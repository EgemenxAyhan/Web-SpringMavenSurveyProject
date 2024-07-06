create table person(id identity primary key, 
                    name varchar(50), 
                    surname varchar(50), 
                    dateField date,
                    email VARCHAR(255) NOT NULL,
                    age INT NOT NULL,
                    date_field DATE NOT NULL,
                    role VARCHAR(255) NOT NULL,
                    recommend VARCHAR(255) NOT NULL);