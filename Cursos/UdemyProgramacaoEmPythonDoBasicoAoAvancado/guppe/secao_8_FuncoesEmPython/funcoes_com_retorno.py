"""
Funções com retorno

numeros = [1, 2, 3]

ret_pop = numeros.pop()
print(f'Retorno de pop: {ret_pop}')

ret_print = print(numeros)

print(f'Retorno de print: {ret_print}')


# sem retorno
def quadrado_de_7():
    print(7 * 7)

ret = quadrado_de_7()

print(f'Retorno: {ret}')

# com retorno
def quadrado_de_7_com_retorno():
    return 7 * 7

ret = quadrado_de_7_com_retorno()

print(f'Retorno: {ret}')

numero_calcular_quadrado = 1

def quadrado_de_Numeros_com_retorno(numero_calcular_quadrado ):
    return numero_calcular_quadrado * numero_calcular_quadrado

ret = quadrado_de_Numeros_com_retorno()

print(f'Retorno numero: {ret}')

OBS: Sobre a palavra reservada return

1- Ela finaliza a funçao, ou seja, ela sai da execuçao da funçao;
# Exemplo 1

def diz_oi():
    print('Estou sendo executado antes do retorno...')
    return 'oi! '
    print('Estou sendo executado Depois do retorno...')

diz_oi()

2- Podemos term em uma função, diferentes retunrd;
# Exemplo 2
def nova_funcao():
    variavel = True
    # variavel = None
    # variavel = False
    if variavel:
        return 4
    elif variavel is None:
        return 3.2
    return  'b'

print(nova_funcao())

3- Podemos, em uma funçao, retotnar qualquer tipo de dado e até mesmo muiltiplos valores;
# Exemplo 3

def outra_funcao():
    return 2, 3, 4, 5


#num1, num2, num3, num4 = outra_funcao()

#print(num1, num2, num3, num4)

print(outra_funcao())
print(type(outra_funcao()))

# Vamos criar uma funçao para jogar a moeda

from random import random

def joga_moeda():
    #Gera um numero pseudo randomico entre 0 e 1

    valor = random()

    if valor > 0.5:
        return 'Cara'
    return 'Coroa'

def pedra_papel_tesoura():
    valor = random()

    if valor < 0.33:
        return 'pedra'
    elif 0.33 <= valor < 0.66:
        return 'papel'
    return 'tesoura'

print(joga_moeda())
print(pedra_papel_tesoura())
"""











