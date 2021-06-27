/*
07) Uma das vantagens da programação é a automatização de tarefas que não gostamos de realizar. Dito isto,
elabore uma função cujo objetivo é resolver a fórmula de Bhaskara. Para isso, sua função deve receber três
parâmetros, “ax2”, “bx” e “c”, de tal modo que na equação: 3x² - 5x + 12 os valores seriam respectivamente: 3,
-5, 12. Como retorno deve ser passado um vetor que tem 2 valores um para cada possível resultado, mesmo
que os resultados sejam iguais. Caso o delta seja negativo, retorne, ao invés do vetor, um string com a frase:
“Delta é negativo”.
*/

function baskara(a, b, c) {
  const delta = b ** 2 - 4 * a * c;
  if (delta < 0) {
    return `Delta é negativo: ${delta}`;
  }
  x1 = (-b + Math.sqrt(delta)) / 2 * a;
  x2 = (-b - Math.sqrt(delta)) / 2 * a;

  const vet = [x1, x2];
  return vet;
}

console.log(baskara(3, -5, 12));
console.log(baskara(1, 12, -13)); // [1, -13]
