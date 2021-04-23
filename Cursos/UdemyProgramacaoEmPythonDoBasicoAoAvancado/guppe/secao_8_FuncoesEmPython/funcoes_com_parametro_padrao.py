"""
Funções com Parâmetro Padrão (Default Paramters
 - Funções onde a passagem de parâmetro seja opcional;
 #Exemplo de função onde a passagem de parâmetro seja opcional
 print('Geek University')
print()

# Exemplo de função onde a passagem de parâmetro seja obrigatória
def quadrado(numero):
    return numero ** 2

print(quadrado(3))
# print(quadrado()) #TypeError

def exponencial(numero=0, potencia=2):
    return numero ** potencia

print(exponencial(2,3)) # 2 * 2 * 2 = 8
print(exponencial(3,2)) # 3 * 3 = 9

print(exponencial(3))
print(exponencial(3, 5))


# OBS
# Se o usuário passar somente 1 argumento, este será atribuído ao parâmetro numero, e será calculado o quadrado deste numero;
# se o usuário passar 2 argumentos, o primeiro será atribuído ao parâmetro numero e o segundo ao parâmetro potencia. Então
# será calculada esta potência.

print(exponencial())

# OBS: Em funções Python, os parâmetrod com valores default(padrão) DEVEM sempre estar no final da declaração.

# ERRO!
#def errado(num=2, pontencia):
#    return num ** pontencia

def certo(pontencia, num=2):
    return num ** pontencia

print(certo(6))

# outro exemplo
def soma(num1=0, num2=0):
    return num1 + num2

print(soma(4,3))
print(soma(4))
print(soma())

#  Exemplo mais complexo
def mostra_informacao(nome='Geek', instrutor=False):
    if nome == 'Geek' and instrutor:
        return 'Bem-vindo instrutor Geek'
    elif nome == 'Geek':
        return 'Eu pensei que você era o instrutor'
    return f'Olá {nome}'

print(mostra_informacao())
print(mostra_informacao(instrutor=True))
print(mostra_informacao(True))
print(mostra_informacao('Ozzy'))
print(mostra_informacao(nome='Stephany'))

# Por quê utilizar parâmetros com valor default?
# - Nos permite ser mais flexíveis nas funções;
# - Evita erros com parâmetros invorretos;
# - Nos permite trablhar com exemplos mais legiveis de código;

# Quais tipos de dados podemos utilizar como valores default para parâmetros?
# - qualquer tipo de dado:
    # - Números, strings, floats, booleanos, listas, tuplas, dicionàrios, funções e etc;

# Exemplos

def soma(num1, num2):
    return num1 + num2

def mat(num1, num2, fun=soma):
    return fun(num1, num2)

def subtracao(num1, num2):
    return num1 - num2

print(mat(2, 3))
print(mat(2, 3, subtracao))

# Escopa - Evitar problemas e confusões...
# Variáveis globais
# Variáveis locais

instrutor = 'Geek' # Variável Global

def diz_oi():
    instrutor = 'Python' # Variabel local
    return f'oi {instrutor}'

print(diz_oi())

# OBS: Se tivermos uma variável local com o mesmo nome de uma variável global, a local terá preferência.

def diz_oi():
    prof = 'Geek' # Variavel local
    return f'Olá {prof}'

print(diz_oi())
# print(prof) # NameError

# ATENÇÃO com variáveis globais (se puder evitar, evite!)

total = 0

def incrementa():
    total = total + 1   # UnboundLocalError: local variable 'total' referenced before assignment
                        # a variável local está sendo utilizada para processamento sem ter sido inicializada
    return total

print(incrementa())

# ATENÇÃO com variáveis globais (se puder evitar, evite!)

total = 0

def incrementa():
    global total # Avisamos que queremos utilizar a variável global
    total = total + 1

    return total

print(incrementa())
print(incrementa())
print(incrementa())

# Podemos ter funções que são declaradas dentro de funções, e também tem uma forma especial de escopo de variavel

def fora():
    contador = 0

    def dentro():
        nonlocal contador
        contador = contador + 1
        return contador
    return dentro()

print(fora())
print(fora())
print(fora())

#  print(dentro()) #  NameError: name 'dentro' is not defined
"""






















