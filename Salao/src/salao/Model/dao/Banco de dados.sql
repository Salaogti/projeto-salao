/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  KAIQUE
 * Created: 19/06/2018
 */

/* BANCO DE DADOS PODE HAVER ALTERAÇÃO ENTÃO ATUALIZAR O MESMO
*/

# BANCO DE DADOS PODE HAVER ALTERAÇÃO ENTÃO ATUALIZAR O MESMO

create database Salao;
use Salao;

create table cliente (
id_cli int not null, # vai ser o cpf
nome_cli varchar(45) not null,
tel_cli varchar(45) not null,
email_cli varchar (45) not null,
datanasc_cli date not null);

create table endereco (
cep_ed varchar(45) not null,
rua_ed varchar(45) not null,
bairro_ed varchar(45) not null,
cidadeuf_ed varchar(45) not null,
num_ed varchar(45) not null,
comp_ed varchar(45)not null);

create table servico (
id_ser int not null,
nome_ser varchar(45) not null,
tempo_ser time not null,
valor_ser double not null);


create table agendamento (
id_agd int not null, # Chave primaria dessa tabela
idsolserv_agd int not null, # Chave estrangeira da tabela > solicitacao_servicos <
idcli_agd int not null,# Chave estrangeira do cliente
nomecli_agd varchar(45) not null, # nome do cliente que agendou
data_agd varchar (45) not null);# está varchar para conversão

create table solicitacao_servicos (
id_sol int not null, # Chave primaria dessa tabela
idser_sol int not null, # Chave estrangeira da tabela > servico <
qtd_sol int not null, # quantidade dos serviços
subtotal_sol double not null);# valor da quantidade dos serviços