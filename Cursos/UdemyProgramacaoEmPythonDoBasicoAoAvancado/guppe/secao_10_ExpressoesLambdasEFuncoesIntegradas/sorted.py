"""
Sorted

OBS: Não comfunda, apesar do nome, com a função sort() que já estudamos em Listas. O sort()
só funciona em listas.

Podemos utilizar o sorted() com qualquer interável.

Como o próprio nome diz, sorted() serve para ordenar.

OBS: O sorted,  SEMPRE  retorna uma lista com os elementos do interável ordenados
OBS:
sort modifica a propria lista
sorted cria uma nova lista

#  Exemplo 1
print('Exemplo 1')

numeros = [6, 1, 8, 2]
print(numeros)

print(sorted(numeros))  #  Ordenar do menor para o maior

print(numeros)

#  Exemplo 2
print('Exemplo 2 tupla')

numeros = (6, 1, 8, 2)
print(numeros)

print(sorted(numeros))  #  Ordenar do menor para o maior

print(numeros)

#  Exemplo 3
print('Exemplo 2 set')

numeros = {6, 1, 8, 2}
print(numeros)

print(sorted(numeros))  #  Ordenar do menor para o maior

print(numeros)

#  Exemplo 4 sorted reverse
print('Exemplo 4')

numeros = [6, 1, 8, 2]
print(numeros)

print(sorted(numeros))
#  Adicionando Parâmetros ao sorted()
print(sorted(numeros, reverse=True))

#  Exemplo 5
print('Exemplo 5')
#  Podemos utilizar o sorted() para coisas mais complexas

usuarios = [
    {"username": "samuel", "tweets": ["Eu adoro bolos", "Eu adoro pizzas"]},
    {"username": "carla", "tweets": ["Eu amo meu gato"]},
    {"username": "jeff", "tweets": []},
    {"username": "bob123", "tweets": [], "cor": "amarelo"},
    {"username": "doggo", "tweets": ["Eu gosto de cachorros", "vou sair hoje!"]},
    {"username": "gal", "tweets": [], "cor": "preto", "musica": "rock"}
]

print(usuarios)
print(sorted(usuarios, key=len))

#  Ordenando por username - Ordem alfabética
print(sorted(usuarios, key=lambda usuario: usuario["username"]))
print(sorted(usuarios, key=lambda usuario: usuario["username"], reverse=True))

#  Ordenando pelo número de tweets
print(sorted(usuarios, key=lambda usuario: len(usuario["tweets"])))

#  Exemplo 6
print('Exemplo 6')

musicas = [
    {"titulo": "Thunderstruck", "tocou": 3},
    {"titulo": "Dead Skin Mask", "tocou": 2},
    {"titulo": "Back in Black", "tocou": 4},
    {"titulo": "Too old to rock 'in' roll, too ynoung to die", "tocou": 32}
]

#  Ordena da menos tocada para a menos tocada
print(sorted(musicas, key=lambda musica: musica['tocou']))

#  Ordena da menos tocada para a mais tocada
print(sorted(musicas, key=lambda musica: musica['tocou'], reverse=True))
"""





