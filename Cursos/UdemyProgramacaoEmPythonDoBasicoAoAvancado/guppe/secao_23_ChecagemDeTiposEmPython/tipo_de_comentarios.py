# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Tipo de Comentários
"""
import math

def circunferencia(raio) :
    # type: (float) -> float
    return 2 * math.pi * raio

#  Errado
# def circunferencia(raio: float) -> float:
#     # type: (float) -> float
#     return 2 * math.pi * raio

def cabecalho1(texto, alinhamento=True):
    # type: (str, bool) -> str
    if alinhamento:
        return 'a'
    else:
        return 'b'

# cabecalho1(texto=43, alinhamento='geek')

def cabecalho2(
        texto, # type: str
        alinhamento=True # type: bool
):  # type: (...) -> str
    if alinhamento:
        return 'a'
    else:
        return 'b'

# cabecalho2(texto=43, alinhamento='geek')

