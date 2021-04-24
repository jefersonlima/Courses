/*
04) Crie uma função que irá receber dois valores, o dividendo e o divisor. A função deverá imprimir o resultado
e o resto da divisão destes dois valores.
*/

function gerarDividendoAleatorio(){
    const dividendo = Math.random() * (100)
    return Math.floor(dividendo)
}

function gerarDivisorAleatorio(){
    const divisor = Math.random() * (10 - 1) + 1
    return Math.floor(divisor)
}

function dividir(dividendo, divisor){
    return 'a divisao: ' + dividendo + '/' + divisor + 
    '\ntem como resultado: ' + Math.floor(dividendo / divisor) + 
    '\ne tem como resto: ' + dividendo % divisor 
}

console.log(dividir(gerarDividendoAleatorio(),gerarDivisorAleatorio()))