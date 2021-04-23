# -*- coding: UTF-8 -*-
"""
Teste de Memória com Generators

def fib_lista(max):
    nums = []
    a, b = 0, 1
    while len(nums) < max:
        nums.append(b)
        a, b = b, a + b
    return nums

#  Teste 1 (45 memoria)
for n in fib_lista(10000):
    print(n)

def fib_gen(max):
    a, b, contador = 0, 1, 0
    while contador < max:
        a, b = b, a + b
        yield a
        contador = contador + 1

#  Teste 2 Geradores (29 memoria)
for n in fib_gen(10000):
    print(n)
"""




