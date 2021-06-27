let textoDividido;
let posicao = 0;
function leituraStatica(texto) {
  textoDividido = texto.split(' ');
  imprimir();
}
function imprimir() {
  setInterval(() => {
    if (posicao < textoDividido.length) {
      console.log(textoDividido[posicao]);
      posicao++;
    } else {
      // decobrir como parar o setInterval
      clearInterval(null);
      console.log('decobrir como parar o setInterval');
    }
  }, 1000); // 1000 500 350
}
// a ideia é pegar um arquivo de texto ou pdf como entrada
const textoTeste = 'Por ser rica em água, potássio e magnésio, a melancia contribui para a manutenção de uma pressão arterial normal. Além disso, o licopeno também ajuda a reduzir a pressão arterial e o colesterol, assim como evitar os a oxidação do colesterol nas artérias';
leituraStatica(textoTeste);
