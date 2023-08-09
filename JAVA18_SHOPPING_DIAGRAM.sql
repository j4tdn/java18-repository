-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`ITEM_GROUP`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ITEM_GROUP` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ITEM_GROUP` (
  `ID` INT NOT NULL,
  `NAME` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ITEM`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ITEM` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ITEM` (
  `ID` INT NOT NULL,
  `NAME` VARCHAR(45) NULL,
  `COLOR` VARCHAR(45) NULL,
  `LAST_UPDATE_AT` VARCHAR(45) NULL,
  `ITEM_GROUP_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_ITEM_ITEM_GROUP_idx` (`ITEM_GROUP_ID` ASC) VISIBLE,
  CONSTRAINT `fk_ITEM_ITEM_GROUP`
    FOREIGN KEY (`ITEM_GROUP_ID`)
    REFERENCES `mydb`.`ITEM_GROUP` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
