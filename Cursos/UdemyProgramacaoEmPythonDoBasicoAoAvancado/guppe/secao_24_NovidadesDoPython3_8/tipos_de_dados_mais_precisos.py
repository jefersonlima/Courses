# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Tipos de Dados Mais Precisos

# int, str, float, List, Set, Dict, etc
"""
from typing import Literal
#
# def calcula_v1(operacao: str, num1: int, num2: int) -> None:
#     if operacao == '+':
#         print(f'{num1} + {num2} = {num1 + num2}')
#     elif operacao == '-':
#         print(f'{num1} - {num2} = {num1 - num2}')
#     else:
#         raise ValueError(f'Operação inválida {operacao!r}')
#
# calcula_v1('+', 6, 4)
# calcula_v1('-', 10, 2)
# # calcula_v1('*', 3, 5)

# def calcula_v2(operacao: Literal['+', '-'], num1: int, num2: int) -> None:
#     if operacao == '+':
#         print(f'{num1} + {num2} = {num1 + num2}')
#     elif operacao == '-':
#         print(f'{num1} - {num2} = {num1 - num2}')
#     else:
#         raise ValueError(f'Operação inválida {operacao!r}')
#
# calcula_v2('+', 6, 4)
# calcula_v2('-', 10, 2)
# # calcula_v2('*', 3, 5)

# #Union
# from typing import Union
#
# def soma(num1: int, num2: int) -> Union[str, int]:
#     resultado: int = num1 +  num2
#
#     if resultado > 50:
#         return f'O valor {resultado} é muito grande.'
#     else:
#         return resultado
#
# print(soma(1, 50))
# print(soma(1, 30))

# from typing import Final
#
# NOME: Final =  'Geek'
#
# print(NOME)
#
# NOME = 'University'
#
# print(NOME)

# from typing import final
#
# @final
# class Pessoa:
#     pass
#
# class Estudante(Pessoa):
#     pass
#
#     @final
#     def estudar(self):
#         print('Estou estudando...')
#
# class Estagiario(Estudante):
#     pass
#
#     def estudar(self):
#         print('Estudando e Estagiando...')

# from typing import TypedDict
#
# class CursoPython(TypedDict):
#     versao: str
#     atualizacao: int
#
# geek = CursoPython(versao='3.8.5', atualizacao=2020)
#
# print(geek)
#
# outro = CursoPython(algo='vai', coisa=True)
#
# print(outro)

# Protocols
from typing import Protocol

class Curso(Protocol):
    titulo: str

def estudar(valor: Curso) -> None:
    print(f'Estou estudando o curso {valor.titulo}')

class Venda:
    titulo = 'Python'

v1 = Venda()
# c1 = Curso()
# c1.titulo = 'Programação em Python'

# estudar(c1)
estudar(v1)
