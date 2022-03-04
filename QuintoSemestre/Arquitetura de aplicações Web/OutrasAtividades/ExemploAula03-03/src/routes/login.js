//Exportar a função que redireciona a rota da aplicação para o controller de modo assincrono
module.exports = function (application) {
  application.get("/", function (req, res) {
    application.src.controllers.login.index(application, req, res);
  });
};
