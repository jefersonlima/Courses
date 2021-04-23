# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Operador Walrus

O operador Walrus permite fazer a atribuição e retorno de valor em um única expressão.

variavel := expressão
"""

# # Sem Walrus
# nome = 'Geek University'
# print(nome)
#
# # Com Walrus
# print(nome := 'Geek University')
#
# #  Python 3.7
# cesta = []
# fruta = input('Informe a fruta: ')
# while fruta != 'jaca':
#     cesta.append(fruta)
#     fruta = input('Informe a fruta: ')

#  Python 3.8
cesta = []
while (fruta := input('Informe a fruta: ')) != 'jaca':
    cesta.append(fruta)


