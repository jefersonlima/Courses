// variavel LET tem escopo Global, Escopo de função e escopo de Bloco
// o variavel LET respeita o escopo da variavel dando preferencia sempre ao escopo mais interno primeiro
const numero = 1;
{
  const numero = 2;
  console.log('dentro = ', numero);
}
console.log('fora = ', numero);
