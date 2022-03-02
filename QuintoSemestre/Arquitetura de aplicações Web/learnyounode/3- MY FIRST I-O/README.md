# ENGLISH

## LEARN YOU THE NODE.JS FOR MUCH WIN!

## MY FIRST I/O! (Exercise 3 of 13)

 Create a file named my-first-io.js.

 Write a program that uses a single synchronous filesystem operation to
 read a file and print the number of newlines (\n) it contains to the
 console (stdout), similar to running cat file | wc -l.

 The full path to the file to read will be provided as the first
 command-line argument (i.e., process.argv[2]). You do not need to make
 your own test file.

─────────────────────────────────────────────────────────────────────────────

## HINTS

 To perform a filesystem operation you are going to need the fs module from
 the Node core library. To load this kind of module, or any other "global"
 module, use the following incantation:

    const fs = require('fs')

 Now you have the full fs module available in a variable named fs.

 All synchronous (or blocking) filesystem methods in the fs module end with
 'Sync'. To read a file, you'll need to use
 fs.readFileSync('/path/to/file'). This method will return a Buffer object
 containing the complete contents of the file.

 Documentation on the fs module can be found by pointing your browser here:
 file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
 odejs\fs.html

 Buffer objects are Node's way of efficiently representing arbitrary arrays
 of data, whether it be ascii, binary or some other format. Buffer objects
 can be converted to strings by simply calling the toString() method on
 them. e.g. const str = buf.toString().

 Documentation on Buffers can be found by pointing your browser here:
 file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
 odejs\buffer.html

 If you're looking for an easy way to count the number of newlines in a
 string, recall that a JavaScript String can be .split() into an array of
 substrings and that '\n' can be used as a delimiter. Note that the test
 file does not have a newline character ('\n') at the end of the last line,
 so using this method you'll end up with an array that has one more element
 than the number of newlines.

 Check to see if your program is correct by running this command:

    $ learnyounode verify my-first-io.js

─────────────────────────────────────────────────────────────────────────────

  » To print these instructions again, run: learnyounode print
  » To execute your program in a test environment, run: learnyounode run                                               
    program.js
  » To verify your program, run: learnyounode verify program.js
  » For help run: learnyounode help

  # PORTUGUESE

  ## APRENDA VOCÊ O NODE.JS PARA MUITA VITÓRIA!

## MINHA PRIMEIRA E/S! (Exercício 3 de 13)

 Crie um arquivo chamado my-first-io.js.

 Escreva um programa que use uma única operação síncrona do sistema de arquivos para
 ler um arquivo e imprimir o número de novas linhas (\n) que ele contém no
 console (stdout), semelhante à execução do arquivo cat | wc -l.

 O caminho completo para o arquivo a ser lido será fornecido como o primeiro
 argumento de linha de comando (ou seja, process.argv[2]). Você não precisa fazer
 seu próprio arquivo de teste.

 ─────────────────────────────────────────────────────────────────────────────
 
## DICAS

 Para executar uma operação do sistema de arquivos, você precisará do módulo fs do
 a biblioteca principal do Node. Para carregar este tipo de módulo, ou qualquer outro "global"
 módulo, use o seguinte encantamento:

    const fs = require('fs')

 Agora você tem o módulo fs completo disponível em uma variável chamada fs.

 Todos os métodos de sistema de arquivos síncronos (ou de bloqueio) no módulo fs terminam com
 'Sincronizar'. Para ler um arquivo, você precisará usar
 fs.readFileSync('/caminho/para/arquivo'). Este método retornará um objeto Buffer
 contendo o conteúdo completo do arquivo.

 A documentação sobre o módulo fs pode ser encontrada apontando seu navegador aqui:
 file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
 odejs\fs.html

 Objetos de buffer são a maneira do Node representar eficientemente arrays arbitrários
 de dados, seja ASCII, binário ou algum outro formato. Objetos de buffer
 pode ser convertido em strings simplesmente chamando o método toString() no
 eles. por exemplo. const str = buf.toString().

 A documentação sobre Buffers pode ser encontrada apontando seu navegador aqui:
 file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
 odejs\buffer.html

 Se você está procurando uma maneira fácil de contar o número de novas linhas em um
 string, lembre-se de que uma String JavaScript pode ser .split() em um array de
 substrings e que '\n' pode ser usado como delimitador. Observe que o teste
 arquivo não tem um caractere de nova linha ('\n') no final da última linha,
 então usando este método você vai acabar com um array que tem mais um elemento
 do que o número de novas linhas.

 Verifique se o seu programa está correto executando este comando:

    $ learnyounode verificar my-first-io.js

  ─────────────────────────────────────────────────────────────────────────────

  » Para imprimir essas instruções novamente, execute: learnyounode print
  » Para executar seu programa em um ambiente de teste, execute: learnyounode run
    program.js
  » Para verificar seu programa, execute: learnyounode verify program.js
  » Para obter ajuda, execute: learnyounode help