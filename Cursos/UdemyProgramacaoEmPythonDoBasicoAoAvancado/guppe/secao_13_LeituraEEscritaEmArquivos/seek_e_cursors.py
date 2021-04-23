"""
Seek e Cursors

seek() -> É utilizada para movimentar o cursor pelo arquivo.

arquivo = open('t.txt')

print(arquivo.read())

#  seek() -> A função seek() é utilizada para movimentação do cursor pelo arquivo. Ela recebe um
#  parâmetro que indica onde queremos colocar o cursor.

#  Movimentando o cursor pelo arquivo com a função seek()

arquivo.seek(0)
print(arquivo.read())

arquivo.seek(22)
print(arquivo.read())

arquivo = open('t.txt')

#  readline() -> função que lê o arquivo linha a linha

ret = arquivo.readline()

print(type(ret))
print(ret)

print(ret.split(' '))

arquivo = open('t.txt')

#  readlines() -> retorna uma lista das linhas

linhas = arquivo.readlines()

print(len(linhas))

#  OBS: Quando abrimos um arquivo com a função open() é criada uma conexão entre o arquivo
no disco do computador e o nosso programa. Essa conexão de streaming. Ao finalizar
os trabalhos com o arquivo devemos fechar essa conexão. para isso utilizamos a função close()

Passo para se trabalhar com um arquivo:

1 - Abrir o arquivo:
2 - trabalhar o arquivo:
3 - Fechar o Arquivo:
"""
#  1 - Abrir o arquivo:
arquivo = open('texto.txt')
#  2 - trabalhar o arquivo:
print(arquivo.read())

print(arquivo.closed) #  Verifica se o arquivo está aberto ou fechado

#  3 - Fechar o Arquivo:
arquivo.close()
print(arquivo.closed) #  Verifica se o arquivo está aberto ou fechado

#  OBS: Se tentarmos manipular o arquivo após seu fechamento, termos um ValueError
# print(arquivo.read())







