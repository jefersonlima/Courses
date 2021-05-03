function gerarValorAleatorio(){
    const valor = Math.random() * (5 - 1) +1
    return Math.floor(valor)
}

function exponenciacao(base, expoente){
    return 'Base: ' + base + ' elevado a potencia: '+ expoente + ' e igual ' + base ** expoente
}

console.log(exponenciacao(gerarValorAleatorio(),gerarValorAleatorio()))