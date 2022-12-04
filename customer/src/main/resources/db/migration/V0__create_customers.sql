CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;

CREATE TABLE customers (
    id NUMERIC NOT NULL CONSTRAINT order_pk PRIMARY KEY DEFAULT nextval('hibernate_sequence'),
    name VARCHAR(200) NOT NULL
);

INSERT INTO customers (name) VALUES ('Andrey Breslav'),
                                    ('Evgeniy Borisov'),
                                    ('Roman Elizarov'),
                                    ('Kate Petrova'),
                                    ('Max Borzenko')
