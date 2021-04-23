"""
O bloco with

#  1 - Abrimos o arquivo
#  2 - Manipulamos o arquivo
#  3 - Fechamos o arquivo

O block with é utilizado para criar um contexto de trabalho onde os recursos
urilizados são fechados após o bloco with.

arquivo = open('t.txt')
"""

#  O block with - Forma Pythônica de manipular arquivos

with open('texto.txt') as arquivo:
    print(arquivo.readlines())
    print(arquivo.closed)

print(arquivo.closed)