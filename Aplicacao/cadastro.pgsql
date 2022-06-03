CREATE TABLE cadastro (
    id serial PRIMARY KEY,
    email CHAR(60),
    nome CHAR(60),
    senha CHAR(60),
    telefone CHAR(60),
    tipoSangue CHAR(2)
);


SELECT * FROM cadastro