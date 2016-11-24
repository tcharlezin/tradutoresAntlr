# Trabalho Final de Tradutores - 2016/02

### Pré requisitos
* antlr4
* java
* javac

### Instalando Antlr4
Para instalar e configurar corretamente o antlr4

```bash
cd /usr/local/lib
wget http://www.antlr.org/download/antlr-4.5.3-complete.jar
export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"
alias antlr4='java -jar /user/local/lib/antlr-4.5.3-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

### Building
* `git clone <url do repositorio>`
* Troque para a pasta recém criada
* `antlr4 -o src Hello.g4`
* `javac -d build/classes src/*.java`

O diretório `build/classes` deve existir previamente.
