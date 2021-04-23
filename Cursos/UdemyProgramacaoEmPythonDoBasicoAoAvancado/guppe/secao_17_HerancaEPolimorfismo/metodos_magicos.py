# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
POO - Métodos Mágicos

Métodos Mágicos -> são todos os métodos que utilizam dunder.

dunder init -> __init__()

Dunder > Double Underscore

Dunder repr -> Representação do objeto

"""

########################################################################################################################
#  Classe
class Livro:
    #  Atributos de classe

    #  Construtor
    def __init__(self, titulo, autor, paginas):
        self.titulo = titulo
        self.autor = autor
        self.paginas = paginas
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def __repr__(self):
        return f'{self.titulo} escrito por {self.autor}'

    def __str__(self):
        return self.titulo

    def __len__(self):
        return self.paginas

    def __del__(self):
        print(f'Um objeto do tipo Livro foi deletado da memória!')

    def __add__(self, outro):
        return f'{self} - {outro}'

    def __mul__(self, outro):
        if isinstance(outro, int):
            msg = ''
            for n in range(outro):
                msg +=  str(self) + ' '
            return msg
        return 'Não posso multiplicar!'
########################################################################################################################

#  Teste
livro1 = Livro('Python Rocks!', 'Geek University', 400)
livro2 = Livro('Inteligência Artificial com Python!', 'Geek University', 350)

print(livro1)
print(livro2)

print(str(livro1))
print(repr(livro1))
print(len(livro1))

print(str(livro2))
print(repr(livro2))
print(len(livro2))

del livro1
del livro2

livro1 = Livro('Python Rocks!', 'Geek University', 400)
livro2 = Livro('Inteligência Artificial com Python!', 'Geek University', 350)

print(livro1)
print(livro2)

print(livro1 + livro2)
print(livro1.__add__(livro2))

print(livro1 * 8)
print(livro1 * 'Geek')