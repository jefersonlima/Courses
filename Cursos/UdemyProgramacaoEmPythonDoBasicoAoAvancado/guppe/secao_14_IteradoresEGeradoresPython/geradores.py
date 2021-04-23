# -*- coding: UTF-8 -*-
"""
Geradores

- Geradores (Generators) são Iterators (Iteradores):

OBS: O contrario não é verdadeiro. Ou seja, nem t*odo iterator é um generator.

Outras informações:
- Generators podem ser criados com funções geradores;
- Funções feradoras utilizam a palavra reservada yield;
- Generators podem ser criados com Expressões Geradoras;

Diferenças entre Funções e Generator Functions (Funções Geradoras)

==================================================================================
| Funções                               | Generator Functions                    |
==================================================================================
| utilizam return                       | utilizam yield                         |
----------------------------------------------------------------------------------
| retorna uma vez                       | podem utilizar yield múltiplas vezes   |
----------------------------------------------------------------------------------
| quando executada, retorna um valor    | quando executada, retorna um generator |
----------------------------------------------------------------------------------

#  Exemplo Função Geradora (Generator Funcion)

def conta_ate(valor_maximo):
    contador = 1
    while contador <= valor_maximo:
        yield contador
        contador = contador + 1

#  OBS: Uma Generator Function não é um Generator. Ela gera um generator. ok?

gen = conta_ate(5)

print(type(gen))

print(next(gen))
print(next(gen))
print(next(gen))
print(next(gen))
print(next(gen))

#  Exemplo Função Geradora (Generator Funcion)

def conta_ate(valor_maximo):
    contador = 1
    while contador <= valor_maximo:
        yield contador
        contador = contador + 1

#  OBS: Uma Generator Function não é um Generator. Ela gera um generator. ok?

gen = conta_ate(10)

for num in gen:
    print(next(gen))

#  Exemplo Função Geradora (Generator Funcion)

def conta_ate(valor_maximo):
    contador = 1
    while contador <= valor_maximo:
        yield contador
        contador = contador + 1

#  OBS: Uma Generator Function não é um Generator. Ela gera um generator. ok?

gen = conta_ate(10)

print(next(gen))

print('Geek')

for num in gen:
    print(num)

#  Gerando uma lista
gen = list(conta_ate(12))
print(gen)
"""


