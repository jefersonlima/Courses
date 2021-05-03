const prod1 = {}                // instancia um objeto 

prod1.nome = 'Celular Ultra Mega'
prod1.preco = 4998.90
prod1['Desconto Legal'] = 0.40  // evitar atributos com espaço

console.log(prod1)

const prod2 = {
    nome: 'Camisa Polo',
    preco: 79.90
}

prod2['Desconto Legal'] = 0.40  // evitar atributos com espaço
console.log(prod2)

// exemplo de Json
'{"Nome": "Camisa Polo", "preco": 79.90 }'
// OBS:  JSON NÃO É IGUAL A UM OBJETO, JSON É UM FORMATO TEXTUAL