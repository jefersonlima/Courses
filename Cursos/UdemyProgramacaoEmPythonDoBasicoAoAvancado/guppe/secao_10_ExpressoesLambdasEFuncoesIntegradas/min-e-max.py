"""
Min e Max

max() -> Retorna o maior valor em um iterável ou o maior de dois ou mais elemento.

#  Exemplos
print('Exemplo 1')

lista = [1, 8, 4, 99, 34, 129]
print(max(lista))

tupla = (1, 8, 4, 99, 34, 129)
print(max(tupla))

conjunto = {1, 8, 4, 99, 34, 129}
print(max(conjunto))

#  Retorna a chave
dicionario = {'a': 1,'b': 8,'c': 4,'d': 99,'e': 34,'f': 129}
print(max(dicionario))
# Retorna o valor
dicionario = {'a': 1,'b': 8,'c': 4,'d': 99,'e': 34,'f': 129}
print(max(dicionario.values()))

#  Exemplo 2
print('Exemplo 2')

#  Faça um programa que receba dois valores do usuário e mostre o maior
val1 = int(input('Informe o primeiro valor: '))
val2 = int(input('Informe o segundo valor: '))

print(max(val1, val2))

#  Exemplo 3
print('Exemplo 3')

print(max(4, 67, 54))
print(max('a', 'ab', 'abc'))
print(max('a', 'b', 'c', 'g'))
print(max(3.145, 5.789))
print(max('Geek University'))

min() -> Retorna o menor valor em um iterável ou o menor de dois ou mais elementos

print('Exemplo 5')

lista = [1, 8, 4, 99, 34, 129]
print(min(lista))

tupla = (1, 8, 4, 99, 34, 129)
print(min(tupla))

conjunto = {1, 8, 4, 99, 34, 129}
print(min(conjunto))

#  Retorna a chave
dicionario = {'a': 1,'b': 8,'c': 4,'d': 99,'e': 34,'f': 129}
print(min(dicionario))
# Retorna o valor
dicionario = {'a': 1,'b': 8,'c': 4,'d': 99,'e': 34,'f': 129}
print(min(dicionario.values()))

#  Exemplo 6
print('Exemplo 6')

#  Faça um programa que receba dois valores do usuário e mostre o maior
val1 = int(input('Informe o primeiro valor: '))
val2 = int(input('Informe o segundo valor: '))

print(min(val1, val2))

#  Exemplo 7
print('Exemplo 7')

print(min(4, 67, 54))
print(min('a', 'ab', 'abc'))
print(min('a', 'b', 'c', 'g'))
print(min(3.145, 5.789))
print(min('Geek University'))

#  Exemplo 8
print('Exemplo 8')

nomes = ['Arya', 'Samson', 'Dora', 'Tim', 'Ollivander']

print(max(nomes))
print(min(nomes))

print(max(nomes, key=lambda nome: len(nome)))
print(min(nomes, key=lambda nome: len(nome)))

#  Exemplo 9
print('Exemplo 9')

musicas = [
    {"titulo": "Thunderstruck", "tocou": 3},
    {"titulo": "Dead Skin Mask", "tocou": 2},
    {"titulo": "Back in Black", "tocou": 4},
    {"titulo": "Too old to rock 'in' roll, too ynoung to die", "tocou": 32}
]

print(max(musicas, key=lambda musica: musica['tocou']))
print(min(musicas, key=lambda musica: musica['tocou']))

#  DESAFIO: Imprima somente o título da música mais e menos tocada
print(max(musicas, key=lambda musica: musica['tocou'])['titulo'])
print(min(musicas, key=lambda musica: musica['tocou'])['titulo'])

# DESAFIO: Como encontrar a música mais tocada e a menos tocada sem usar max(), min() e lambda?

max = 0
for musica in musicas:
    if musica['tocou'] > max:
        max = musica['tocou']

for musica in musicas:
    if musica['tocou'] == max:
        print(musica['titulo'])

min = 99999
for musica in musicas:
    if musica['tocou'] < min:
        min = musica['tocou']

for musica in musicas:
    if musica['tocou'] == min:
        print(musica['titulo'])
"""

