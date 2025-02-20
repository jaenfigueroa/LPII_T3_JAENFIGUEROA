```sql
CREATE DATABASE BD_JAENFIGUEROA_T3;

USE BD_JAENFIGUEROA_T3;

CREATE TABLE TBL_MEDICOT3 (
    IDMEDICOT3 INT AUTO_INCREMENT PRIMARY KEY,
    NOMBRET3 VARCHAR(255) NOT NULL,
    APELLIDOT3 VARCHAR(255) NOT NULL,
    EMAILT3 VARCHAR(255) NOT NULL,
    DNIT3 VARCHAR(255) NOT NULL,
    ESTADOCIVILT3 VARCHAR(255),
    FECHANACIMT3 DATE
);

INSERT INTO TBL_MEDICOT3 (NOMBRET3, APELLIDOT3, EMAILT3, DNIT3, ESTADOCIVILT3, FECHANACIMT3) VALUES
('Carlos', 'Gómez', 'carlos.gomez@mail.com', '12345678A', 'Soltero', '1985-04-12'),
('María', 'López', 'maria.lopez@mail.com', '87654321B', 'Casada', '1990-08-25'),
('Javier', 'Fernández', 'javier.fernandez@mail.com', '56781234C', 'Divorciado', '1978-02-10'),
('Ana', 'Martínez', 'ana.martinez@mail.com', '43218765D', 'Viudo', '1982-11-30'),
('Pedro', 'Sánchez', 'pedro.sanchez@mail.com', '98123456E', 'Soltero', '1995-06-18');

select * from TBL_MEDICOT3;
```
