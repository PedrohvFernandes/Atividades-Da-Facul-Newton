
# ENGLISH

 ## LEARN YOU THE NODE.JS FOR MUCH WIN!

 ## FILTERED LS (Exercise 5 of 13)

  Create a file named filtered-ls.js.

  Create a program that prints a list of files in a given directory,
  filtered by the extension of the files. You will be provided a directory
  name as the first argument to your program (e.g. '/path/to/dir/') and a
  file extension to filter by as the second argument.

  For example, if you get 'txt' as the second argument then you will need to
  filter the list to only files that end with .txt. Note that the second
  argument will not come prefixed with a '.'.

  Keep in mind that the first arguments of your program are not the first
  values of the process.argv array, as the first two values are reserved for
  system info by Node.

  The list of files should be printed to the console, one file per line. You
  must use asynchronous I/O.

 ─────────────────────────────────────────────────────────────────────────────

 ## HINTS

  The fs.readdir() method takes a pathname as its first argument and a
  callback as its second. The callback signature is:

     function callback (err, list) { /* ... */ }

  where list is an array of filename strings.

  Documentation on the fs module can be found by pointing your browser here:
  file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
  odejs\fs.html

  You may also find node's path module helpful, particularly the extname
  method.

  Documentation on the path module can be found by pointing your browser
  here:
  file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
  odejs\path.html

  Check to see if your program is correct by running this command:

     $ learnyounode verify filtered-ls.js

 ─────────────────────────────────────────────────────────────────────────────

   » To print these instructions again, run: learnyounode print
   » To execute your program in a test environment, run: learnyounode run                                               
     program.js
   » To verify your program, run: learnyounode verify program.js
   » For help run: learnyounode help

  # PORTUGUESE

  Crie um arquivo chamado filter-ls.js.

  Crie um programa que imprima uma lista de arquivos em um determinado diretório,
  filtrado pela extensão dos arquivos. Você receberá um diretório
  name como o primeiro argumento para o seu programa (por exemplo, '/path/to/dir/') e um
  extensão de arquivo para filtrar como o segundo argumento.

  Por exemplo, se você obtiver 'txt' como segundo argumento, precisará
  filtre a lista apenas para arquivos que terminam com .txt. Observe que o segundo
  argumento não virá prefixado com um '.'.

  Tenha em mente que os primeiros argumentos do seu programa não são os primeiros
  valores do array process.argv, pois os dois primeiros valores são reservados para
  informações do sistema por Node.

  A lista de arquivos deve ser impressa no console, um arquivo por linha. Vocês
  deve usar E/S assíncrona.

 ─────────────────────────────────────────────────────────────────────────────
## DICAS

  O método fs.readdir() recebe um nome de caminho como seu primeiro argumento e um
  callback como seu segundo. A assinatura de retorno de chamada é:

     função callback (err, lista) { /* ... */ }

  onde list é uma matriz de strings de nome de arquivo.

  A documentação sobre o módulo fs pode ser encontrada apontando seu navegador aqui:
  file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
  odejs\fs.html

  Você também pode achar útil o módulo de caminho do nó, particularmente o extname
  método.

  A documentação no módulo de caminho pode ser encontrada apontando seu navegador
  aqui:
  file://C:\Users\Pedro\AppData\Roaming\npm\node_modules\learnyounode\docs-n
  odejs\path.html

  Verifique se o seu programa está correto executando este comando:

     $ learnyounode verificar filter-ls.js

 ─────────────────────────────────────────────────────────────────────────────

   » Para imprimir essas instruções novamente, execute: learnyounode print
   » Para executar seu programa em um ambiente de teste, execute: learnyounode run
     program.js
   » Para verificar seu programa, execute: learnyounode verify program.js
   » Para obter ajuda, execute: learnyounode help