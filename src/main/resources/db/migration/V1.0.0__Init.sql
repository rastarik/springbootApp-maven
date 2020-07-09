CREATE TABLE PRODUCTS (
    reference   INT IDENTITY(1000,1) PRIMARY KEY,
    code     VARCHAR (50)  UNIQUE,
    price       DECIMAL(18,2),
    quantity    INT NOT NULL,
    description VARCHAR (50)
);

CREATE INDEX idx_product_table
        ON PRODUCTS(code);
