CREATE TABLE account (
                         account_number SERIAL PRIMARY KEY,
                         balance DECIMAL(15,2) NOT NULL,
                         client_id INT NOT NULL,
                         CONSTRAINT fk_client FOREIGN KEY (client_id) REFERENCES client(client_id) ON DELETE CASCADE
);