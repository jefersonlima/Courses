const fabricantes = ['Mercedes', 'Audi', 'BMW'];

function imprimir(nome, indice) {
  console.log(`${indice + 1}. ${nome}`);
}

fabricantes.forEach(imprimir);
fabricantes.forEach((fabricante) => {
  console.log(fabricante);
});
fabricantes.forEach((fabricante) => console.log(fabricante)); // arrow mesma coisa da de cima
