/*
23) Escreva um algoritmo que leia o código de um aluno e suas três notas. Calcule a média ponderada do
aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do
aluno, suas três notas, a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 e
"REPROVADO" se a média for menor que 5. Repita a operação até que o código lido seja negativo.
*/
let maiorNota; let segundaNota; let
  terceiraNota;
function verificaAprovado(codAluno, nota1, nota2, nota3) {
  while (codAluno >= 0) {
    media = calculaMedia(nota1, nota2, nota3);
    if (media >= 5) {
      return `Média do Aluno: ${codAluno} = ${media} Aprovado`;
    }
    return `Média do Aluno: ${codAluno} = ${media} Reprovado`;
  }
}

function calculaMedia(nota1, nota2, nota3) {
  verificaMaiorNota(nota1, nota2, nota3);
  return ((maiorNota * 4 + segundaNota * 3 + terceiraNota * 3) / 10).toFixed(2);
}

function verificaMaiorNota(nota1, nota2, nota3) {
  if (nota2 > nota1 && nota2 > nota3) {
    maiorNota = nota2;
    segundaNota = nota1;
    terceiraNota = nota3;
  } else if (nota3 > nota1 && nota3 > nota2) {
    maiorNota = nota3;
    segundaNota = nota1;
    terceiraNota = nota2;
  } else {
    maiorNota = nota1;
    segundaNota = nota2;
    terceiraNota = nota3;
  }
}

console.log(verificaAprovado(1, 6, 4, 4));
console.log(verificaAprovado(2, 5, 4, 4));
console.log(verificaAprovado(3, 8, 3, 4));
console.log(verificaAprovado(4, 10, 3.4, 0));
