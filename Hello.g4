/**
 * Define a grammar called Hello
 */
grammar Hello;

prog : def_app ';' def_nam ';' crud;

def_app : definicao_app;
def_nam : definicao_nam;
definicao_app : VALOR;
definicao_nam : VALOR;
crud : 'CRIAR CRUD [' VALOR ']' '[' comandos ']';
comandos : comando | ;
comando : novo_campo comandos ;
novo_campo : nome tipo requerido opcional;

nome : 'NOME_CAMPO[' VALOR ']';
tipo : '+ TIPO_CAMPO[' tipo_campo ']' ;
tipo_campo : 'string' | 'texto' | 'inteiro' | 'decimal' | 'data' | 'boolean' ;
requerido : '+ REQUERIDO' | ;

opcional : padrao | nao_lista;
padrao :  '+ DEFAULT[' VALOR ']' | ;
nao_lista :  '+ NAO_LISTA' | ;

VALOR : ('a'..'z')+ ; // Aqui vai ter que permitir numeros

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
