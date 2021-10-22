// Variavel do numero aleatorio
/* Math.random() -> a classe math tem esse metodo random que traz numeros aleatorios
so que ele traz numeros 0.999999 e a gente quer limitar isso: 

1º multiplicar ele por 100 Math.random() * 100 -> 0.2713859 -> 27.1376... s

o que o random vai de 0 a 99.9999... pra isso 2º a gente soma mais um pra dar 100 -> 
Math.random() * 100) + 1) agora ele começa de 1 ate 99.999999, porque ele pega o 0 + 1, 
então nunca vai dar 0

3º Tirar os pontos e os numeros apos a virgula Math.floor((Math.random() * 100) + 1) o 
metodo floor limpa os valores depoois do ponto

*/ 
let numeroAleatorio = Math.floor((Math.random() * 100) + 1)

/* mostrando o numero aleatorio, vendo se de fato foi capturado
vendo se tudo ocorreu bem, o consolo.log é usado geralmente pra isso
*/
console.log('Numero aleatorio:', numeroAleatorio)

/*
Agora o DOM(Document Object Model) a API pra colocar ação nos elementos do html, seja pra
capturar algum dado, algum click do usuario, que va fazer algo apos esse click, o DOM 
ele serve pra selecionar os meus elementos HTML, seja por tag, id e class
*/

// Por tag em sequencia:
// Aqui é aquele span no meio do h1 pra sinalizar quantas tentativas o cara ainda tem
const tentativas = document.querySelector('h1 span')

// Por tag:

// Selecionando o input e o botao por tag, é a mesma logica de seleção do css
// Selecionado o elemento com isso eu consigo mudar o stilo dele, desabilitar algo, etc
// querySelectorAll seleciona varios objetos da tela, um array de objetos
const input = document.querySelector('input')
const botao = document.querySelector('button')

/* Se fosse por id selecionando pelo querySelector a gente teria que colocar #
   const input = document.querySelector('#divForm input')
*/

/* Se fosse por id selecionando pelo getElementById -> divForm é porque ele ja sabe que 
   é por id, Então não precisa colocar o hashtag
   document.getElementById('divForm')

   getElementByClass seria por class e por ae vai, ate por atributo name no campo
   da certo 
*/

// Colocando ação/evento no elemento selecionado
// No botao tem o evento click, e esse click ao ativar ele chama o metodo conferirPalpite
botao.addEventListener('click', conferirPalpite)


// Por class:

// Aqui são os palpites, os numeros que o usuario digitou
const palpites = document.querySelector('.palpites')

// Selecionando aqele P com a classe .ultimoResultado, atribuindo a essa variavel ultimoResultado, assim sera possivel falar se ele errou, acertou, etc
const ultimoResultado = document.querySelector('.ultimoResultado')

// pra falar se o valor esta baixo ou alto
const baixoOuAlto = document.querySelector('.baixoOuAlto')


// Aqui é varivael de tentativas, ela sempre começa com a tentativa 1, no else if ela vai ate 10, pois o usuario so tem 10 tentativas
let contagemPalpites = 1

