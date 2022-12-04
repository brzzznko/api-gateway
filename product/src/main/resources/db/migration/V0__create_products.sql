CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;

CREATE TABLE products (
    id NUMERIC NOT NULL CONSTRAINT order_pk PRIMARY KEY DEFAULT nextval('hibernate_sequence'),
    title VARCHAR(200) NOT NULL
);

INSERT INTO products (title) VALUES ('t-shirt'),
                                    ('boots'),
                                    ('jeans'),
                                    ('coat'),
                                    ('dress'),
                                    ('shoes'),
                                    ('skirt'),
                                    ('jacket'),
                                    ('pants');
