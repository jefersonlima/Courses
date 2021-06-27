/*
12) Faça um algoritmo que calcule o fatorial de um número.
*/

function calculaFatorial(numero) {
  let fatorial = 1;
  for (let i = 1; i <= numero; i++) {
    fatorial *= (i);
  }
  return fatorial;
}

console.log(calculaFatorial(1));
console.log(calculaFatorial(2));
console.log(calculaFatorial(3));
console.log(calculaFatorial(4));
console.log(calculaFatorial(5));
console.log(calculaFatorial(6));
