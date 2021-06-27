// Uma factory retorna um novo objeto
module.exports = () => ({
  valor: 1,
  inc() {
    this.valor++;
  },
});
