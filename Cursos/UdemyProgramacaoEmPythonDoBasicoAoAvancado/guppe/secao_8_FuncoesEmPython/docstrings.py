"""
Documentando funções com Docstrings

OBD: Podemos ter acesso á documentação de uma função em Python
utilizanfo a propriedade especial .__doc__
"""

#  print(help(print()))

def diz_oi():
    """
    Uma função simples que retorna a string 'Oi!'
    """
    return 'Oi!'

print(diz_oi())
print(help(diz_oi))
print(diz_oi.__doc__)

def exponencial(numero, potencia=2):
    """
    Função que retorna por padrão o quadrado de um 'numero' ou o 'numero' á 'potência' informada.
    :param numero: Numero que desejamos gerar o exponencial.
    :param potencia: Pôtencia que queremos gerar o exponencial. por padrão é 2.
    :return: Retorna o exponencial de 'numeros' por 'pontencia'
    """
    return  numero ** potencia

print(exponencial(2))
print(help(exponencial))
print(exponencial.__doc__)