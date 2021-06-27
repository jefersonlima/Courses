/*
19) O cardápio de uma lanchonete é o seguinte:
Código Descrição do Produto Preço
100 Cachorro Quente R$ 3,00
200 Hambúrguer Simples R$ 4,00
300 Cheeseburguer R$ 5,50
400 Bauru R$ 7,50
500 Refrigerante R$ 3,50
600 Suco R$ 2,80
Implemente uma função que receba como parâmetros o código do item pedido, a quantidade e calcule o valor
a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item. Use o
comando switch. Crie um caso default para produto não existente.
*/

function calculaCardapio(codItem, quantidade = 1) {
  switch (codItem) {
    case 100:
      return `${quantidade} Cachorro Quente R$ ${3 * quantidade}`;
    case 200:
      return `${quantidade} Hambúrguer Simples R$ ${4 * quantidade}`;
    case 300:
      return `${quantidade} Cheeseburguer R$ ${5.5 * quantidade}`;
    case 400:
      return `${quantidade} Bauru R$ ${7.5 * quantidade}`;
    case 500:
      return `${quantidade} Refrigerante R$ ${3.5 * quantidade}`;
    case 600:
      return `${quantidade} Suco R$ ${2.8 * quantidade}`;
    default:
      return 'produto não existente';
  }
}

console.log(calculaCardapio(100));
console.log(calculaCardapio(200, 2));
console.log(calculaCardapio(300, 2));
console.log(calculaCardapio(400, 2));
console.log(calculaCardapio(500, 2));
console.log(calculaCardapio(600, 2));
console.log(calculaCardapio(700, 2));
