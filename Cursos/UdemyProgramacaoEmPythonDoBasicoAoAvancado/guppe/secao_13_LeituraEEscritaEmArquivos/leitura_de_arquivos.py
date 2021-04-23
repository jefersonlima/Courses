"""
Leitura de Arquivos

Para o conteúdo de um arquivo em Python, utilizamos a função integrada open().
que literalmente significa 'abrir'

open() -> Na forma mais simples de utilização nós passamos apenas um parâmetro de entrada, que neste caso é o
caminho para o arquivo a ser lido. Essa função retorna um _io.TextIOWrapper e é com ele que trabalhamos então.

https://docs.python.org/3/library/functions.html#open

#  OBS: Por padrão, a função open() abre o arquivo para leitura. Este arquivo deve existir, ou então teremos o erro
FileNotFoundError

<_io.TextIOWrapper name='Melhorias.txt' mode='r' encoding='cp1252'>

#  Exemplo

arquivo = open('Melhorias.txt', encoding='UTF-8')
print(arquivo)
print(type(arquivo))

#  para ler o conteúdo de um arquivo, após sua abertura, devemos utilizar a função read()

print(arquivo.read())

ret = arquivo.read()
print(type(ret))
ret = ret.split('\n')
print(ret)
print(type(ret))
#  OBS: O python, utiliza um recurso para trabalhar com arquivos chamada cursor. Esse cursor,
#  funciona como o cursor quando estamos escrevendo.
"""

#  Com a função read() podemos limitar a quantidade de caracteres a serem lidos no arquivo
arquivo = open('texto.txt')
print(arquivo.read(37))

