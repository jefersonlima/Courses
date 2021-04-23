#!/usr/bin/python
# -*- coding: UTF-8 -*-
import os, sys

"""
Sistema de Arquivos e Navegação

Para fazer uso de manipulação de arquivos do sistema operacional, precisamos importar
e fazer uso do módulo os.

os -> Operation System - Sistema Operacional

print(os.getcwd()) #  C:\\Users\\AreaDeEstudo\\PycharmProjects\\guppe\\secao_13_LeituraEEscritaEmArquivos

os.chdir('..')
print(os.getcwd()) #  C:\\Users\\AreaDeEstudo\\PycharmProjects\guppe

os.chdir('..')
print(os.getcwd()) #  C:\\Users\\AreaDeEstudo\\PycharmProjects

os.chdir('..')
print(os.getcwd()) #  C:\\Users\\AreaDeEstudo

os.chdir('..')
print(os.getcwd()) #  C:\\Users

os.chdir('..')
print(os.getcwd()) #  C:\\

os.chdir('..')
print(os.getcwd()) #  C:\\ ??

#  Podemos checar se um diretório é absoluto ou relativo
print(os.path.isabs('C:\\Users\\AreaDeEstudo'))

#  Podemos identificar o sistema operacional com o módulo os
print(os.name)  #  posix (Linux e Mac), nt (Windows)

#  Podemos ter mais detalhes do sistema operacional (não é muito bom no windows)
#  print(os.uname()) #  linux
print(sys.platform) #  Windows

os.chdir('..')  #  Necessario devido minha organização em pastas tive que voltar um diretório para acompnhar as aulas

print(os.getcwd())

res = os.path.join(os.getcwd(), 'geek', 'university')
os.chdir(res)

print(os.getcwd())

#  Veja que o os.path.join() recebe dois parâmetros, sendo o primeiro o diretório atual e o segundo o
#  diretório que será juntado ao atual.

os.chdir('..')  #  Necessario devido minha organização em pastas tive que voltar um diretório para acompnhar as aulas

#  Podemos listar os arquivos e diretórios com o listdir()
print(os.listdir())
print(len(os.listdir()))

print(os.listdir('c:\\'))
print(len(os.listdir('c:\\')))

#  Podemos listar os arquivos e diretórios com mais detalhes com scandir()
print(os.scandir('c:\\'))
print(list(os.scandir('c:\\')))

os.chdir('..')  #  Necessario devido minha organização em pastas tive que voltar um diretório para acompnhar as aulas
#  arquivos = list(os.scandir())
#  print(arquivos)
#  print(dir(arquivos[0]))

scanner = os.scandir()
arquivos = list(scanner)
print(arquivos[0].inode())
print(arquivos[0].is_dir())
print(arquivos[0].is_file())
print(arquivos[0].is_symlink())
print(arquivos[0].name)
print(arquivos[0].path)  #  Caminho até o arquivo
print(arquivos[0].stat())  #  Estatisticas do arquivo

#  OBS: Quando utilizamos a função scandir() nós precisamos fechá-la. assim quando abrimos um arquivo
scanner.close()
"""

