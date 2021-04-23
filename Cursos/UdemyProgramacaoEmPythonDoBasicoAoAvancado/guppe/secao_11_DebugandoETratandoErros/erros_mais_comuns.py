"""
Erros mais comuns em Python

ATENÇÃO! É importante prestar atenção e aprender a ler as saídas de erros geradas pela execução do nosso código.

 Os erros mais comuns
 1 - SyntaxError -> Ocorre quando o Python encontra um erro de sintaxe. Ou seja, você escreveu algo que o Python
 não reconhece como parte da linguagem.

 Exemplos SyntaxError
 a)
 def funcao:
    print('Geek University')

b)
def = 1

c)
return

2 - NameError -> Ocorre quando uma variável ou função não foi definida.
#  Exemplo NameError
#  a)
a = 18
if a < 10:
    msg = 'É maior que 10'

print(msg)

#  b)
print(geek)

#  c)
geek()

3 - TypeError -> Ocorre quando uma função/operação/ação é aplicada a um tipo errado.

#  Exemplos TypeError
a)
print(len(5))
b)
print('Geek' + [])

4 - IndexError -> Ocorre quando tentamos acessar um elemento em uma lista ou outro tipo de dado indexado utilizando
um índice inválido.

Exemplos IndexError
a) lista = ['Geek']
print(lista[2])

b) lista = ['Geek']
print(lista[0][10])

b) tupla = ('Geek')
print(tupla[0][10])

5 - ValueError -> Ocorre quando uma função/operação built-in (integrada) recebe um argumento com tipo correto
mas valor inapropriado.

Exemplos ValueError

a)
print(int('Geek'))

6 - KeyError -> Ocorre quando tentamos acessar um dicionário com umav chave que nõa existe.

Exemplos KeyError

dic = {'python': 'university'}
print(dic['geek'])

7 - AttributeError -> Ocorre quando uma variável não tem um atributo/função.

Exemplos AttributeError

a)
tupla = (11, 2, 31, 4)
print(trupla.sort())

8 - IndentationError -> Ocorre quando não respeitamos a identação do Python (4 espaços)

a)
def nova():
print('Geek')

b)
for i in range(10):
i + 1

OBS: Exceptions e Erros são sinônimos na programação.

OBS: Importante ler e prestar atenção na saída de erro.
"""


