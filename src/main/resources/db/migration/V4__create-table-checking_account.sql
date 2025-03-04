CREATE TABLE checking_account (
                                  account_number INT PRIMARY KEY,
                                  fixed_interest DECIMAL(5,2) DEFAULT 0.015 NOT NULL,
                                  CONSTRAINT fk_checking_account FOREIGN KEY (account_number) REFERENCES account(account_number) ON DELETE CASCADE
);