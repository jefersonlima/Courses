/*
11) As regras para o cálculo dos anos bissextos são as seguintes:
De 4 em 4 anos é ano bissexto;
De 100 em 100 anos não é ano bissexto;
De 400 em 400 anos é ano bissexto;
Prevalecem as últimas regras sobre as primeiras.
Partindo daí elabore uma função que recebe um ano e calcula se ele é ano bissexto, imprimindo no console a
mensagem e retornando true ou false.
*/
function verificaAnoBissexto(ano) {
  if (ano % 4 === 0) {
    if (ano % 100 === 0) {
      if (ano % 400 === 0) {
        return true;
      }
      return false;
    }
    return true;
  }
  return false;
}

console.log(verificaAnoBissexto(2020));
console.log(verificaAnoBissexto(2021));
console.log(verificaAnoBissexto(2022));
console.log(verificaAnoBissexto(2023));
console.log(verificaAnoBissexto(2024));
console.log();
console.log(verificaAnoBissexto(100));
console.log(verificaAnoBissexto(200));
console.log(verificaAnoBissexto(300));
console.log(verificaAnoBissexto(400));
