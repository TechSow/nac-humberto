create table TS_T_USUARIO(
ID_USUARIO INTEGER primary key,
EMAIL VARCHAR2(80),
SENHA VARCHAR2(150)
);

CREATE TABLE TS_T_PESSOA(
ID_PESSOA number(38) primary key,
NOME VARCHAR2(20),
SOBRENOME VARCHAR2(30),
IDADE NUMBER(2),
ID_USUARIO INTEGER REFERENCES TS_T_USUARIO(ID_USUARIO)
);