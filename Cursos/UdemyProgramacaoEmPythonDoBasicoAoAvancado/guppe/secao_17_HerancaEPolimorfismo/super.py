# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
POO - O método super()

O método super() se refere á super classe.

"""
#  Classe
class Animal:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome, especie):
        self.__nome = nome
        self.__especie = especie

    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia
    def faz_som(self, som):
        print(f'O {self.__nome} fala {som}')

#  Classe
class Gato(Animal):
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome, especie, raca):
        super().__init__(nome, especie)
        #  Animal.__init__(self, nome, especie) #  outra forma de iniciar o construtor da classe super
        super().faz_som('auauaua') # exemplo que da para acessar qualquer elemento da classe super
        self.__raca = raca

    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)

    #  Métodos de instancia


######################################################################################
felix = Gato('Felix', 'Felino', 'Angorá')
felix.faz_som('miau')
