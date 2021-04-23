// variavel LET tem escopo Global, Escopo de função e escopo de Bloco
// o variavel LET respeita o escopo da variavel dando preferencia sempre ao escopo mais interno primeiro
let numero = 1
{
    let numero = 2
    console.log('dentro = ', numero)
}
console.log('fora = ', numero)