# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Conhecendo o Pickle

A função do Pickle é realizar o seguinte processo:

Objeto Python -> Binarização

Binarização -> Objeto Python

Este processo é chamado de serialização/deserialização

#  OBS: O módulo Pickle não e seguro contra dados maliciosos e desta forma
não é recomendado trabalhar com arquivos pickle vindo de outras pessoas
que você não conheça ou de fontes desconhecidas.


"""
import pickle

########################################################################################################################
#  Classe
class Animal:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome):
        self.__nome = nome
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)
    @property
    def nome(self):
        return self.__nome

    #  Métodos de instancia
    def comer(self):
        print(f'{self.__nome} está comendo...')
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
    def mia(self):
        print(f'{self.nome} está miando...')
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
    def late(self):
        print(f'{self.nome} está latindo...')
########################################################################################################################

#  Fazendo a escrita em arquivos pickle
felix = Gato('Felix')
pluto = Cachorro('Pluto')

with open('animais.pickle', 'wb') as arquivo:
    pickle.dump((felix, pluto), arquivo)

#  Fazer a leitura de dados em arquivos pickle
with open('animais.pickle', 'rb') as arquivo:
    gato, cachorro = pickle.load(arquivo)

    print(f'O gato chama-se {gato.nome}')
    gato.mia()
    print(f'O tipo do gato é {type(gato)}')

    print(f'O cachorro chama-se {cachorro.nome}')
    cachorro.late()
    print(f'O tipo do cachorro é {type(cachorro)}')
