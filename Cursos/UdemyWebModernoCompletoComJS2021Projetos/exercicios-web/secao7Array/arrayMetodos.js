const pilotos = ['Vettel', 'Alonso', 'Raikkonen', 'Massa'];

pilotos.pop(); // remove o ultimo do array (massa quebou o carro)
console.log(pilotos);

pilotos.push('Verstappen'); // adiciona na ultima posicao
console.log(pilotos);

pilotos.shift(); // remove na primeira posição do array
console.log(pilotos);

pilotos.unshift('Hamilton'); // adiciona na primeira posicao
console.log(pilotos);

// splice pode adicionar e remover elementos
// adicionar
pilotos.splice(2, 0, 'Bottas', 'Massa');
console.log(pilotos);

// remover
pilotos.splice(3, 1); // retira da posicao solicitada a quantidade solicitada a partir daquele ponto (massa quebrou)
console.log(pilotos);

const algunsPilotos1 = pilotos.slice(2); // cria um novo array aparti da posição solicitada
console.log(algunsPilotos1);

const algunsPilotos2 = pilotos.slice(1, 4); // cria um arrey da possição solicita até(não incluso) a possição definida
console.log(algunsPilotos2);
