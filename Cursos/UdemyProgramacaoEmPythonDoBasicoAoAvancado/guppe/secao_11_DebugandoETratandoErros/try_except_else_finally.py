"""
Try / Except / Else / Finally

Dica de quando e onde tratar código:

TODA ENTRADA DEVE SER TRATADA!

OBS: A função do usuário é DESTRUIR seu sistema.

#  Else -> É executado somente se não ocorrer o erro.

try:
    num = int(input('Informe um número: '))
except ValueError:
    print('Valor incorreto')
else:
    print(f'Você digitou {num}')

#  Finally
try:
    num = int(input('Informe um número: '))
except ValueError:
    print('Valor incorreto')
else:
    print(f'Você digitou {num}')
finally:
    print('Executando o finaly')

#  OBS: O bloco finally é SEMPRE executado. Independente se ouver ou não exceção ou não.

#  O finally, geralmente, é utilizado para fechar ou desalocat recursos
#  Exemplo: fechar conexões com banco de daddos

#  Exemplo mais complexo ERRADO

def dividir(a, b):
    return a / b

try:
    num1 = int(input('Informe o primeiro número: '))
    num2 = int(input('Informe o segundo número: '))
except ValueError:
    print('O valor precisa ser numérico')
else:
    print(dividir(num1, num2))

#  Exemplo mais complexo CORRETO
#  OBS: Você é responsavel pelas entradas das suas funçãos. Então, trate-as!
#  de Prefêndia fazer o tratamento na função

def dividir(a, b):
    try:
        return int(a) / int(b)
    except ValueError:
        return 'Valor incorreto'
    except ZeroDivisionError:
        return 'Não é possível  realizar uma divisão por zero'


num1 = input('Informe o primeiro número: ')
num2 = input('Informe o segundo número: ')

print(dividir(num1, num2))

#  Exemplo mais complexo CORRETO genérico
#  OBS: Você é responsavel pelas entradas das suas funçãos. Então, trate-as!
#  de Prefêndia fazer o tratamento na função

def dividir(a, b):
    try:
        return int(a) / int(b)
    except:
        return 'Ocorreu um Problema'



num1 = input('Informe o primeiro número: ')
num2 = input('Informe o segundo número: ')

print(dividir(num1, num2))

#  Exemplo mais complexo CORRETO semi-genérico
#  OBS: Você é responsavel pelas entradas das suas funçãos. Então, trate-as!
#  de Prefêndia fazer o tratamento na função

def dividir(a, b):
    try:
        return int(a) / int(b)
    except (ValueError, ZeroDivisionError) as err:
        return f'Ocorreu um Problema: {err}'

num1 = input('Informe o primeiro número: ')
num2 = input('Informe o segundo número: ')

print(dividir(num1, num2))
"""






