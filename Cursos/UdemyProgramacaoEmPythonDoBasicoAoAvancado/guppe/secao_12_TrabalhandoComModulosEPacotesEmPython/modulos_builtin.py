"""
Trabalhando com Módulos Builtin (módulos integrados, que já vem instalados no Python)

httos://docs.python.org/3/py-modindex.html
________________________
|Python|Módulos Builtin|
------------------------

#  utilizando alias (apelidos) para módulos/funções
#  Apelido no Módulo
import random as rdm
#  print(rdm.random())

#  Apelido na função
from random import randint as rdi, random as rdm
print(rdi(5,89))
print(rdm())

print(rdm.random())
#  from random import random

#  Podemos importar todas as funções de um módulo utilizando o *
#  import random # está importando tudo mas para usar precisa chamar o módulo seguido de ponto + o nome da funçao
#  print(random.random())

#  Importando t'odo o modulo
from random import * #  assim é só usar a função sem precisar charmar com o modulo
print(random())

#  Costumamos utilizar tuple para colocar multiplos imports de um mesmo módulo
#  errado
from random import random, randint, shuffle, choice
#  Correto
from random import (
    random,
    randint,
    shuffle,
    choice
)
print(random())
print(randint(3, 7))

lista = ['Geek', 'University', 'Python']
shuffle(lista)
print(lista)

print(choice('University'))
"""
