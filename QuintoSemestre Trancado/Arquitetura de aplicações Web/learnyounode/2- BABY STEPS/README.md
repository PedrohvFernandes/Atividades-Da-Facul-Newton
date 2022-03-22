 # ENGLISH

 ## LEARN YOU THE NODE.JS FOR MUCH WIN!

 ## BABY STEPS (Exercise 2 of 13)

  Create a file named baby-steps.js.

  Write a program that accepts one or more numbers as command-line arguments
  and prints the sum of those numbers to the console (stdout).

 ─────────────────────────────────────────────────────────────────────────────

 ## HINTS

  You can access command-line arguments via the global process object. The
  process object has an argv property which is an array containing the
  complete command-line. i.e. process.argv.

  To get started, write a program that simply contains:

     console.log(process.argv)

  Run it with node baby-steps.js and some numbers as arguments. e.g:

     $ node baby-steps.js 1 2 3

  In which case the output would be an array looking something like:

     ['node', '/path/to/your/baby-steps.js', '1', '2', '3']

  You'll need to think about how to loop through the number arguments so
  you can output just their sum. The first element of the process.argv array
  is always 'node', and the second element is always the path to your
  baby-steps.js file, so you need to start at the 3rd element (index 2),
  adding each item to the total until you reach the end of the array.

  Also be aware that all elements of process.argv are strings and you may
  need to coerce them into numbers. You can do this by prefixing the
  property with + or passing it to Number(). e.g. +process.argv[2] or
  Number(process.argv[2]).

  Check to see if your program is correct by running this command:

     $ learnyounode verify baby-steps.js

  learnyounode will be supplying arguments to your program when you run
  learnyounode verify baby-steps.js so you don't need to supply them
  yourself. To test your program without verifying it, you can invoke it
  with learnyounode run baby-steps.js. When you use run, you are invoking
  the test environment that learnyounode sets up for each exercise.

 ─────────────────────────────────────────────────────────────────────────────

   » To print these instructions again, run: learnyounode print
   » To execute your program in a test environment, run: learnyounode run                                               
     program.js
   » To verify your program, run: learnyounode verify program.js
   » For help run: learnyounode help

   # PORTUGUESE

## APRENDA VOCÊ O NODE.JS PARA MUITA VITÓRIA!

 ## PASSOS DO BEBÊ (Exercício 2 de 13)

  Crie um arquivo chamado baby-steps.js.

  Escreva um programa que aceite um ou mais números como argumentos de linha de comando
  e imprime a soma desses números no console (stdout).

   ─────────────────────────────────────────────────────────────────────────────
   
## DICAS

  Você pode acessar argumentos de linha de comando por meio do objeto de processo global. O
  objeto de processo tem uma propriedade argv que é um array contendo o
  linha de comando completa. ou seja, process.argv.

  Para começar, escreva um programa que simplesmente contenha:

     console.log(process.argv)

  Execute-o com o nó baby-steps.js e alguns números como argumentos. por exemplo:

     $ node baby-steps.js 1 2 3

  Nesse caso, a saída seria uma matriz parecida com:

     ['node', '/path/to/your/baby-steps.js', '1', '2', '3']

     Você precisará pensar em como percorrer os argumentos numéricos para
  você pode produzir apenas a soma deles. O primeiro elemento da matriz process.argv
  é sempre 'nó', e o segundo elemento é sempre o caminho para o seu
  baby-steps.js, então você precisa começar no 3º elemento (índice 2),
  adicionando cada item ao total até chegar ao final da matriz.

  Também esteja ciente de que todos os elementos de process.argv são strings e você pode
  necessidade de coagi-los em números. Você pode fazer isso prefixando o
  propriedade com + ou passando para Number(). por exemplo. +process.argv[2] ou
  Número(process.argv[2]).

  Verifique se o seu programa está correto executando este comando:

     $ learnyounode verificar baby-steps.js

  learnyounode fornecerá argumentos ao seu programa quando você executar
  learnyounode verifica baby-steps.js para que você não precise fornecê-los
  você mesmo. Para testar seu programa sem verificá-lo, você pode invocá-lo
  com learnyounode execute baby-steps.js. Quando você usa run, você está invocando
  o ambiente de teste que o learnyounode configura para cada exercício.
  
   ─────────────────────────────────────────────────────────────────────────────
   
» Para imprimir essas instruções novamente, execute: learnyounode print
   » Para executar seu programa em um ambiente de teste, execute: learnyounode run
     program.js
   » Para verificar seu programa, execute: learnyounode verify program.js
   » Para obter ajuda, execute: learnyounode help