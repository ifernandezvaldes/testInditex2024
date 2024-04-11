DROP TABLE IF EXISTS CadenaGrupo CASCADE ;
DROP TABLE IF EXISTS Prices CASCADE ;

CREATE TABLE CadenaGrupo (
  BRAND_ID INT NOT NULL PRIMARY KEY,
  NAME_BRAND VARCHAR(255) NOT NULL
);


CREATE TABLE Prices (
  BRAND_ID INT NOT NULL,
  START_DATE DATETIME NOT NULL,
  END_DATE DATETIME NOT NULL,
  PRICE_LIST INT NOT NULL,
  PRODUCT_ID INT NOT NULL,
  PRIORITY INT NOT NULL,
  PRICE DECIMAL(10,2) NOT NULL,
  CURR CHAR(3) NOT NULL,
  CONSTRAINT FK_Prices_CadenaGrupo FOREIGN KEY (BRAND_ID) REFERENCES CadenaGrupo(BRAND_ID)
);

ALTER TABLE Prices
    ADD COLUMN PRICE_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY;

