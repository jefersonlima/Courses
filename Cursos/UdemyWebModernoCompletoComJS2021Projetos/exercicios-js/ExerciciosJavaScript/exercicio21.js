/*
21) Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado
considerando que todos pagam R$ 100 mais um adicional conforme a seguinte tabela: 1) crianças com menos
de 10 anos pagam R$80; 2) conveniados com idade entre 10 e 30 anos pagam R$50; 3) conveniados com
idade acima de 30 e até 60 anos pagam R$ 95; e 4) conveniados acima de 60 anos pagam R$130
*/
const valorPadrao = 100, valorCrianca = 80, valorJovem = 50, valorAdulto = 95, valorIdoso = 130
function calculaPlanoSaude(idade = 99){
    if(idade <= 10){
        return valorPadrao + valorCrianca
    }else if(idade > 10 && idade <= 30){
        return valorPadrao + valorJovem
    }else if(idade > 30 && idade <= 60){
        return valorPadrao + valorAdulto
    }else if(idade > 60 ){
        return valorPadrao + valorIdoso
    }    
}

console.log('R$ ' + calculaPlanoSaude())
console.log('R$ ' + calculaPlanoSaude(7))
console.log('R$ ' + calculaPlanoSaude(25))
console.log('R$ ' + calculaPlanoSaude(42))
console.log('R$ ' + calculaPlanoSaude(70))