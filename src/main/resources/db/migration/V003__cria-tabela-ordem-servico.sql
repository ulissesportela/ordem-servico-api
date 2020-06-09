create table ordem_servico (
	id  SERIAL PRIMARY KEY,
    cliente_id bigint not null,
    descricao text not null,
    preco decimal(10,2) not null,
    status varchar(20) not null,
    data_abertura TIMESTAMP not null,
    data_finalizacao TIMESTAMP
);

alter table ordem_servico add constraint fk_ordem_servico_cliente
foreign key (cliente_id) references cliente (id);