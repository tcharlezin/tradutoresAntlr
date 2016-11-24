/**
 * Define a grammar called Hello
 */
grammar Hello;

prog : def_app ';' crud;

def_app : definicao_app;
definicao_app : 'PASTA_APLICACAO = \'' VALOR '\'';
crud : 'CRIAR CRUD [\'' nome_entidade '\']' '{' comandos '}';
nome_entidade : VALOR;
comandos : comando | ;
comando : novo_campo ';' comandos ;
novo_campo : def_nome_campo tipo campo_requerido nao_lista padrao;

def_nome_campo : 'NOME_CAMPO[\'' nome_campo '\']';
nome_campo : VALOR;
tipo : '+TIPO_CAMPO[\'' tipo_campo '\']' ;
tipo_campo : 'string' | 'texto' | 'inteiro' | 'decimal' | 'data' | 'boolean' ;
campo_requerido : '+ REQUERIDO' | ;

nao_lista :  '+ NAO_LISTA' | ;

padrao :  '+ DEFAULT[\'' valor_default '\']' | ;
valor_default : VALOR ;

VALOR : [0-9a-zA-Z:\\_]+ ; // Aqui vai ter que permitir numeros

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
