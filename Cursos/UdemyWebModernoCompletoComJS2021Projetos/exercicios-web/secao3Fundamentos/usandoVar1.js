// variavel VAR tem escopo Global e Escopo de função
{
    {
        {
            {
                var sera = 'Será!'
                console.log(sera)

                // fora de uma function tem escopo global
            }
        }
    }
}
console.log(sera)

function teste(){
    var local = 123
    console.log(local)

    // dentro de uma function tem escopo local
}

teste()
// console.log(local)