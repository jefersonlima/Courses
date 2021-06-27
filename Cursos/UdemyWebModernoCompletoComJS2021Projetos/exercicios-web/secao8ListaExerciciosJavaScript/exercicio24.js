/*
24) Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma estrutura de repetição while.
*/

function imprimirString(quantidade = 11, frase = 'Hello World!') {
  let contador = 0;
  while (contador < quantidade) {
    console.log(frase);
    contador++;
  }
}

imprimirString();
imprimirString(5, 'Teste');
