# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
POO - Polimorfismo

Poli -> Muitas
Morfis -> Formas

Quando a gente reimplementa um método presente na classe pai em classe filhas
estamos realizando uma sobrescrita de método (Overriding).

O overriding é a melhor representação do polimorfismo.
"""
########################################################################################################################
#  Classe
class Animal(object):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        self.__nome = nome
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def falar(self):
        raise NotImplementedError('A classe filha precisa implementar este método!')

    def comer(self):
        print(f'{self.__nome} está comendo...')
########################################################################################################################
########################################################################################################################
#  Classe
class Cachorro(Animal):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)

    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def falar(self):
        print(f'{self._Animal__nome} fala wau wau')
########################################################################################################################
########################################################################################################################
#  Classe
class Gato(Animal):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)

    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def falar(self):
        print(f'{self._Animal__nome} fala wau wau')
########################################################################################################################
########################################################################################################################
#  Classe
class Rato(Animal):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        super().__init__(nome)

    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def falar(self):
        print(f'{self._Animal__nome} fala algo...')
########################################################################################################################

#  Testes
felix = Gato('Felix')
felix.comer()
felix.falar()

pluto = Cachorro('Pluto')
pluto.comer()
pluto.falar()

mickey = Rato('Mickey')
mickey.comer()
mickey.falar()
