/*
01) Crie uma função que dado dois valores (passados como parâmetros) mostre no console a soma, subtração,
multiplicação e divisão desses valores.
*/
function soma(valor1, valor2) {
  return valor1 + valor2;
}

function subtracao(valor1, valor2) {
  return valor1 - valor2;
}

function multiplicacao(valor1, valor2) {
  return valor1 * valor2;
}

function divisao(valor1, valor2) {
  if (valor2 != 0) {
    return valor1 / valor2;
  }
  return 'Não pode dividir por zero!';
}

function gerarNumerosAleatorios() {
  const valor = Math.random() * (100 - 0) + 0;
  return Math.floor(valor);
}

function operacoesBasicas(valor1, valor2) {
  console.log(`soma:          ${valor1} + ${valor2} = ${soma(valor1, valor2)}`);
  console.log(`subtracao:     ${valor1} - ${valor2} = ${subtracao(valor1, valor2)}`);
  console.log(`multiplicacao: ${valor1} * ${valor2} = ${multiplicacao(valor1, valor2)}`);
  console.log(`divisao:       ${valor1} / ${valor2} = ${divisao(valor1, valor2)}`);
}

operacoesBasicas(gerarNumerosAleatorios(), gerarNumerosAleatorios());
