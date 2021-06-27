/*
17) Um funcionário irá receber um aumento de acordo com o seu plano de
trabalho, de acordo com a tabela abaixo:
Plano Aumento
A 10%
B 15%
C 20%
Faça uma função que leia o plano de trabalho e o salário atual de um funcionário e calcula e imprime o seu
novo salário. Use a estrutura switch e faça um caso default que indique que o plano é inválido.
*/
const salarioMinimo = 1100;
function calculaSalario(plano = 'A', salario = salarioMinimo) {
  switch (plano) {
    case 'A':
      return salario + salario / 100 * 10;
    case 'B':
      return salario + salario / 100 * 15;
    case 'C':
      return salario + salario / 100 * 120;
    default:
      return 'plano é inválido';
  }
}

console.log(calculaSalario());
console.log(calculaSalario('A', 2000));
console.log(calculaSalario('B', 2000));
console.log(calculaSalario('C', 2000));
console.log(calculaSalario('D', 2000));
