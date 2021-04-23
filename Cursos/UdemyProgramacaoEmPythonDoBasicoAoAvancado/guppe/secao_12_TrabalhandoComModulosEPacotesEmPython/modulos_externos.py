"""
Módulos Externos

Utilizamos o gerenciador de pacotes Python chamando Pip - Python Installer Package

https://pypi.org

colorama -> É utilizado para permitir impressão de textos coloridos no terminal

from colorama import init, Fore, Back, Style
init()

print(Fore.MAGENTA + Back.CYAN + 'Geek University')
print(Style.RESET_ALL)
print(Fore.BLUE + 'Geek University')

#  Deu erro na instalação corrigir na próxima seção
import pydf

pdf = pydf.generate_pdf('<h1>Geek University</h1>')
with open('test_doc.pdf', 'wb') as f:
    f.write(pdf)
"""


