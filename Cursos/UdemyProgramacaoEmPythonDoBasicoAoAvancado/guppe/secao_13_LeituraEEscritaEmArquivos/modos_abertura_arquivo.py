#!/usr/bin/python
# -*- coding: UTF-8 -*-
import os, sys

"""
Modo de Abertura de Arquivo

#  r -> Abre para leitura - padrão
#  w -> Abre para escrita - sobrescreve caso o arquivo já exista
#  x -> Abre para escrita somente se o arquivo não existir. Caso o arquivo exista, gera FileExistsError
#  a -> Abre para escrita, adicionando o conteúdo ao final do arquivo.
#  + -> Abre para o modo de atualização: leitura e escrita.
#  OBS: Abrimos no modo 'a' -> append, se o arquivo não existir será criado. Caso exista, o novo conteúdo
será adicionado SEMPRE ao final do arquivo. Com o modo 'a', não controlamos o cursor

#  http://docs.python.org/3/library/functions.html#open

#  Exemplo x

try:
    with open('testando.txt', mode='w') as arquivo:
        arquivo.write('Teste de conteúdo.\n')
except (FileExistsError, SyntaxError):
    print('Arquivo já existe!')

#  Exemplo a
with open('cesta1.txt', mode='a', encoding='UTF-8')as arquivo:
    while True:
        fruta = input('Informe uma fruta ou sair: ')
        if fruta != 'sair':
            arquivo.write(fruta + '\n')
        else:
            break

with open('outro.txt', mode='a', encoding='UTF-8')as arquivo:
    arquivo.seek(0)
    arquivo.write('No topo!\n')
    arquivo.write('Nova linha.\n')
    arquivo.write('Mais uma linha.\n')
"""



