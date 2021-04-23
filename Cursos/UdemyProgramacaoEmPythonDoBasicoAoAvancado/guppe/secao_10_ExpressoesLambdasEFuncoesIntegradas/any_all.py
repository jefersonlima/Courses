"""
Any e All

all() -> Retorna True se todos os elementos do interável são verdadeiros ou ainda se o interável está vazio.

#  Exemplo all()

print(all([0, 1, 2, 3, 4])) #  Todos os números são verdadeiro? False
print(all([1, 2, 3, 4])) #  Todos os números são verdadeiro? True
print(all([])) #  Todos os números são verdadeiro? True
print(all((1, 2, 3, 4))) #  Todos os números são verdadeiro? True
print(all({1, 2, 3, 4})) #  Todos os números são verdadeiro? True
print(all('Geek')) #  Todos os números são verdadeiro? True


nomes = ['Carlos', 'Camila', 'Carla', 'Cassiano', 'Cristina']
print(all(nome[0] == 'C' for nome in nomes))
nomes = ['Carlos', 'Camila', 'Carla', 'Cassiano', 'Cristina', 'Daniel']
print(all(nome[0] == 'C' for nome in nomes))

#  OBS: Um interável vazio convertido em boolean é False, mas o all() entende como True
print(all(letra for letra in 'ieo' if letra in 'aeiou')) #  Se tiver uma valor pertencente ele retorna true

print(all([num for num in [4, 2, 10, 6, 8] if num % 2 == 0]))

any() -> Retorna true se qualquer elemento do interável for verdadeiro. Se o interável estiver vazio, retorna False

print(any([0, 1, 2, 3, 4])) #  True
print(any([0, False, {}, (), []])) #  False

nomes = ['Carlos', 'Camila', 'Carla', 'Cassiano', 'Cristina', 'Vanessa']
print(any(nome[0] == 'C' for nome in nomes))
"""


