-- patchset3 --> CUSTOMER
CREATE TABLE CUSTOMER(
	ID            INT,
	`NAME`        VARCHAR(100) NOT NULL,
	DATE_OF_BIRTH DATE         NOT NULL,
	ADDRESS       TEXT,
	PHONE         VARCHAR(20),
	GENDER        BIT          NOT NULL, -- expect 0,1
	EMAIL         VARCHAR(100) NOT NULL, -- account
	`PASSWORD`    VARCHAR(100) NOT NULL,
	CONSTRAINT PK_CUSTOMER PRIMARY KEY (ID)
);