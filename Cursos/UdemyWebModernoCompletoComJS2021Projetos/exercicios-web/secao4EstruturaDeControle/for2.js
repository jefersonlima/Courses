const notas = [6.7, 7.4, 9.8, 8.1, 7.7];

for (const i in notas) {
  console.log(i, notas[i]);
}

const pessoa = {
  nome: 'Ana',
  sobrenome: 'Silva',
  idade: 29,
  peso: 64,
};

for (const atributo in pessoa) {
  console.log(`${atributo} = ${pessoa[atributo]}`);
}

// console.log(atributo)
