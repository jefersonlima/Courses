# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
POO - MRO - Method Resolution Order

Method Resolution Order (Resolução de Ordem de Métodos), é a ordem
de execução dos métodos (quem será executado primeiro).

Em Python, a gente pode conferir a ordem de execução dos métodos (MRO) de 3 formas:
    - Via propriedade da classe __mro__
    - Via método mro()
    - Via help

"""
########################################################################################################################
#  Classe
class Animal:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        self.__nome = nome
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def cumprimentar(self):
        return f'Eu sou {self.__nome} '
########################################################################################################################
########################################################################################################################
#  Classe
class Aquatico(Animal):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)

    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def nadar(self):
        return f'{self._Animal__nome} está nadando.'

    def cumprimentar(self):
        return f'Eu sou {self._Animal__nome} do mar!'
########################################################################################################################
########################################################################################################################
#  Classe
class Terrestre(Animal):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def andar(self):
        return f'{self._Animal__nome} está andando.'

    def cumprimentar(self):
        return f'Eu sou {self._Animal__nome} da terra!'
########################################################################################################################
########################################################################################################################
#  Classe
class Pinguin(Aquatico, Terrestre): #  a Ordem de herança influencia na execução do metodos herdados
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
########################################################################################################################

#  Testando

tux = Pinguin('Tux')
print(tux.cumprimentar()) #  Method Resolution Order - MRO

print(Pinguin.__mro__)
print(Pinguin.mro())
help(Pinguin)

"""
Pinguin(Aquatico, Terrestre)
Eu sou Tux do mar!

Pinguin(Terrestre, Aquatico)
Eu sou Tux da terra!
"""