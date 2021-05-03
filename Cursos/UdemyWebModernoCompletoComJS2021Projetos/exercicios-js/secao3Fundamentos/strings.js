const escola = "Cod3r"

console.log(escola.charAt(4))
console.log(escola.charAt(5))                       // fora do indice de um array não gera erro
console.log(escola.charCodeAt(3))                   // retorna um valor da tabela ASCI
console.log(escola.indexOf('3'))                    // retorna o 1º indice do array caso encontre na strig

console.log(escola.substring(1))                    // gera uma substring apartir deste indice
console.log(escola.substring(0, 3))                 // gera uma substring apartir do primeiro indice e vai até(não incluso) o segundo indice

console.log('Escola '.concat(escola).concat("!"))   // Concatenando
console.log('Escola ' + escola + "!")               // Concatenando
console.log(escola.replace(3, 'e'))

console.log('Ana,Maria,Pedro'.split(','))