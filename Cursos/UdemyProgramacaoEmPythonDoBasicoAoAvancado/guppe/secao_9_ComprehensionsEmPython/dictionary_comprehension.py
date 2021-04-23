"""
Dictionary Comprehension

Pense no seguinte:

Se quisermos criar uma lista fazemos:

lista = [1, 2, 3, 4]

Se quisermos criar uma tupla fazemos:

tupla = (1, 2, 3, 4)

Se quisermos criar uma set(conjunto) fazemos:

conjunto = {1, 2, 3, 4}

Se quisermos criar uma dicionário fazemos:

dicionario = {'a':1, 'b':2, 'c':3, 'd':4}

#  Sintaxy

{chave:valor for valor in interavel}

#  Exemplos
numeros = {'a':1, 'b':2, 'c':3, 'd':4, 'e':5}
quadrado = {chave: valor ** 2 for chave, valor in numeros.items()}

print(numeros)
print(quadrado)

#  de lista para dicionario
numeros = [1, 2, 3, 4, 5]
quadrados = {valor: valor ** 2 for valor in numeros}

print(quadrados)

#  de tupla para dicionario
numeros = (1, 2, 3, 4, 5)
quadrados = {valor: valor ** 2 for valor in numeros}

print(quadrados)

#  de set(conjunto) para dicionario
numeros = {1, 2, 3, 4, 5}
quadrados = {valor: valor ** 2 for valor in numeros}

print(quadrados)

#  de uma string + lista para dicionario
chaves = 'abcde'
valores = [1, 2, 3, 4, 5]

mistura = {chaves[i]: valores[i] for i in range(0, len(chaves))}
print(mistura)

#  Exemplos com lógica condicional

numeros = [1, 2, 3, 4, 5]

res = {num:('par' if num % 2 == 0 else 'impar') for num in numeros}
print(res)
"""




