let textoDividido
let posicao = 0
function leituraStatica(texto){
    textoDividido = texto.split(' ')    
    imprimir()
}
function imprimir(){   
        setInterval(function(){
            if(posicao < textoDividido.length){
                console.log(textoDividido[posicao])
                posicao++
            }else{
                //decobrir como parar o setInterval
                clearInterval(null)
                console.log('decobrir como parar o setInterval')
            }
        }.bind(this), 1000)
}
//a ideia é pegar um arquivo de texto ou pdf como entrada
let textoTeste = 'Se o separator contiver vários caracteres, toda a sequência de caracteres deve ser encontrada para ser dividida.'
leituraStatica(textoTeste)
