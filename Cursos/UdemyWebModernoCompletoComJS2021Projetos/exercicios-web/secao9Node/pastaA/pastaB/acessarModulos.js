const moduloA = require('../../moduloA');
// const moduloA = require('C:/Cursos/Cursos/UdemyWebModernoCompletoComJS2021Projetos/exercicios-web/secao9Node/moduloA.js')
console.log(moduloA.ola);

const saudacao = require('saudacao');

console.log(saudacao.ola);

const c = require('./pastaC');

console.log(c.ola2);

const http = require('http');

http.createServer((req, res) => {
  res.write('Bom dia!');
  res.end();
}).listen(8080);
