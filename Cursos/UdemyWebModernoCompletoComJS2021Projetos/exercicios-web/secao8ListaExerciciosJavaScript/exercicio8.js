/*
08) Pedro joga N jogos de basquete por temporada. Para saber como está ele está progredindo, ele mantém
registro de todos os as pontuações feitas por jogo. Após cada jogo ele anota no novo valor e confere se o
mesmo é maior ou menor que seu melhor e pior desempenho. Dada uma lista string = “pontuação1 pontuação2
pontuação3 etc..”, escreva uma função que ao recebê-la irá comparar os valores um a um e irá retornar um
vetor com o número de vezes que ele bateu seu recorde de maior número de pontos e quando fez seu pior
jogo. (Número do pior jogo).
Obs.: O primeiro jogo não conta como novo recorde do melhor.
Exemplo:
String: “10 20 20 8 25 3 0 30 1”
Retorno: [3, 7] (Significa que ele bateu três vezes seu recorde de melhor pontuação e a pior pontuação
aconteceu no sétimo jogo.)
*/

function recorde(pontosPartidas){
    let record = pontosPartidas[0]
    let piorRecord = pontosPartidas[0]
    let contadorRecord = 0, posicaoPiorRecord = 0
    for (let i = 0; i < pontosPartidas.length; i++){
        if (i != 0 && pontosPartidas[i] > record){
            contadorRecord ++
            record = pontosPartidas[i] 
        }
        if(pontosPartidas[i] < piorRecord){
            piorRecord = pontosPartidas[i]
            posicaoPiorRecord = i
        }
    }

    return [contadorRecord, posicaoPiorRecord + 1]
}
let pontosPartidas

pontosPartidas = [10, 20, 20, 8, 25, 3, 0, 30, 1]
console.log(recorde(pontosPartidas))

//pontosPartidas = [10, 20, 20, 8, 25, 6, 4, 30, 1, 31, 0, 35]
//console.log(recorde(pontosPartidas))