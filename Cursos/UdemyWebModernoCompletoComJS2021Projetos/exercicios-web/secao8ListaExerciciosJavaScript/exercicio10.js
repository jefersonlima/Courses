/*
10) Crie uma função que verifica se um número inteiro passado como parêmetro é divisível por 3 e retorne true
ou false.
*/

function divisivelPorTres(numero) {
  if (numero % 3 === 0) {
    return true;
  }
  return false;
}

console.log(divisivelPorTres(3));
console.log(divisivelPorTres(33));
console.log(divisivelPorTres(333));
console.log(divisivelPorTres(38));
console.log(divisivelPorTres(337));
