const soma = function (x, y) {
  return x + y;
};

const imprimirResultado = function (a, b, operacao = soma) {
  console.log(operacao(a, b));
};

imprimirResultado(3, 4);
imprimirResultado(3, 4, soma);
imprimirResultado(3, 4, (x, y) => x - y);
imprimirResultado(3, 4, (x, y) => x * y);

const pessoa = {
  falar() { // desatualizado
    // falar(){ //nova versão tambem da certo
    console.log('Opa');
  },
};

pessoa.falar();
