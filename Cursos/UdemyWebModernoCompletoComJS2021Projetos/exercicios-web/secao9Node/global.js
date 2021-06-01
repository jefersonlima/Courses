//console.log(global)
/*global.MinhaApp = {
    saudacao (){
        return 'Estou em todos os lugares!'
    },
    nome: 'Sistema Legal'
}*/

// Deixa isso congelado não podendo ser alterado.
global.MinhaApp = Object.freeze({
    saudacao (){
        return 'Estou em todos os lugares!'
    },
    nome: 'Sistema Legal'
})