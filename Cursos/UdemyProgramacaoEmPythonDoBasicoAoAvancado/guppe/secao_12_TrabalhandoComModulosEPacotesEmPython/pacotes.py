"""
Pacotes

Módulo -> É apenas um arquivo Python que pode ter diversas funções para utilizarmos:

Pacote -> É um diretório contendo uma coleção de módulos:

OBS: Nas versões 2.x do Python, um pacote Python deveria conter dentro dele um arquivo chamado __init__.py

Nas versões do Python 3.x, não é mais obrigatória a utilização deste arquivo, mas normalmente ainda é utilizada para
manter compatibilidade.

from guppe.geek import geek1 as g1, geek2 as g2
from guppe.geek.university import geek3 as g3, geek4 as g4

print(g1.pi)
print(g1.funcao1(4, 6))

print(g2.funcao2())

print(g3.funcao3())
print(g4.funcao4())
"""
