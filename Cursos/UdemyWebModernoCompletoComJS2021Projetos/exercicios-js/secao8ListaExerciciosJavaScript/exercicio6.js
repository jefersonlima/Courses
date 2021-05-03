/*
06) Elabore duas funções que recebem três parâmetros: capital inicial, taxa de juros e tempo de aplicação. A
primeira função retornará o montante da aplicação financeira sob o regime de juros simples e a segunda
retornará o valor da aplicação sob o regime de juros compostos.
*/



function calculaJurosSimples(capitalEmprestado, taxaJuros, tempoMeses){
    const juros = capitalEmprestado * taxaJuros * tempoMeses
    return juros
}

function calculaJurosCompostos(capitalEmprestado, taxaJuros, tempoMeses){
    let capitalEmprestadoAcumulado = capitalEmprestado
    for (let i = 0; i < tempoMeses; i++){
        capitalEmprestadoAcumulado = capitalEmprestadoAcumulado + capitalEmprestadoAcumulado * taxaJuros
    }   
    return Math.floor(capitalEmprestadoAcumulado)
}

//Valores simulado casa verde e amarela taxa de juros ao ano
let capitalInicial = 120000
let taxaJuros = 0.0425 // em porcentagem é so multiplicar por 100 10% para mostrar ao usuário
let tempoAplicação = 30 


console.log(calculaJurosSimples(capitalInicial, taxaJuros, tempoAplicação))
console.log(calculaJurosCompostos(capitalInicial, taxaJuros, tempoAplicação))