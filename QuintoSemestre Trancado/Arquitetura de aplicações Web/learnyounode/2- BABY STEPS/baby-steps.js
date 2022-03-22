/*
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
*/
'use strict'

let result = 0;

//i = 2 -> porque dentro da matriz tem 3 numeros então 0, 1, 2 -> 3 indices
for (let i = 2; i < process.argv.length; i++) {
  result += Number(process.argv[i]);
}

// console.log(process.argv); //Retorna uma matriz que é o process.argv
console.log(result); //Dessa forma retorna a soma dos numeros, pois ele armazena a soma dos numeros contidos na matriz
