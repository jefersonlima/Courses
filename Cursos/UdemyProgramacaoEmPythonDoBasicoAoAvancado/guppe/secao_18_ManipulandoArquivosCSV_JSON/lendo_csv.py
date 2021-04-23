# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
https://dados.gov.br/dataset

CSV - Comma Separeted Values - Valores Separados por Vírgula

#  Separado por Vírgula

1, 2, 3, 4, 5, 6

"Geek", "University", "Python", "Ciência", "Dados"

#  Separado por Ponto e Vírgula

1; 2; 3; 4; 5; 6

"Geek"; "University"; "Python"; "Ciência"; "Dados"

#  Separado por Espaço

1 2 3 4 5 6

"Geek" "University" "Python" "Ciência" "Dados"

#  Possivel de se trabalhar, mas não e o ideal (tranalhoso)
with open('lutadores.csv', encoding='UTF-8') as arquivo:
    dados =  arquivo.read()
    # print(type(dados))
    dados = dados.split(',')[2:]
    print(dados)

A linguagem Python possui duas formas diferentes para ler dados em arquivos CSV:
    - reader -> Permite que iteremos sobre as linhas do arquivo CSV como listas:
    - DictReader -> Permite que iteremos sobre as linhas do arquivo CSV como OrderedDicts:

#  Reader
from csv import reader

with open('lutadores.csv', encoding='UTF-8') as arquivo:
    leitor_csv = reader(arquivo, delimiter=',')
    print(type(leitor_csv))
    next(leitor_csv)
    for linha in leitor_csv:
        # Cada linha é uma lista
        print(f'{linha[0]} nasceu no(a)(s) {linha[1]} e mede {linha[2]} centimetros')

#  Reader
from csv import DictReader

with open('lutadores.csv', encoding='UTF-8') as arquivo:
    leitor_csv = DictReader(arquivo, delimiter=',')
    print(type(leitor_csv))
    for linha in leitor_csv:
        # Cada linha é uma lista
        print(f"{linha['Nome']} nasceu no(a)(s) {linha['País']} e mede {linha['Altura (em cm)']} centimetros")
"""
#  Reader
from csv import DictReader

with open('lutadores.csv', encoding='UTF-8') as arquivo:
    leitor_csv = DictReader(arquivo, delimiter=',')
    print(type(leitor_csv))
    for linha in leitor_csv:
        # Cada linha é uma lista
        print(f"{linha['Nome']} nasceu no(a)(s) {linha['País']} e mede {linha['Altura (em cm)']} centimetros")