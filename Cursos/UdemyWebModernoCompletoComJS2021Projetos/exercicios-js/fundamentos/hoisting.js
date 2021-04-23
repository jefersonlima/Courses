// hoisting só é possivel com var
// com hoisting a variavel é levada para o top
console.log('a =', a)
var a = 2
console.log('a =', a)

// sem hoisting
var a
console.log('a =', a)
a = 2
console.log('a =', a)

// hoisting só não é possivel com let
console.log('a =', a)
let a = 2
console.log('a =', a)


