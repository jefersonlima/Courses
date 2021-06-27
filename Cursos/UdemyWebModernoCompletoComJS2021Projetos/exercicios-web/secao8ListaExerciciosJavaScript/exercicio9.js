/*
09) Construa uma função para um sistema de notas de uma instituição que possui a seguinte política de
classificação: Todo aluno recebe uma nota de 0 a 100. Alunos com nota abaixo de 40 são reprovados. As notas
possuem a seguinte regra de arredondamento: Se a diferença entre a nota e o próximo múltiplo de 5 for menor
que 3, arredondar a nota para esse próximo múltiplo de 5. Se a nota for abaixo de 38, não é feito nenhum
arredondamento pois esta nota resulta na reprovação do aluno. Por exemplo, a nota 84 será arredondada para
85, mas a nota 29 não será arredondada por ser abaixo de 40 e não ser possível arredondamento eficiente, ou
seja, que evite a reprovação do aluno. No caso de a nota ser 38, o arredondamento é possível pois atingirá 40
e o aluno será aprovado.
*/
const notaCorte = 40;
function verificaAprovacao(nota) {
  if ((nota + 2) < notaCorte) {
    return `Reprovado nota: ${nota}`;
  }
  return arredondaNota(nota);
}

function arredondaNota(nota) {
  nota1 = nota;
  nota1 = Math.floor(nota1 / 5);
  nota1 = (nota1 + 1) * 5;
  if ((nota + 3) > nota1) {
    return `nota: ${nota} nota arredondada: ${nota1}`;
  }
  return `nota: ${nota}`;
}

console.log(verificaAprovacao(29));
console.log(verificaAprovacao(38));
console.log(verificaAprovacao(84));
