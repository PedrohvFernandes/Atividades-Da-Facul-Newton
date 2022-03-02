'use strict'

const fs = require('fs')

//  Este método retornará um objeto Buffer contendo o conteúdo completo do arquivo teste. no caso o caminho dele
const FS_CAMINHO =  fs.readFileSync(process.argv[2])

// Agora iremos converter e contar as linhas
// Objetos de buffer são a maneira do Node representar eficientemente arrays arbitrários de dados, seja ASCII, binário ou algum outro formato.
// Objetos de buffer pode ser convertido em strings simplesmente chamando o método toString() no eles. por exemplo. const str = buf.toString().
/* Se você está procurando uma maneira fácil de contar o número de novas linhas em um
 string, lembre-se de que uma String JavaScript pode ser .split() em um array de
 substrings e que '\n' pode ser usado como delimitador. Observe que o teste
 arquivo não tem um caractere de nova linha ('\n') no final da última linha,
 então usando este método você vai acabar com um array que tem mais um elemento
 do que o número de novas linhas.
*/
const FS_CONVERTIDO_LINHAS = FS_CAMINHO.toString().split('\n').length -1

console.log(FS_CONVERTIDO_LINHAS)

