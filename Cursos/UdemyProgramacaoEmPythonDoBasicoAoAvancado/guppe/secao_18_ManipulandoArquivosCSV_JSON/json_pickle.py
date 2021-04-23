# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
JSON e Pickle

JSON -> JavaScript Object Notation

API -> São meios de comunicação entre os serviços oferecidos por empresas
(Twitter, Facebook, Youtube...) e terceiros (nós desenvolvedores)

import json

ret = json.dumps(['produto', {'PlayStation 4': ('2TB', 'Novo', '220', 2340)}])

print(type(ret))

print(ret)

import json
########################################################################################################################
#  Classe
class Gato:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome, raca):
        self.__nome = nome
        self.__raca = raca
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)
    @property
    def nome(self):
        return self.__nome

    @property
    def raca(self):
        return self.__raca
    #  Métodos de instancia

########################################################################################################################

felix = Gato('Felix', 'Vira-Lata')
print(felix.__dict__)

ret = json.dumps(felix.__dict__)

print(ret)

import jsonpickle as jsonpickle

########################################################################################################################
#  Classe
class Gato:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome, raca):
        self.__nome = nome
        self.__raca = raca
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)
    @property
    def nome(self):
        return self.__nome

    @property
    def raca(self):
        return self.__raca
    #  Métodos de instancia

########################################################################################################################

felix = Gato('Felix', 'Vira-Lata')

ret = jsonpickle.encode(felix)

print(ret)

#  Escrevendo o arquivo json/pickle
import jsonpickle as jsonpickle

########################################################################################################################
#  Classe
class Gato:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome, raca):
        self.__nome = nome
        self.__raca = raca
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)
    @property
    def nome(self):
        return self.__nome

    @property
    def raca(self):
        return self.__raca
    #  Métodos de instancia

########################################################################################################################

felix = Gato('Felix', 'Vira-Lata')

with open('felix.json', 'a') as arquivo:
    ret = jsonpickle.encode(felix)
    arquivo.write(ret)
"""

#  Lendo o arquivo json/pickle
import jsonpickle as jsonpickle

########################################################################################################################
#  Classe
class Gato:
    #  Atributos de classe

    #  Construtor
    def __init__(self, nome, raca):
        self.__nome = nome
        self.__raca = raca
    #  Propriedades (@property = Getters, @nome_atributo.setter = Setters)
    @property
    def nome(self):
        return self.__nome

    @property
    def raca(self):
        return self.__raca
    #  Métodos de instancia

########################################################################################################################

with open('felix.json', 'r') as arquivo:
    conteudo = arquivo.read()
    ret = jsonpickle.decode(conteudo)
    print(ret)
    print(type(ret))
    print(ret.nome)
    print(ret.raca)

