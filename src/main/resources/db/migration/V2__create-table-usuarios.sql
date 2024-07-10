CREATE TABLE usuarios (
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    login varchar(100) not null UNIQUE,
    contrasena varchar(300) not null,
    primary key(id)

);
