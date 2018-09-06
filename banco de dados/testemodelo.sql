----- Plano mensalidade
--Inclusao
insert into plano_mensalidade (descricao, valor, dia_vencimento, periodicidade, ativo) values ('Sempre ao Seu lado', 20.00, 2, 'mensal', true)

--Listar
select * from plano_mensalidade;

select * from plano_mensalidade where codigo = 1;

select * from plano_mensalidade where codigo = 2 and descricao = 'Sempre ao Seu lado';

select * from plano_mensalidade where descricao = 'Sempre ao Seu lado';
--Update
update plano_mensalidade set ativo = false where codigo = 1;

--Delete
delete from plano_mensalidade where codigo = 1 

-----Posiçoes
--Inclusao 
insert into posicao (nome_posicao, descricao, ativo) values ('atacante', 'centro-avante', true); 

--Listar
select * from posicao;

select * from posicao where codigo = 1;

select * from posicao where nome_posicao = 'atacante';

SELECT * FROM POSICAO WHERE  ATIVO = TRUE;

-----Tipo Membro 
--Inclusao
insert into tipo_membro (descricao, status, mensalidade) values ('socio', true , true);

--Listar
select * from tipo_membro;

-----Natureza 
--Inclusao
insert into natureza_conta (descricao, status) values ('mensalidade', true );

--Listar
select * from natureza_conta;



