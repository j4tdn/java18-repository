-- create table payment_method
DROP TABLE IF EXISTS `PAYMENT_METHOD`;
CREATE TABLE `PAYMENT_METHOD`
(
	ID 			INT,
    `DESC` 		VARCHAR(100)	NOT NULL,
    CONSTRAINT PK_PAYMENT_METHOD PRIMARY KEY (ID)
);

-- create table order
DROP TABLE IF EXISTS `ORDER`;
CREATE TABLE `ORDER`
(
	ID 					INT,
    DELIVERY_ADDRESS 	TEXT 		NOT NULL,
    TOTAL_FEE 			DOUBLE 		NOT NULL,
    DELIVERY_DATE 		DATE,
    DELIVERY_FEE 		DOUBLE,
    CREATED_AT 			DATETIME DEFAULT CURRENT_TIMESTAMP(),
    CUSTOMER_ID 		INT 		NOT NULL,
    PAYMENT_METHOD_ID 	INT			NOT NULL,
    CONSTRAINT PK_ORDER PRIMARY KEY (ID),
    CONSTRAINT FK_ORDER_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID),
    CONSTRAINT FK_ORDER_PAYMENT_METHOD FOREIGN KEY (PAYMENT_METHOD_ID) REFERENCES PAYMENT_METHOD(ID)
);

-- create table order_detail
DROP TABLE IF EXISTS `ORDER_DETAIL`;
CREATE TABLE `ORDER_DETAIL`
(
	AMOUNT 			INT 		NOT NULL,
	ORDER_ID 		INT,
    ITEM_ID 		INT,
    CONSTRAINT PK_ORDER_DETAIL PRIMARY KEY (ORDER_ID, ITEM_ID),
    CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT FK_ORDER_DETAIL_ITEM FOREIGN KEY (ITEM_ID) REFERENCES ITEM(ID)
);

-- create table bill
DROP TABLE IF EXISTS `BILL`;
CREATE TABLE `BILL`
(
	ID 				INT,
    CREATED_AT 		DATETIME DEFAULT CURRENT_TIMESTAMP(),
    ORDER_ID 		INT 		NOT NULL,
    CONSTRAINT PK_BILL PRIMARY KEY (ID),
    CONSTRAINT UNIQUE_ORDER_ID UNIQUE (ORDER_ID)
);

ALTER TABLE `BILL`
ADD CONSTRAINT FK_BILL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID)
