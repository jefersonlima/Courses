// Class
class Pessoa{
    constructor(nome){
        this.nome = nome
    }

    falar(){
        console.log(`Meu nome é ${this.nome}`)
    }
}

const p1 = new Pessoa('João')
p1.falar()

// Construtora
function Pessoa2(nome){
    this.nome = nome
    // metodo publico
    this.falar = function(){
        console.log(`Meu nome é ${this.nome}`)
    }
}

const p2 = new Pessoa2('José')
p2.falar()