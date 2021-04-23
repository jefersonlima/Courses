# -*- coding: UTF-8 -*-
"""
POO - Objetos

Objetos -> São instância da classe. Ou seja, após o mapeamento do objeto do mundo real para sua representação
computacional, devemos poder criar quantos objetos forem necessários. Podemos pensar nos objetos/instância de
uma classe como variáveis do tipo definido na classe.

"""

class Lampada:
    def __init__(self, cor, voltagem, luminosidade):
        self.__cor = cor
        self.__voltagem = voltagem
        self.__luminosidade = luminosidade
        self.__ligada = False

    def checa_lampada(self):
        if self.__ligada:
            return 'Ligada'
        else:
            return 'Desligada'

    def ligar_deligar(self):
        if self.__ligada:
            self.__ligada = False
        else:
            self.__ligada = True

lamp1 = Lampada('branca', 110, 60)
lamp1.ligar_deligar()
print(f'A lâmpada está {lamp1.checa_lampada()}')
lamp1.ligar_deligar()
print(f'A lâmpada está {lamp1.checa_lampada()}')

#####################################################################

class Cliente:
    def __init__(self, nome, cpf):
        self.__nome = nome
        self.__cpf = cpf

    def diz(self):
        print(f'O cliente {self.__nome} diz oi.')

class ContaCorrente:

    contador = 4999

    def __init__(self, limite, saldo, cliente):
        self.__numero = ContaCorrente.contador + 1
        self.__limite = limite
        self.__saldo = saldo
        self.__cliente = cliente
        ContaCorrente.contador = self.__numero

    def mostra_cliente(self):
        print(f'O cliente é {self.__cliente._Cliente__nome}')

cli1 = Cliente('Angelina Jolie', '123.456.789-99')
cc = ContaCorrente(2000, 400, cli1)

cc.mostra_cliente()
cc._ContaCorrente__cliente.diz()

######################################################################
class Usuario:
    def __init__(self, nome, sobrenome, email, senha):
        self.__nome = nome
        self.__sobrenome = sobrenome
        self.__email = email
        self.__senha = senha

nome = 'Angelina'
sobrenome = 'Jolie'
email = 'angelina@gmail.com'
senha = '123456'

user = Usuario(nome, sobrenome, email, senha)