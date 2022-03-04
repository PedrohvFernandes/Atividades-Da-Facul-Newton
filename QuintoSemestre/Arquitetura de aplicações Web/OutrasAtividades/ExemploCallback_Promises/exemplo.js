// import do filesystem
const fs = require("fs");
const { resolve } = require("path/posix");

const X = "Teste";

// console.log("I")

// console.log("Eat")

// console.log("Ice Cream\n")

// // Exemplo de função assicrona:

// console.log("I")

// // Agurda 2 segundos

// setTimeout(() =>{
//     console.log("eat")
// }, 2000)

// console.log("Ice Cream")

// outro Exemplo de callback:

// console.log("entrando no callback")
// // writeFile-> cria arquivo
// fs.writeFile('teste.txt', `${X}`, () =>{
//     console.log(X)
// });
// console.log('Após o callback')

// Exemplo promisses

// console.log("Exemplo de promises");

// function Espera(tempo) {
//   return new Promise((resolver) => {
//     setTimeout(resolver, tempo * 1000);
//   });
// }
// Espera(5)
// .then(() => {
//   console.log("5s depois");
// });
// // await espera(5) em vez do then ou os dois juntos ou ate mesmo asyn com await e then juntos mas so o await ou then ja resolve

// console.log('Tempo de execução da Promises')


// Exemplo async e await

// let hello = async () => {return "Hello"};
// hello().then((value) => {
//     console.log(value);
// });

function func1(number){
    return new Promise(resolve =>{
        setTimeout(() =>{
            resolve(77 + number) , 1000
        });
    });
};

function func2(number){
    return new Promise(resolve =>{
        setTimeout(() =>{
            resolve(22 + number) , 1000
        });
    });
};

function func3(number){
    return new Promise(resolve =>{
        setTimeout(() =>{
            resolve(14 * number) , 1000
        });
    });
};

async function myAsyncFunction(){
    var number = await func1(4);

    console.log('Hello');
    number = await func2(number);

    console.log('World');
    number = await func3(number);

    console.log(number);
}

myAsyncFunction();