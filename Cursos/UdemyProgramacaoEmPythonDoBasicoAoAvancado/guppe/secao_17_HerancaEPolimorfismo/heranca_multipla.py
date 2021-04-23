# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
POO - Herança Múltipla

Herança Múltipla nada mais é do que a possibilidade de uma classe herdar de múltiplas classes,
fazendo com que a classe filha herde todos os atributos e métodos de todos as classes herdadas.

OBS: A herança múltipla pode ser feita de duas maneiras:
    - Por Multiderivação Direta;
    - Por Multiderivação Indireta;

#  Exemplo 1 - Multiderivação Direta

class Base1:
    pass

class Base2:
    pass

class Base3:
    pass

class MultiDerivadaDireta(Base1, Base2, Base3):
    pass

#  Exemplo 1 - Multiderivação Indireta
class Base1:
    pass

class Base2(Base1):
    pass

class Base3(Base2):
    pass

class MultiDerivadaIndireta(Base3):
    pass

#  OBS: Não importa se  a derivação é direta ou indireta. A classe realizar a herança herdará
todos os atributos de métodos das super classes

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
class Pinguin(Terrestre, Aquatico): #  a Ordem de herança influencia na execução do metodos herdados
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
########################################################################################################################

#  Testando

baleia = Aquatico('Wally')
print(baleia.nadar())
print(baleia.cumprimentar())

tatu = Terrestre('Xim')
print(tatu.andar())
print(tatu.cumprimentar())

tux = Pinguin('Tux')
print(tux.andar())
print(tux.nadar())
print(tux.cumprimentar()) #  Method Resolution Order - MRO

#  Objeto é instância de ...
print(f'Tux é instância de Pinguin? {isinstance(tux, Pinguin)}')
print(f'Tux é instância de Aquatico? {isinstance(tux, Aquatico)}')
print(f'Tux é instância de Terrestre? {isinstance(tux, Terrestre)}')
print(f'Tux é instância de Animal? {isinstance(tux, Animal)}')
print(f'Tux é instância de object? {isinstance(tux, object)}')