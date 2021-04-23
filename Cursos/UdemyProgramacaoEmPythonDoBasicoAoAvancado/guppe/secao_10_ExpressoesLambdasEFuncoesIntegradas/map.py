"""
Map

Com map, fazemos mapeamento de valores para função.

import math

def area(r):
    #  Calcula a área de um círculo com raio 'r'.
    return math.pi * (r ** 2)

print(area(2))
print(area(5.3))

raios = [2, 5, 7.1, 0.3, 10, 44]
#  Forma comum
print('Forma comum')
areas = []
for r in raios:
    areas.append((area(r)))
print(type(areas))
print(areas)

#  forma 2 - Map
#  Map é uma função que recebe dois parâmetros: O primeiro a função, o segundo um interável. Retorna um Map Object
print('Forma 2')
areas = map(area, raios)

print(areas)
print(type(areas))
print(list(areas))

print(list(map(area, raios))) #  Simplificando em uma linha

#  Forma 3 - Map com Lambda
print('Forma 3')
print(list(map(lambda r: math.pi * (r ** 2), raios)))
#  OBS: Após utilizar a função map() depois da primeira utilização do resultado, ele zera.

#  Para fixar - Map
#  Temos dados interáveis:
#  dados: a1, a2, ..., an
#  Temos uma função:
#  Função: f(x)
#  Utilizamos a função map(f, dados) onde map irá 'mapear' cada elemento dos dados e aplicar a função.
#  O Map Object: f(a1), f(a2), f(...), f(an)

# Mais um exemplo
print('Mais um exemplo')

cidades = [('berlin', 29), ('cairo', 36), ('buenos aires', 19), ('los angeles', 26), ('tokio', 27), ('nova york', 28),
           ('londres', 22)]

print(cidades)

#  f = 9/5 * c + 32

#  Lambda

c_para_f = lambda dado: (dado[0], (9/5)  * dado[1] + 32)

print(list(map(c_para_f, cidades)))
"""

cidades = [('berlin', 29), ('cairo', 36), ('buenos aires', 19), ('los angeles', 26), ('tokio', 27), ('nova york', 28),
           ('londres', 22)]

c_para_f = lambda dado: (dado[0], (9/5)  * dado[1] + 32)





