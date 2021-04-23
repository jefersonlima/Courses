"""
O bloco try/except

Utilizamos o bloco try/except para tratar erros que podem ocorrer no nosso código. Prevenindo assim que o programa pare
de funcionar e o usuário receba mensagens de erro inesperadas.

A forma geral mais simples é:
try:
    //execução problemática
except:
    //o que deve ser feito em caso de problema

#  exemplo 1 - Tratando um erro genérico

try:
    geek()
except:
    print('Deu algum problema')

#  Tente executar a função geek(), caso você encontre erros, imprima uma mensagem de erro.


#  exemplo 2 - Tratando erro genérico

try:
    len(5)
except:
    print('Deu algum problema')

#  OBS: Tratar erro de forma genérica não é a melhor forma de tratamento de erros, o ideal é SEMPRE
tratar de forma específica.

#  exemplo 3 - tratando um erro específico

try:
    geek()
except NameError:
    print('Você está utilizando um função inexistente')

#  exemplo 4 - tratando um erro específico

try:
    len(5)
except TypeError:
    print('Você está utilizando um função inexistente')

#  exemplo 5 - tratando um erro específico com detalhe de erros

try:
    len(5)
except TypeError as err:
    print(f'A aplicação gerou o seginte erro {err}')

try:
    print('geek'[9])
    len(5)
    geek()
except NameError as erra:
    print(f'Deu NameError: {erra}')
except TypeError as erra:
    print(f'Deu TypeError: {erra}')
except:
    print('Deu um erro diferente')

#  exemplo 6

def pega_valor(dicionario, chave):
    try:
        return dicionario[chave]
    except KeyError:
        return None
    except TypeError:
        return None


dic = {"nome": "Geek"}

print(pega_valor(dic, "nome"))
print(pega_valor(dic, "game"))
print(pega_valor(7, "game"))
print(pega_valor(dic, 8))
"""






