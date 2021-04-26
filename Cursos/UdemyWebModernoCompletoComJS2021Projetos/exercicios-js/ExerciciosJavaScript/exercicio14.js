/*
14) Crie uma estrutura condicional switch que receba uma string com o nome de uma fruta e que possua três
casos: Caso maçã, retorne no console: “Não vendemos esta fruta aqui”. Caso kiwi, retorne: “Estamos com
escassez de kiwis”. Caso melancia, retorne: “Aqui está, são 3 reais o quilo”. Teste com estas três opções .Crie
também um default, que retornará uma mensagem de erro no console.
*/

function verificaFruta(fruta){
    try{
        switch (fruta){
            case 'maça':
                return 'Não vendemos esta fruta aqui'
            case 'kiwi':
                return 'Estamos com escassez de kiwis'
            case 'melancia':
                return 'Aqui está, são 3 reais o quilo'
            default:
                throw new UserException();
        }     
    }catch (e){
        return 'fruta invalida'
    }    
}

console.log(verificaFruta('maça'))
console.log(verificaFruta('kiwi'))
console.log(verificaFruta('melancia'))
console.log(verificaFruta('pera'))