
 # ENGLISH

 ## LEARN YOU THE NODE.JS FOR MUCH WIN!

 ## MY FIRST ASYNC I/O! (Exercise 4 of 13)

  Create a file named my-first-async-io.js.

  Write a program that uses a single asynchronous filesystem operation to
  read a file and print the number of newlines it contains to the console
  (stdout), similar to running cat file | wc -l.

  The full path to the file to read will be provided as the first
  command-line argument.

 ─────────────────────────────────────────────────────────────────────────────

 # HINTS

  The solution to this problem is almost the same as the previous problem
  except you must now do it the Node.js way: asynchronous.

  Instead of fs.readFileSync() you will want to use fs.readFile() and
  instead of using the return value of this method you need to collect the
  value from a callback function that you pass in as the second argument. To
  learn more about callbacks, check out:
  (https://github.com/maxogden/art-of-node#callbacks).

  Remember that idiomatic Node.js callbacks normally have the signature:

     function callback (err, data) { /* ... */ }

  so you can check if an error occurred by checking whether the first
  argument is truthy. If there is no error, you should have your Buffer
  object as the second argument. As with readFile(), you can supply 'utf8'
  as the second argument and put the callback as the third argument and you
  will get a String instead of a Buffer.

  Documentation on the fs module can be found by pointing your browser here:
  file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
  odejs\fs.html

  Check to see if your program is correct by running this command:

     $ learnyounode verify my-first-async-io.js

 ─────────────────────────────────────────────────────────────────────────────

   » To print these instructions again, run: learnyounode print
   » To execute your program in a test environment, run: learnyounode run                                               
     program.js
   » To verify your program, run: learnyounode verify program.js
   » For help run: learnyounode help

# PORTUGUESE

## APRENDA VOCÊ O NODE.JS PARA MUITA VITÓRIA!

 ## MINHA PRIMEIRA E/S ASYNC! (Exercício 4 de 13)

  Crie um arquivo chamado my-first-async-io.js.

  Escreva um programa que use uma única operação assíncrona do sistema de arquivos para
  lê um arquivo e imprime o número de novas linhas que ele contém no console
  (stdout), semelhante à execução do arquivo cat | wc -l.

  O caminho completo para o arquivo a ser lido será fornecido como o primeiro
  argumento de linha de comando.

─────────────────────────────────────────────────────────────────────────────

# DICAS

  A solução para este problema é quase a mesma do problema anterior
  exceto que agora você deve fazer isso da maneira Node.js: assíncrona.

  Em vez de fs.readFileSync() você vai querer usar fs.readFile() e
  em vez de usar o valor de retorno desse método, você precisa coletar o
  valor de uma função de retorno de chamada que você passa como segundo argumento. Para
  saiba mais sobre callbacks, confira:
  (https://github.com/maxogden/art-of-node#callbacks).

  Lembre-se de que os callbacks idiomáticos do Node.js normalmente têm a assinatura:

     retorno de chamada de função (err, dados) { /* ... */ }

  para que você possa verificar se ocorreu um erro verificando se o primeiro
  argumento é verdadeiro. Se não houver erro, você deve ter seu Buffer
  object como o segundo argumento. Assim como readFile(), você pode fornecer 'utf8'
  como o segundo argumento e coloque o callback como o terceiro argumento e você
  obterá uma String em vez de um Buffer.

  A documentação sobre o módulo fs pode ser encontrada apontando seu navegador aqui:
  file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
  odejs\fs.html

  Verifique se o seu programa está correto executando este comando:

     $ learnyounode verificar my-first-async-io.js

────────────────────────────────────────────────── ───────────────────────────

   » Para imprimir essas instruções novamente, execute: learnyounode print
   » Para executar seu programa em um ambiente de teste, execute: learnyounode run
     program.js
   » Para verificar seu programa, execute: learnyounode verify program.js
   » Para obter ajuda, execute: learnyounode help