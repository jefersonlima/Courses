# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
DocTests

"""
def duplicar(valores):
    """duplica os valores em uma lista"""

    #>>> [duplicar([1, 2, 3, 4])]
    [2, 4, 6, 8]

    #>>> duplicar([]])
    []

    #>>> duplicar(['a', 'b', 'c'])
    ['aa', 'bb', 'cc']

    return [2 * elemento for elemento in valores]

