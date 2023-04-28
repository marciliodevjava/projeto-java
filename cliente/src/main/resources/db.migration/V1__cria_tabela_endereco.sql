CREATE TABLE cliente(
    id bigint(30) not null auto_increment,
    lougradouro varchar(150) not null,
    numero varchar(5) not null,
    bairro varchar(50) not null,
    uf varchar(2) not null,
    cep varchar(8) not null,
    complemento varchar(50) not null,
    cliente_id bigint(30) not null,
    PRIMARY KEY (id),
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
)