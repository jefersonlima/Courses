/*
02) Os triângulos podem ser classificados em 3 tipos quanto ao tamanho de seus lados:
Equilátero: Os três lados são iguais. Isósceles: Dois lados iguais. Escaleno: Todos os lados são diferentes.
Crie uma função que recebe os comprimentos dos três lados de um triângulo e retorne sua classificação quanto
ao tamanho de seus lados. (Neste exemplo deve-se abstrair as condições matemáticas de existência de um
triângulo).
*/

function gerarNumeroAleatorio() {
  const valor = Math.random() * (4 - 1) + 1;
  return Math.floor(valor);
}

function verificaTipoTriangulo(lado1, lado2, lado3) {
  if (lado1 === lado2 && lado1 === lado3) {
    return `Triangulo formado pelos lados: lado1 = ${lado1}, lado2 = ${lado2}, lado3 = ${lado3} é Equilátero`;
  } if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
    return `Triangulo formado pelos lados: lado1 = ${lado1}, lado2 = ${lado2}, lado3 = ${lado3} é Isósceles`;
  }
  return `Triangulo formado pelos lados: lado1 = ${lado1}, lado2 = ${lado2}, lado3 = ${lado3} é Escaleno`;
}

console.log(verificaTipoTriangulo(gerarNumeroAleatorio(), gerarNumeroAleatorio(), gerarNumeroAleatorio()));
