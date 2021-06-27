function Pessoa() {
  this.idade = 0;

  // errado
  /*
    setInterval(function(){
        this.idade++
        console.log(this.idade)
    }, 1000)
    */

  // certo
  setInterval(() => {
    this.idade++;
    console.log(this.idade);
  }, 1000);

  // muito encontrado mas errado(funciona)
  /*
    const self = this
    setInterval(function(){
        self.idade++
        console.log(self.idade)
    }, 1000)
    */
}

new Pessoa();
