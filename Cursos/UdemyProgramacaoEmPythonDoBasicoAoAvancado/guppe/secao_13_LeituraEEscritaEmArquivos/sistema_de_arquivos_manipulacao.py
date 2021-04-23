#!/usr/bin/python
# -*- coding: UTF-8 -*-
import os, sys

import send2trash as send2trash

"""
Sistema de Arquivos - Manipulação

#  Descobrindo se um arquivo ou diretório existe
#  Arquivo
print(os.path.exists('arquivo.txt')) #  False
print(os.path.exists('cesta1.txt'))  #  True

#  Diretório
os.chdir('..')  #  Necessario devido minha organização em pastas tive que voltar um diretório para acompanhar as aulas
#  Paths relativos
print(os.path.exists('geek'))  #  True
print(os.path.exists('geek\\university'))  #  True
print(os.path.exists('geek\\university\\geek3.py'))  #  True
print(os.path.exists('outro'))  #  False

#  Paths absolutos
print(os.path.exists('C:\\geek\\university'))  #  False
print(os.path.exists('C:\\Users\\AreaDeEstudo\\Pictures'))  #  true
print(os.path.exists('C:\\Users\\AreaDeEstudo\\Pictures\\Screenshots\\Captura de Tela (1).png'))  #  true

#  Criando arquivos

#  Forma 1
open('arquivo - teste.txt', mode='w').close()

#  Forma 2
open('arquivo - teste2.txt', mode='a').close()

#  Forma 3
with open('arquivo - teste3.txt', mode='w') as arquivo:
    pass
    
#  Criando arquivos
#  Melhores formas SÓ LINUX
#  os.mknod('arquivo - teste4.txt', mode='w') #  Linux
#  os.mknod('C:\\Users\\AreaDeEstudo\\PycharmProjects\\guppe\\secao_13_LeituraEEscritaEmArquivos\\university.txt') #  Linux

os.mknod('C:\\Users\\AreaDeEstudo\\PycharmProjects\\guppe\\secao_13_LeituraEEscritaEmArquivos\\university.txt')

#  Path Relativo
os.mkdir('templates')

#  OBS: A função mkdir() cria um diretório se este não existir. Caso exista, teremos FileExistsError

#  Path Absoluto
os.mkdir('C:\\templates')

#  OBS: Se não tivermos permissão para criar o diretório teremos um PermissionError

#  Criando multi-diretórios (árvore de diretórios)

os.makedirs('templates\\geek\\university\\outro')

#  OBS: A função makedirs() cria um diretório se este não existir. Caso exista, teremos FileExistsError

#  Caso já exista ele nao faz nada com o parametro exist_ok

os.makedirs('templates2\\geek2\\university2\\outro2', exist_ok=True)

os.rename('geek.txt','geek2')

#  Renomeando Arquivo
#  Esse deu erro
#  os.rename('geek2\\university2\\outro2\\t.txt','geek2\\university2\\outro2\\a.txt')

os.rename('cesta1.txt','cesta.txt')
os.rename('cesta.txt','cesta1.txt')

#  ATENÇÃO! Tome cuidado com os comandos de deleção. Ao deletermos um arquivo ou diretório, eles
#  não vão para a lixeira. Eles somem.

#  Removendo Arquivos
os.remove('geek.txt')

#  OBS: Se você estiver no Windows e o arquivo que você for deletar estiver em uso, você terá um erro.
#  OBS: Caso o arquivo não exista, teremos o FileNotFoundError
#  OBS: Se você informar um diretório ao invés de um arquivo, teremos um IsADirectoryError

#  Removendo diretórios vazios
os.rmdir('templates')

#  OBS: Se o diretório tiver qualquer conteúdo teremos um OSError
#  OBS: Se o diretório não existir teremos um FileNotFoundError

#  Removendo uma árvore de arquivos
for arquivo in os.scandir('geek2'):
    #  print(f'- {arquivo.name}')
    if arquivo.is_file():
        os.remove(arquivo.path)
        
#  Podemos remover uma árvore de diretórios vazios
os.removedirs('geek2/mais')

#  Se algum dos diretórios contiver arquivos ou outros diretorios, o processo para.

#  ATENÇÃO: Ao remover arquivos e diretórios com Python eles não vão para a lixeira. Eles vão embora!

#  Importando a biblioteca send2trash (Envia arquivos e diretórios para a lixeira)
from send2trash import send2trash 

#  os.remove('cesta1.txt')  #  Não vai para a lixeira. É deletado imediatamente
send2trash('cesta2.txt')  #  Vai para a lixeira. Pode ser restaurado.
send2trash('templates')

#  OBS: Se o arquivo não existir. Teremos OSError

#  Trabalhando com arquivos e diretórios temporários

import tempfile

#  Criando um diretório temporário
#  Linux não funciona no windows
with tempfile.TemporaryDiretory() as tmp:
    print(f'Criei o diretório temporário em {tmp}')
    with open(os.path.join(tmp, 'arquivo_temporario.txt'), 'w') as arquivo:
        arquivo.write('Geek University\n')
    input()

#  Estamos criando um diretório temporário, abrindo o mesmo e dentro dele criando
#  um arquivo para escrevermos um textol. No final, usamos um input() só para mantermos
#  os arquivos temporários 'vivos' dentro dos blocos with.

#  OBS: possivelmente, o código acima não irá funcionar se você estiver utilizando
#  o windows. Por conta desse sistema de trabalhar de forma diferente com arquivos temporários

#  Esse cria arquivos temporarios no windows na pasta %temp&
import tempfile

#  Criando um arquivo temporário
#  Com with
with tempfile.TemporaryFile() as tmp:
    tmp.write(b'Geek University1\n')
    tmp.seek(0)
    print(tmp.read())
    input()

#  Sem o bloco with
arquivo = tempfile.TemporaryFile()
arquivo.write(b'Geek university2\n')
arquivo.seek(0)
print(arquivo.read())
input()
arquivo.close()

#  Outra forma de criar arquivo temporario
arquivo = tempfile.NamedTemporaryFile()
arquivo.write(b'Geek university3\n')
print(arquivo.name)
arquivo.seek(0)
print(arquivo.read())
input()
arquivo.close()

https://docs.python.org/3/library/os.html?highlight=os#module-os
"""










