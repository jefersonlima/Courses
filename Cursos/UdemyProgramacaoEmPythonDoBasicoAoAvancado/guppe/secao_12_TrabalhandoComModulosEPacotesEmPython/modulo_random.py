"""
Módulo Random e o que são módulos?

- Em Python, módulos nada mais são do que outros arquivos Python.

Módulo Random -> Possui várias funções para geração de números pseudo-aleatório.

#  OBS: Existem duas formas de se utilizar um módulo ou função deste
#  Forma 1 - Importando t'odo o módulo (Não recomendado).

import random

#  random() -> Gera um número pseudo-aleatório entre 0 e 1

# OBS: Ao realizar o import de t'odo o módulo. todas as funções, atributos, classes e propriedade que estiverem
#  dentro do módulo ficarão disponiveis (Ficarão em Memória). Caso você saiba quais funções você precisa utilizar
#  deste módulo, então esta não seria a forma ideal de utilização. Nós veremos uma forma melhor na Forma 2.

print(random.random())

#  Veja que para utilizar a função random() do pacote random, nós colocamos o nome do pacote e o nome da função.
#  separados por ponto.

#  OBS: Não confunda a função random() com o pacore random. Pode parecer confuso. mas a função random() é
#  apenas uma função dentro do módulo random.

#  Forma 2 - Importando uma função específica do módulo (Forma recomendada)

from random import random

#  No import acima, estamos falando: Do módulo random, importe a função random

for i in range(10):
    print(random())

#  Forma 3

#  uniform() -> Gerar um número pseudo-aleatório entre os valores estabecidos

from random import uniform

for i in range(10):
    print(uniform(3, 7))  #  7 não é incluído.

#  Gerador de apostas para a mega-sena
from random import randint

for i in range(6):
    print(randint(0, 61), end=', ')

#  50, 14, 60, 20, 24, 36 #  Rodado pela primeira vez

#  choice() -> Mostra um valor aleatório entre um iterável.
from random import choice

jogadas = ['pedra', 'papel', 'tesoura']

print(choice(jogadas))

print(choice('Geek university'))

#  shuffle() -> tem a função de embaralhar dados
from random import shuffle

cartas = ['K', 'Q', 'J', 'A', '2', '3', '4', '5', '6', '7']

print(cartas)

shuffle(cartas) #  Embaralha

print(cartas)
print(cartas.pop()) #  Tira a ultima
"""





