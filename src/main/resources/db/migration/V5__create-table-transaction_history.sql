CREATE TABLE transaction_history (
                                     transaction_id SERIAL PRIMARY KEY,
                                     account_number INT NOT NULL,
                                     details TEXT NOT NULL,
                                     transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                     CONSTRAINT fk_transaction_history FOREIGN KEY (account_number) REFERENCES account(account_number) ON DELETE CASCADE
);