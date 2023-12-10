-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;


INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES   (1, 'Joao Silva', 'joao123', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'joao@email.com', 2, '123.456.789-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Maria Oliveira', 'maria456', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'maria@email.com', 2, '987.654.321-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Carlos Santos', 'carlos789', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'carlos@email.com', 2, '456.789.123-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Ana Pereira', 'ana321', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'ana@email.com', 1, '789.123.456-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Lucas Souza', 'lucas654', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'lucas@email.com', 2, '321.654.987-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Isabela Lima', 'isabela987', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'isabela@email.com', 1, '654.321.789-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Pedro Almeida', 'pedro555', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'pedro@email.com', 1, '987.789.654-00');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Mariana Costa', 'mariana111', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'mariana@email.com', 1, '111.222.333-44');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Felipe Rocha', 'felipe222', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'felipe@email.com', 1, '555.666.777-88');
  INSERT INTO usuario (version, nome, login, senha, email, perfil, cpf) VALUES (1, 'Laura Martins', 'laura333', 'UTD+AWUM7xWFkmQV+0A76Z1At65WUe0yNG+HC/zdRauqPtv5XBnBJywgdfg+vb2oRK5ddlpXjLPFJu8M2zf3Bw==', 'laura@email.com', 2, '999.888.777-66');
 
insert into telefone (version,codigoArea, numero) values(1,'63', '999999999');
insert into telefone (version,codigoArea, numero) values(1,'62', '888888888');
insert into telefone (version,codigoArea, numero) values(1,'61', '777777777');
insert into telefone (version,codigoArea, numero) values(1,'55', '666666666');

insert into usuario_telefone (id_usuario, id_telefone) values(1, 1);
insert into usuario_telefone (id_usuario, id_telefone) values(1, 2);
insert into usuario_telefone (id_usuario, id_telefone) values(2, 3);
insert into usuario_telefone (id_usuario, id_telefone) values(2, 4);


INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo1', 'Descrição do Jogo1', 49.99, 100);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo2', 'Descrição do Jogo2', 29.99, 75);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES(1, 'Jogo3', 'Descrição do Jogo3', 39.99, 50);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo4', 'Descrição do Jogo4', 59.99, 120);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo5', 'Descrição do Jogo5', 19.99, 80);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo6', 'Descrição do Jogo6', 49.99, 90);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES(1, 'Jogo7', 'Descrição do Jogo7', 69.99, 60);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo8', 'Descrição do Jogo8', 24.99, 110);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo9', 'Descrição do Jogo9', 34.99, 70);
INSERT INTO jogo (version, nome, descricao, preco, estoque) VALUES (1, 'Jogo10', 'Descrição do Jogo10', 44.99, 85);

INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua A', 'Bairro A', '123', 'Complemento A', '12345-678');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua B', 'Bairro B', '456', 'Complemento B', '98765-432');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua C', 'Bairro C', '789', 'Complemento C', '11111-222');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua D', 'Bairro D', '101', 'Complemento D', '33333-444');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua E', 'Bairro E', '202', 'Complemento E', '55555-666');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua F', 'Bairro F', '303', 'Complemento F', '77777-888');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua G', 'Bairro G', '404', 'Complemento G', '99999-000');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua H', 'Bairro H', '505', 'Complemento H', '12345-678');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua I', 'Bairro I', '606', 'Complemento I', '98765-432');
INSERT INTO endereco (version,logradouro, bairro, numero, complemento, cep) VALUES  (1,'Rua J', 'Bairro J', '707', 'Complemento J', '11111-222');

