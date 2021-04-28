/*
20) Crie um programa para informar quais e quantas notas são necessárias para entregar o mínimo de cédulas
para um determinado valor informado pelo usuário considerando notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1.
Seu programa deve mostrar apenas as notas utilizadas. Por exemplo, ao solicitar R$18, o programa deve
informar apenas a seguinte informação (note que não foram exibidas informações sobre as demais cédulas): 1
nota(s) de R$ 10. 1 nota(s) de R$ 5. 3 nota(s) de R$ 1.
*/

function notasTroco(valor){
    let recebido = valor
    let nota = 0
    if (recebido >= 100){
        nota = Math.floor(recebido / 100)
        recebido = recebido % 100
        console.log(nota + ' nota(s) de R$ 100')
    }
    if (recebido >= 50){
        nota = Math.floor(recebido / 50)
        recebido = recebido % 50
        console.log(nota + ' nota(s) de R$ 50')
    }
    if (recebido >= 00){
        nota = Math.floor(recebido / 10)
        recebido = recebido % 10
        console.log(nota + ' nota(s) de R$ 10')
    }
    if (recebido >= 5){
        nota = Math.floor(recebido / 5)
        recebido = recebido % 5
        console.log(nota + ' nota(s) de R$ 5')
    }
    if (recebido >= 1){
        nota = Math.floor(recebido / 1)
        recebido = recebido % 1
        console.log(nota + ' nota(s) de R$ 1')
    }
    console.log()
}

notasTroco(299)
notasTroco(18)