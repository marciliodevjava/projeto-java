CREATE TABLE cliente(
    id bigint(30) not null auto_increment,
    nome varchar(150) not null,
    cpf_cnpj varchar(16) not null,
    rg varchar(16) not null,
    data date not null,
    ddd int(3) not null,
    telefone varchar(9) not null,
    email varchar(150) not null,
    status_cliente varchar(20) not null
    PRIMARY KEY (id)
)