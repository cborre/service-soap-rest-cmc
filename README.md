# Spring Web Services (SOAP) using Spring Boot example

- `http://localhost:8091/soapWS` - request xml is under `src/main/resource/user-request.xml`

Para ejecutar el proyecto "service-soap-rest-cmc" debe seguir los siguientes pasos:

1. Abra MySQL Workbench.

1. Para crear la base de datos, Abra un New Query Tab y ejecute el siguiente script

CREATE SCHEMA `prueba_cmc`;

2. Seleccione la base de datos creada, en este caso seria "prueba_cmc". Abra un New Query Tab y ejecute el siguiente script, para crear la tabla de usuarios.

CREATE TABLE `prueba_cmc`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `code_user` VARCHAR(45) NULL,
  `date_auth` VARCHAR(45) NULL,
  `hour_auth` VARCHAR(45) NULL,
  `intent` INT NULL,
  PRIMARY KEY (`id`));

3. Abra un New Query Tab y ejecute los siguientes script

INSERT INTO `prueba_cmc`.`users` (`name`, `phone`, `email`, `codeUser`, `dateAuth`, `hourAuth`, `intent`) VALUES ('Carlos Borre', '3125236984', 'cborre@gmail.com', 'CB-123', '2021/01/21', '07:50:40', '1');
INSERT INTO `prueba_cmc`.`users` (`name`, `phone`, `email`, `codeUser`, `dateAuth`, `hourAuth`, `intent`) VALUES ('Jessica Martinez', '3116548965', 'jmartinez@gmail.com', 'JM-789', '2020/05/15', '05:06:12', '0');
INSERT INTO `prueba_cmc`.`users` (`name`, `phone`, `email`, `codeUser`, `dateAuth`, `hourAuth`, `intent`) VALUES ('Raul Lopez', '3175836242', 'rlopez@gmail.com', 'RL-456', '2021/06/17', '08:30:25', '1');
INSERT INTO `prueba_cmc`.`users` (`name`, `phone`, `email`, `codeUser`, `dateAuth`, `hourAuth`, `intent`) VALUES ('Maria Ramirez', '312569352', 'mramirez@gmail.com', 'MR-324', '2021/02/25', '09:25:10', '0');

4. Ejecute el proyecto en IntellJ Idea
