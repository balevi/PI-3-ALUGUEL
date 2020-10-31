SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `bancopi3` DEFAULT CHARACTER SET latin1 ;
USE `bancopi3` ;

-- -----------------------------------------------------
-- Table `bancopi3`.`usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bancopi3`.`usuario` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `login` VARCHAR(45) NOT NULL ,
  `senha` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bancopi3`.`cliente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bancopi3`.`cliente` (
  `cpf` INT(11) NOT NULL ,
  `nomecliente` VARCHAR(45) NULL DEFAULT NULL ,
  `endereco` VARCHAR(99) NULL DEFAULT NULL ,
  `email` VARCHAR(45) NULL DEFAULT NULL ,
  `uf` VARCHAR(4) NULL DEFAULT NULL ,
  `telefone` VARCHAR(45) NULL DEFAULT NULL ,
  `usuario_id` INT(11) NOT NULL ,
  PRIMARY KEY (`cpf`) ,
  INDEX `fk_cliente_usuario_idx` (`usuario_id` ASC) ,
  CONSTRAINT `fk_cliente_usuario`
    FOREIGN KEY (`usuario_id` )
    REFERENCES `bancopi3`.`usuario` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bancopi3`.`veiculo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bancopi3`.`veiculo` (
  `numero` INT(11) NOT NULL ,
  `placa` VARCHAR(45) NULL DEFAULT NULL ,
  `fabricante` VARCHAR(45) NULL DEFAULT NULL ,
  `modelo` VARCHAR(45) NULL DEFAULT NULL ,
  `anomodelo` VARCHAR(45) NULL DEFAULT NULL ,
  `qtdportas` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`numero`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `bancopi3`.`aluguel`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bancopi3`.`aluguel` (
  `cliente_cpf` INT(11) NOT NULL ,
  `veiculo_numero` INT(11) NOT NULL ,
  `idaluguel` INT(11) NOT NULL ,
  `veiculo` VARCHAR(45) NULL DEFAULT NULL ,
  `dataaluguel` VARCHAR(45) NULL DEFAULT NULL ,
  `dataentrega` VARCHAR(45) NULL DEFAULT NULL ,
  `cliente` VARCHAR(45) NULL DEFAULT NULL ,
  `entregue` VARCHAR(45) NULL DEFAULT NULL ,
  `observacao` VARCHAR(45) NULL DEFAULT NULL ,
  `valorpago` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`cliente_cpf`, `veiculo_numero`, `idaluguel`) ,
  INDEX `fk_cliente_has_veiculo_veiculo1_idx` (`veiculo_numero` ASC) ,
  INDEX `fk_cliente_has_veiculo_cliente1_idx` (`cliente_cpf` ASC) ,
  CONSTRAINT `fk_cliente_has_veiculo_cliente1`
    FOREIGN KEY (`cliente_cpf` )
    REFERENCES `bancopi3`.`cliente` (`cpf` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_veiculo_veiculo1`
    FOREIGN KEY (`veiculo_numero` )
    REFERENCES `bancopi3`.`veiculo` (`numero` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

USE `bancopi3` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