function conferirPalpite() {
  /* Aqui o valor que foi digitado no campo input, o value é o valor daquele input
  No caso o que foi digitado pelo usuario no campo input, no caso ela armazena o valor
  */ 
  const valor = input.value

  /* O console no inicio foi pra ver se de fato foi capturado o click do botão e se o click chama a função
  console.log(`Conferindo palpite`)
  */
  console.log(`Conferindo palpite ${valor} ...`)

  // Conferindo se o usuario digitou um numero fora do limite e abaixo do minimo
  // No caso valor invalido
  if(valor < 1 || valor > 100) {

    /* A gente inputa pra aquele P com a class .ultimoResultado o texto a baixo
    com o textContent, quer dizer que o P vai conter o texto tal, é o conteudo
    interno do elemento em si, e eu posso criar outra tag aqui dinamicamente sem
    ter que colocar no HTML
    */
    ultimoResultado.textContent = 'O valor informado deve ser entre 1 e 100.'

    /* Aqui muda a cor do p, atraves do style e depois do style tem o mesmo nome das propriedades do css so que sem o " - " usando o termo camel case -> backgroundColor
    porque linguagens de programação não aceita ifens nos metodos e nem nas variaveis
    */
    ultimoResultado.style.color = 'red'

    //ultimoResultado.style.backgroundColor = 'blue'

    // O campo ganha foco de novo, pro cara não precisar usar o mouse, o cursor do teclado tem o focu la dentro, tipo o do css pra criar focus dentro do campo quando entra dentro dele
    input.focus()
  } else {
    // Aqui é o valor válido, no caso que esteja entre 1 a 100
    // Aqui pego o texto dentro de palpites e concateno com o valor(numero) digitado pelo usuario
    palpites.textContent += valor + ' '

    // Aqui é se o cara conseguiu
    if(valor == numeroAleatorio) {
      ultimoResultado.textContent = 'Parabéns! Você acertou.'
      ultimoResultado.style.color = 'white'
      ultimoResultado.style.backgroundColor = 'green'
      //ultimoResultado.style.fontFamily = 'Impact,Charcoal,sans-serif'

      // Função que bloqueia o game, apos que cara ganhar, criando um botão de reiniciar
      fimDoJogo()
    } 
    // O usuario tem so 10 tentativas
    else if(contagemPalpites < 10) {
      ultimoResultado.textContent = 'Errado!'
      ultimoResultado.style.color = 'red'
      ultimoResultado.style.backgroundColor = 'white'

      // Aqui fala se o valor dele que ele enviou é maior ou menor que o numero aleatorio
      if(valor < numeroAleatorio)
        baixoOuAlto.textContent = 'Seu palpite está muito baixo!'
      else
        baixoOuAlto.textContent = 'Seu palpite está muito alto!'

      // Aquele span no meio do h1 vai decrementado de acordo com a contagemPalpites
      tentativas.textContent = 10 - contagemPalpites

      // Aqui vai incrementando as tentativa toda vez que ele erra, ela começaram com 1
      contagemPalpites ++
    } 
    // Quando acabar as tentativas, ele entra nesse else, a contagemPalpites incrementou os 10 numeros
    else {
      ultimoResultado.textContent = 'FIM DO JOGO!'
      ultimoResultado.style.color = 'red'
      ultimoResultado.style.backgroundColor = 'white'

      fimDoJogo()
    }
  }
}

// Botao novo de reiniciar, ele esta fora da função porque quando a pessoa clicar em
// Reiniciar ele vai sumir
let botaoReinicio = null

// Pega a divForm do HTML
const divForm = document.querySelector('#divForm')

function fimDoJogo() {
  // Aqui disabilitade o botão e o campo
  input.disabled = true
  botao.disabled = true

  // Aqui mostra um x do lado da seta do cursor
  botao.style.cursor = 'not-allowed'
  input.style.cursor = 'not-allowed'

  // Aqui cria um botao novo, um elemento HTML que é button
  botaoReinicio = document.createElement('button')
  botaoReinicio.textContent = 'Iniciar novo jogo'

  // O botao novo pega o metodo reiniciar
  botaoReinicio.addEventListener('click', reiniciar)

  // Aqui adiciona o botão no HTML dntro da divForm
  divForm.appendChild(botaoReinicio)
}

function reiniciar() {
  // Ou usa isso pra reiniciar a pagina local
  //window.location.reload(false); 

  //Ou isso pra reiniciar :

  // Remove o botão de reiniciar, no caso remove um dos filhos da divForm
  divForm.removeChild(botaoReinicio)

  // Reinicia tudo
  input.disabled = false
  botao.disabled = false
  botao.style.cursor = 'auto'
  input.style.cursor = 'auto'

  input.focus()

  numeroAleatorio = Math.floor((Math.random() * 100) + 1)
  console.log('Numero aleatorio:', numeroAleatorio)
  

  tentativas.textContent = 10

  contagemPalpites = 1

  palpites.textContent = ' '

  // Aqui é tanto pra se o cara errar ou acertar ele deixa verde e insere o novo game
  ultimoResultado.textContent = 'NOVO GAME!!!'
  ultimoResultado.style.color = 'green'
  
  // Caso o cara acerte ele tira aquele backgroundColor verde
  ultimoResultado.style.backgroundColor = 'white'

}