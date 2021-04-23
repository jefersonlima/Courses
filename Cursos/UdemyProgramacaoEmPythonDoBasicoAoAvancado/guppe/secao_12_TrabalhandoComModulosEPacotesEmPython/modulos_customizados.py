"""
Módulos Customizados

Como módulos Python nada mais são do que arquivos Python, Então TODOS os arquivos que criamos
neste curso são módulos Python prontos para serem utilizados.

#  ### CORRIGIDO ###
#  Resolver isso no futuro devido eu ter organizado por diretórios e o professor nao fez isso por isso não consigo
#  Importar igual o exemplo dessa aula

from guppe.secao_8_FuncoesEmPython import funcoes_com_parametros as fcp
print(fcp.soma_impares([1, 2, 3, 4, 5, 6, 7, 8, 9]))

print(soma_impares([1, 2, 3, 4, 5, 6, 7, 8, 9]))

#  Importando todo o módulo (Temos acesso a TODOS os elementos do módulo)
from guppe.secao_8_FuncoesEmPython import funcoes_com_parametros as fcp

#  Estamos acessando e imprimindo uma variável contida no módulo

print(fcp.lista)
print(fcp.tupla)

print(fcp.soma_impares(fcp.lista))

from guppe.secao_10_ExpressoesLambdasEFuncoesIntegradas import map as m
print(list(map(m.c_para_f, m.cidades)))
"""


