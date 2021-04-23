# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Escrevendo em arquivos CSV

reader() (leitor), writer() (escritor)

writerow() -> Escreve uma linha

#  writer() -> Gera um objeto para que possamos escrever em um arquivo CSV, Utilizamos o método
#  writerow() -> Para escrever cada linha. Este método recebe uma lista.

from csv import writer

with open('filmesWriter.csv', 'a') as arquivo:
    escritor_csv = writer(arquivo)
    filme = None
    #  Cabeçalho
    #  Melhorar para nao escrever novamente caso ja exista o arquivo
    escritor_csv.writerow(['Título', 'Gênero', 'Duração', 'classificação'])
    #  linhas do arquivo
    while filme != 'sair':
        filme = input('Informe o nome do filme: ')
        if filme != 'sair':
            genero = input('Informe o gênero: ')
            duracao = input('Informe a duração (em minutos): ')
            classificacao = input('Informe a Classificação: ')
            escritor_csv.writerow([filme, genero, duracao, classificacao])
"""

#  DictWriter

#  OBS:
from csv import DictWriter

with open('filmesDictWriter.csv', 'a') as arquivo:
    #  Cabeçalho
    #  Melhorar para nao escrever novamente caso ja exista o arquivo
    cabecalho = ['Título', 'Gênero', 'Duração', 'Classificação']

    escritor_csv = DictWriter(arquivo, fieldnames=cabecalho)
    escritor_csv.writeheader()
    filme = None

    #  linhas do arquivo
    while filme != 'sair':
        filme = input('Informe o nome do filme: ')
        if filme != 'sair':
            genero = input('Informe o gênero: ')
            duracao = input('Informe a duração (em minutos): ')
            classificacao = input('Informe a Classificação: ')
            escritor_csv.writerow({"Título": filme, "Gênero": genero, "Duração": duracao, "Classificação": classificacao})
