# ENGLISH
 
 ## LEARN YOU THE NODE.JS FOR MUCH WIN!

 ## MAKE IT MODULAR (Exercise 6 of 13)

  Create two files named make-it-modular.js and mymodule.js.

  This problem is the same as the previous but introduces the concept of
  modules. You will need to create two files to solve this.

  Create a program that prints a list of files in a given directory,
  filtered by the extension of the files. The first argument is the
  directory name and the second argument is the extension filter. Print the
  list of files (one file per line) to the console. You must use
  asynchronous I/O.

  You must write a module file (mymodule.js) to do most of the work. The
  module must export a single function that takes three arguments: the
  directory name, the filename extension string and your callback function,
  in that order. Don't alter the filename extension string in any way before
  passing it to your module.

  The callback function must be called using the idiomatic node(err, data)
  convention. This convention stipulates that unless there's an error, the
  first argument passed to the callback will be null, and the second will be
  your data. In this exercise, the data will be your filtered list of files,
  as an Array. If you receive an error, e.g. from your call to
  fs.readdir(), the callback must be called with the error as the first and
  only argument.

  You must not print directly to the console from your module file, only
  from your original program.

  In the case of an error bubbling up to your original program file, simply
  check for it and print an informative message to the console.

  These four things are the contract that your module must follow.

   1. Export a single function that takes exactly the arguments described.
   2. Call the callback exactly once with an error or some data as described.
   3. Don't change anything else, like global variables or stdout.
   4. Handle all the errors that may occur and pass them to the callback.

  The benefit of having a contract is that your module can be used by anyone
  who expects this contract. So your module could be used by anyone else who
  does learnyounode, or the verifier, and just work.

 ─────────────────────────────────────────────────────────────────────────────

 ## HINTS

  Create a new module by creating a new file (mymodule.js) that just
  contains your directory reading and filtering function. To define a single
  function export, you assign your function to the module.exports object,
  overwriting what is already there:

     module.exports = function (args) { /* ... */ }

  Or you can use a named function and assign the name.

  To use your new module in your original program file (make-it-modular.js),
  use the require() call in the same way that you require('fs') to load the
  fs module. The only difference is that for local modules must be prefixed
  with './'. So, if your file is named mymodule.js then:

     const mymodule = require('./mymodule.js')

  The '.js' is optional here and you will often see it omitted.

  You now have the module.exports object in your module assigned to the
  mymodule variable. Since you are exporting a single function, mymodule is
  a function you can call!

  Also keep in mind that it is idiomatic to check for errors and do
  early-returns within callback functions:

     function bar (callback) {
       foo(function (err, data) {
         if (err) { return callback(err) } // early return

         // ... no error, continue doing cool things with `data`

         // all went well, call callback with `null` for the error argument

         callback(null, data)
       })
     }

  Check to see if your program is correct by running this command:

     $ learnyounode verify make-it-modular.js

 ─────────────────────────────────────────────────────────────────────────────

   » To print these instructions again, run: learnyounode print
   » To execute your program in a test environment, run: learnyounode run                                               
     program.js
   » To verify your program, run: learnyounode verify program.js
   » For help run: learnyounode help

# PORTUGUESE

## APRENDA VOCÊ O NODE.JS PARA MUITA VITÓRIA!

 ## FAÇA MODULAR (Exercício 6 de 13)

  Crie dois arquivos chamados make-it-modular.js e mymodule.js.

  Este problema é o mesmo que o anterior, mas introduz o conceito de
  módulos. Você precisará criar dois arquivos para resolver isso.

  Crie um programa que imprima uma lista de arquivos em um determinado diretório,
  filtrado pela extensão dos arquivos. O primeiro argumento é o
  nome do diretório e o segundo argumento é o filtro de extensão. Imprima o
  lista de arquivos (um arquivo por linha) para o console. Você deve usar
  E/S assíncrona.

  Você deve escrever um arquivo de módulo (mymodule.js) para fazer a maior parte do trabalho. O
  módulo deve exportar uma única função que recebe três argumentos: o
  nome do diretório, a string de extensão do nome do arquivo e sua função de retorno de chamada,
  naquela ordem. Não altere a string de extensão do nome do arquivo de forma alguma antes
  passando para o seu módulo.

  A função de retorno de chamada deve ser chamada usando o nó idiomático (err, data)
  convenção. Esta convenção estipula que, a menos que haja um erro, o
  primeiro argumento passado para o retorno de chamada será nulo e o segundo será
  seus dados. Neste exercício, os dados serão sua lista filtrada de arquivos,
  como uma matriz. Se você receber um erro, por exemplo. da sua chamada para
  fs.readdir(), o retorno de chamada deve ser chamado com o erro como primeiro e
  único argumento.
  
  Você não deve imprimir diretamente no console a partir de seu arquivo de módulo, apenas
  do seu programa original.

  No caso de um erro borbulhando em seu arquivo de programa original, simplesmente
  verifique e imprima uma mensagem informativa no console.

  Essas quatro coisas são o contrato que seu módulo deve seguir.

   1. Exporte uma única função que receba exatamente os argumentos descritos.
   2. Chame o retorno de chamada exatamente uma vez com um erro ou alguns dados conforme descrito.
   3. Não altere mais nada, como variáveis ​​globais ou stdout.
   4. Trate todos os erros que possam ocorrer e passe-os para o retorno de chamada.

  A vantagem de ter um contrato é que seu módulo pode ser usado por qualquer pessoa
  quem espera este contrato. Assim, seu módulo pode ser usado por qualquer outra pessoa que
  faz learnyounode, ou o verificador, e simplesmente funciona.

 ─────────────────────────────────────────────────────────────────────────────
 ## DICAS

  Crie um novo módulo criando um novo arquivo (mymodule.js) que apenas
  contém sua função de leitura e filtragem de diretório. Para definir um único
  exportação de função, você atribui sua função ao objeto module.exports,
  substituindo o que já está lá:

     module.exports = function (args) { /* ... */ }

  Ou você pode usar uma função nomeada e atribuir o nome.

  Para usar seu novo módulo em seu arquivo de programa original (make-it-modular.js),
  use a chamada require() da mesma maneira que você require('fs') para carregar o
  módulo fs. A única diferença é que para módulos locais deve ser prefixado
  com './'. Portanto, se seu arquivo for chamado mymodule.js, então:

     const mymodule = require('./mymodule.js')

  O '.js' é opcional aqui e muitas vezes você o verá omitido.

  Agora você tem o objeto module.exports em seu módulo atribuído ao
  variável mymodule. Como você está exportando uma única função, mymodule é
  uma função que você pode chamar!

  Lembre-se também de que é idiomático verificar erros e fazer
  early-returns dentro das funções de callback:
  
function bar (retorno de chamada) {
       foo(função (erro, dados) {
         if (err) { return callback(err) } // retorno antecipado

         // ... sem erro, continue fazendo coisas legais com `data`

         // tudo correu bem, chame o callback com `null` para o argumento de erro

         callback(null, data)
       })
     }

  Verifique se o seu programa está correto executando este comando:

     $ learnyounode verifica make-it-modular.js

─────────────────────────────────────────────────────────────────────────────

   » Para imprimir essas instruções novamente, execute: learnyounode print
   » Para executar seu programa em um ambiente de teste, execute: learnyounode run
     program.js
   » Para verificar seu programa, execute: learnyounode verify program.js
   » Para obter ajuda, execute: learnyounode help