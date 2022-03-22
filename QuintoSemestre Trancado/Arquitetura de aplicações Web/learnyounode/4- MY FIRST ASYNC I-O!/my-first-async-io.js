'use strict'
const fs = require('fs')
const file = process.argv[2]

// Usando callback -> callback é quando esperamos uma chamada de retorno. Chamada de retorno é quando esperamos um retorno de uma chamada, isso acontece quando esperamos uma ação do usuario com um click -> onclick -> no caso esse evento/metodo so vai funcionar quando o usuario clicar, apos clicar a gente tem o retorno do metodo que esta dentro do metodo onClick e isso se aplica tambem quando tem uma função por exemplo readFile chmando outra função que so tera o retorno quando o metodo dentro do readFile terminar de concluir, sendo assim, podemos concluir que isso é diferente quando invocamos um metodo automatico function exemplo(){}  invocando: exemplo(), nesse caso ela não precisa de uma outra ação/chamada de ninguem, nem de função alguma para receber o retorno do chamada(invocação) do metodo. Callbacks geralmente são async(assicronos) não precisam ser executados para outra coisa executar, tudo executa ao mesmo tempo, enquanto o callback fica esperando uma chamada de algo
fs.readFile(file, function (err, contents) {
  if (err) {
    return console.error(err)
  }
  // fs.readFile(file, 'utf8', callback) can also be used
  const lines = contents.toString().split('\n').length - 1
  console.log(lines)
})