const porta = 3003

const express = require('express')
const app = espress()

app.get('/produtos', (req, res, next) => {
    res.send({ nome: 'Notebook', preco: 123.45}) // Send Converter para JSON
})

app.listen(porta, () => {
    console.log(`Servidor executando na porta ${porta}.`)
})
