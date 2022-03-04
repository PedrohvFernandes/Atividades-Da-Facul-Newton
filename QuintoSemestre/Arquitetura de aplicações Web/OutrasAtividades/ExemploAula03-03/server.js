// Usando MVC Model (modelo) View (visão HTML DINAMICO AJS) e Controller (Controle)

// Tem tambem o -> O MVVM (Model-View-ViewModel) é um padrão de design de arquitetura de interface do usuário para desacoplamento da interface do usuário e de código que não é da interface do usuário.há 7 dias

// Requisitando o express. Obs: o express tem que estar insalado
const EXPRESS = require("express");

const CONSIGN = require('consign');

// A minha aplicação vai conseguir herdar as caracteristicas do Express, conseguindo fazer requisição e resposta
// Com isso o server vira um objeto do tipo express
const SERVER = EXPRESS();

//chamada do Metodo GET
// req -> requisição, res -> resposta

// SERVER.get("/", (req, res) => {
//   return res.json(
//     {
//       usuario: "Pedro",
//       idade: "20",
//     },
//     // {
//     //   usuario: "João",
//     //   idade: "24",
//     // }
//   );
// });

// SERVER.get("/user", (req, res) => {
//     return res.json([
//       {
//         usuario: "Pedro",
//         idade: "20",
//       },
//       {
//         usuario: "João",
//         idade: "25",
//       }
//     ]
//     );
//   });


SERVER.set('view engine', 'ejs');
SERVER.set('views', './src/views')

CONSIGN()
  .include('src/routes')
  .then('src/models')
  .then('src/controllers')
  .into(SERVER);

//servidor rodando na porta, a gente vai usar o script start para iniciar o projeto, nele a gente define o nodemon para iniciar o projeto -> Npm start
// O nodemon a gente vai poder mudar aqui e não vai precisar desligar o servidor com o ctrl+c porque o nodemon sempre vai dar restart no servidor quando mudar

// listen -> comando que fica varrendo as portas de entradas da aplicação localhost
SERVER.listen(3000, function () {
  console.log("Servidor está ativo");
});
