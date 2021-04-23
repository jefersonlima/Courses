"""


Em aulas anteriores nós estudamos:
- List Comprehension;
- Dictionary Comprehension;
- Ser Comprehension;

Não vimos:
- Tuple Comprehension ... porque elas de chamam Generators
nomes = ['Carlos', 'Camila', 'Carla', 'Cassiano', 'Cristina', 'Vanessa']

print(any([nome[0] == 'C' for nome in nomes]))

#  Poderiamos ter feito utilizando Generators

nomes = ['Carlos', 'Camila', 'Carla', 'Cassiano', 'Cristina', 'Vanessa']

print(any([nome[0] == 'C' for nome in nomes]))

#  List Comprehension
res = [nome[0] == 'C' for nome in nomes]
print(type(res))
print(res)

#  Generator
res = (nome[0] == 'C' for nome in nomes)
print(type(res))
print(res)

#  Qual é a utilidade de getsizeof()? -> Retorna a quantidade de bytes em memória do elemento passado como parâmetro
from sys import getsizeof

#  Mostra quantos bytes a string 'Geek' está ocupando na memória. Quanto maior a string, mais espaço ocupa.
print(getsizeof('Geek'))
print(getsizeof('University'))
print(getsizeof(9))
print(getsizeof(91))
print(getsizeof(92345668823))
print(getsizeof(True))

from sys import getsizeof

#  Gerando uma lista de números com List Comprehension
list_comp = getsizeof([x * 10 for x in range(1000)])
#  Gerando uma lista de números com Set Comprehension
set_comp = getsizeof({x * 10 for x in range(1000)})
#  Gerando uma lista de números com Dictionary Comprehension
dic_comp = getsizeof({x: x * 10 for x in range(1000)})
#  Gerando uma lista de números com Generator Expression
gen = getsizeof(x * 10 for x in range(1000))

print('Para fazer a mesma tarefa gastamos em memória:')
print(f'List Comprehension: {list_comp}')
print(f'Set Comprehension: {set_comp}')
print(f'Dictionary Comprehension: {dic_comp}')
print(f'Generator Expression Comprehension: {gen}')

#  Eu posso interar no Generator Expression
gen = (x * 10 for x in range(1000))

print(type(gen))
print(gen)

for num in gen:
    print(num)
"""




