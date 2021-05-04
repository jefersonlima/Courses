/*
22) Criar uma função para calcular o valor a ser pago de anuidade de uma associação. A função recebe como
parâmetro um inteiro que representa o mês (1 - janeiro, 2 - fevereiro…) que foi paga e o valor da anuidade. A
anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (sob o regime de juros
compostos). O retorno deve ser o valor a ser pago para o respectivo mês escolhido.
*/

function calcularAnuidade(mesPagamento = 1, valorAnuidade = 100){
    if (mesPagamento !== 1){
        for(let i = 1; i < mesPagamento; i++){
            valorAnuidade = valorAnuidade + (valorAnuidade / 100 * 5)
        }
    }
    switch (mesPagamento){
        case 1:
            return mesPagamento  + ' - Janeiro, Valor: ' + valorAnuidade.toFixed(2)
        case 2:
            return mesPagamento  + ' - Fevereiro, Valor: ' + valorAnuidade.toFixed(2)
        case 3:
            return mesPagamento  + ' - Março, Valor: ' + valorAnuidade.toFixed(2)
        case 4:
            return mesPagamento  + ' - Abril, Valor: ' + valorAnuidade.toFixed(2)
        case 5:
            return mesPagamento  + ' - Maio, Valor: ' + valorAnuidade.toFixed(2)
        case 6:
            return mesPagamento  + ' - Junho, Valor: ' + valorAnuidade.toFixed(2)
        case 7:
            return mesPagamento  + ' - Julho, Valor: ' + valorAnuidade.toFixed(2)
        case 8:
            return mesPagamento  + ' - Agosto, Valor: ' + valorAnuidade.toFixed(2)
        case 9:
            return mesPagamento  + ' - Setembro, Valor: ' + valorAnuidade.toFixed(2)
        case 10:
            return mesPagamento  + ' - Outubro, Valor: ' + valorAnuidade.toFixed(2)
        case 11:
            return mesPagamento  + ' - Novembro, Valor: ' + valorAnuidade.toFixed(2)
        case 12:
            return mesPagamento  + ' - Dezembro, Valor: ' + valorAnuidade.toFixed(2)
        default:
            return 'Mês inválido!'
    }
}

console.log(calcularAnuidade(1, 100))
console.log(calcularAnuidade(2, 100))
console.log(calcularAnuidade(3, 100))
console.log(calcularAnuidade(4, 100))
console.log(calcularAnuidade(5, 100))
console.log(calcularAnuidade(6, 100))
console.log(calcularAnuidade(7, 100))
console.log(calcularAnuidade(8, 100))
console.log(calcularAnuidade(9, 100))
console.log(calcularAnuidade(10, 100))
console.log(calcularAnuidade(11, 100))
console.log(calcularAnuidade(12, 100))
