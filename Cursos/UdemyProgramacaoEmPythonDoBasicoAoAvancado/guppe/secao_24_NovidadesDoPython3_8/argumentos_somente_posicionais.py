# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Argumentos Somente Posicionais
"""
#
# valor = '67.3'
# print(float(valor))
#
# def comprimentar_v1(nome):
#     return  f'Olá {nome}'
#
# print(comprimentar_v1('Geek'))
# print(comprimentar_v1(nome='Geek'))
#
# def comprimentar_v2(nome, /):
#     return  f'Olá {nome}'
#
# print(comprimentar_v2('Geek'))
# # print(comprimentar_v2(nome='Geek'))
#
# def comprimentar_v3(nome, /, mensagem='Olá'):
#     return  f'{mensagem} {nome}'
#
# print(comprimentar_v3('Geek'))
# print(comprimentar_v3('University', mensagem='Hello'))
# print(comprimentar_v3('Felicity', 'Bem-vinda'))
#
# def comprimentar_v4(nome, mensagem='Olá', /):
#     return  f'{mensagem} {nome}'
#
# print(comprimentar_v4('Geek'))
# print(comprimentar_v4('Felicity', 'Bem-vinda'))
# # print(comprimentar_v4('University', mensagem='Hello'))

# # O asteristico obriga todos os campos após ele serem obrigatório em uma função
# def comprimentar_v5(*, nome):
#     return f'Olá {nome}'
#
# print(comprimentar_v5(nome='Geek'))
# #print(comprimentar_v5('Geek'))

def comprimentar_v6(nome, /, mensagem1='Olá', *, mensagem2):
    return f'{mensagem1} {nome} {mensagem2}'

print(comprimentar_v6('Geek', mensagem1='Hello', mensagem2='tenha um bom dia'))
print(comprimentar_v6('Geek', mensagem2='tenha um bom dia'))
# print(comprimentar_v6('Geek', 'oi', 'Vamos?'))