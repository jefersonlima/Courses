const pessoa = {
  saudacao: 'Bom dia!',
  falar() {
    console.log(this.saudacao);
  },
};

pessoa.falar(); // correto
const { falar } = pessoa;
falar(); // conflito entre paradigmas: funcional e OO

const falarDePessoa = pessoa.falar.bind(pessoa);
falarDePessoa();
