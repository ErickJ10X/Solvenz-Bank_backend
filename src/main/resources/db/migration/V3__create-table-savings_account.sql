CREATE TABLE savings_account (
                                 account_number INT PRIMARY KEY,
                                 variable_interest DECIMAL(5,2) NOT NULL,
                                 minimum_balance DECIMAL(15,2) NOT NULL,
                                 CONSTRAINT fk_savings_account FOREIGN KEY (account_number) REFERENCES account(account_number) ON DELETE CASCADE
);