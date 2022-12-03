CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;

CREATE TABLE orders (
    id NUMERIC NOT NULL CONSTRAINT order_pk PRIMARY KEY DEFAULT nextval('hibernate_sequence'),
    product_id NUMERIC NOT NULL,
    client_id NUMERIC NOT NULL
);

INSERT INTO orders (product_id, client_id) VALUES (1, 1),
                                                  (2, 1),
                                                  (5, 1),
                                                  (5, 2),
                                                  (1, 2),
                                                  (5, 2),
                                                  (5, 3),
                                                  (4, 3),
                                                  (3, 3);
