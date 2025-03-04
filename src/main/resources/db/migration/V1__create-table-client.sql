CREATE TABLE client (
                        client_id SERIAL PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        address VARCHAR(255),
                        phone VARCHAR(20)
);