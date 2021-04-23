"""
Funçoes com parametro (de entrada)
 - Funçoes que recebem dados para serem processados dentro da mesma;

 Se a gente pensar em um programa qualquer, geralmente temos:
 entrada -> processamento -> saida

 Se a gente pensar em uma funçao. ja sabemos que temos funçoes que:
 - Nao possuem entrada;
 - Nao possuem saida;
 - Possuem entrada mas nao possuem saida;
 - Nao possuem entrada mas possuem saida;
 - Possuem entrada e saida;

 Refatorando uma funçao

 def quadrado(numero):
    #return numero * numero
    return numero ** 2

print(quadrado(7))
print(quadrado(2))
print(quadrado(5))

ret = quadrado(6)
print(ret)

#print(quadrado()) #TypeError

def cantar_parabens(aniversariante):
    print('Parabéns pra você')
    print('Nesta data querida')
    print('Muitas felicidade')
    print('Muitos anos de vida')
    print(f'Viva o {aniversariante}!')

cantar_parabens('Marcos')

# Funçoes podem ter n parametros de entrada. ou seja, podemos receber como entrada
# em uma funçao quantos parametros forem necessarios. eles sao separados por virgula.

# exemplo

def soma(a, b):
    return a + b

def multiplica(num1, num2):
    return num1 * num2

def outra(num1, b, msg):
    return (num1 + b) * msg

print(soma(2, 5))
print(soma(10, 20))

print(multiplica(4, 5))
print(multiplica(2, 8))

print(outra(3, 2, 'Jeferson '))
print(outra(5, 4, 'Phyton '))

# OBS: se a gente informar um numero errado de parametros ou argumentos, teremos TypeError

# print(soma(2, 3, 4)) # TypeError - passando argumentos a mais
# print(soma(4)) # TypeError - passando argumentos a menos

# Nomeando parametros

def nome_completo(nome, sobrenome):
    return f'Seu nome completo é {nome} {sobrenome}'

print(nome_completo('Angelina', 'Jolie'))

# a diferença entre parametros e argumentos

# parametros sao variaveis declaradas na definiçao de uma funçao;
# Argumentos sao dados passados durante a execuçao de uma funçao;

# A ordem dos parametros importa!

nome = 'Felicity'
sobrenome = 'Jones'

print(nome_completo(sobrenome, nome))

# Argumentos nomeados (Keyword Arguments)

# Caso utilizemos nomes dos parametros nos argumentos para informa-los, podemos
# utilizar qualquer ordem.

print(nome_completo(nome='Angelina', sobrenome='Jolie'))
print(nome_completo(nome=nome, sobrenome= sobrenome))
print(nome_completo(sobrenome='Marques', nome='Marcia'))

# Erro comum na utilizaçao do return

def soma_impares(numeros):
    total = 0
    for num in numeros:
        if num % 2 != 0:
            total = total + num
        # return total # errado
    return total # certo

lista = [1, 2, 3, 4, 5, 6, 7]
print(soma_impares(lista))

tupla = (1, 2, 3, 4, 5, 6, 7)
print(soma_impares(tupla))
"""

def soma_impares(numeros):
    total = 0
    for num in numeros:
        if num % 2 != 0:
            total = total + num
        # return total # errado
    return total # certo

if __name__ == '__main__':
    lista = [1, 2, 3, 4, 5, 6, 7]
    print(lista)
    tupla = (1, 2, 3, 4, 5, 6, 7)
    print(tupla)
else:
    print(f'Local que está importando: {__name__}')
    print('O Módulo funções com parametros foi importado')





