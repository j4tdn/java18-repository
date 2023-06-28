
-- create table payment_method
CREATE TABLE PAYMENT_METHOD 
(
	ID INT,
    `DES` VARCHAR(100),
    CONSTRAINT PK_PAYMENT_METHOD PRIMARY KEY (ID)
);

-- create table order
CREATE TABLE `ORDER`
(
	ID INT,
	DELIVERY_ADDRESS TEXT NOT NULL,
	TOTAL_FEE DOUBLE NOT NULL,
	DELIVERY_DATE DATE,
	DELIVERY_FEE DOUBLE,
	CREATED_AT DATETIME DEFAULT current_timestamp,
    CUSTOMER_ID INT NOT NULL,
	PAYMENT_METHOD_ID INT NOT NULL,
	CONSTRAINT PK_ORDER PRIMARY KEY (ID),
    CONSTRAINT FK_ORDER_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID),
	CONSTRAINT FK_ORDER_PAYMENT_METHOD FOREIGN KEY (PAYMENT_METHOD_ID) REFERENCES PAYMENT_METHOD(ID)
);

-- create table order detail
CREATE TABLE ORDER_DETAIL
(
	ORDER_ID INT,
    ITEM_ID INT,
    AMOUNT INT NOT NULL,
    CONSTRAINT PK_ORDER_DETAIL PRIMARY KEY (ORDER_ID, ITEM_ID),
    CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_DETAIL_ITEM FOREIGN KEY (ITEM_ID) REFERENCES ITEM(ID)
);

-- create table bill
CREATE TABLE BILL
(
	ID INT,
    CREATED_AT DATETIME DEFAULT current_timestamp(),
    ORDER_ID INT NOT NULL UNIQUE,
    CONSTRAINT PK_BILL PRIMARY KEY (ID),
    CONSTRAINT FK_BILL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID)
)