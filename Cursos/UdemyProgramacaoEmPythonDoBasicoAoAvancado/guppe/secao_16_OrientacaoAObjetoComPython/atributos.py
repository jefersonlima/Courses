# -*- coding: UTF-8 -*-
"""
POO - Atributos

Atributos -> Representam as características do objeto. Ou seja, pelos atributos
nós conseguimos representar computacionamente os estados de um objeto.

Em Python, dividimos os atributos em 3 grupos:
    - Atributos de Instancia;
    - Atributos de Classes;
    - Atributos Dinâmicos;

#  Atributos de instância: São atributos declarados dentro do método construtor.

#  OBS: Método construtor: É um metodo especial utilizado para a construção do objeto.

#  Em Python, por comvenção, ficou estabelecido que, t*odo atributos de uma classe é público.
Ou seja, pode ser acessado em t*odo projeto.
Caso queiramos demostrar que determinado atributo deve ser tratado como privado, ou seja,
que deve ser acessado/utilizado somente dentro da própria classe onde está declarado,
utiliza-se __ duplo undercore(underline) no ínicio de seu nome.

Isso é conhecido também como Name Manglig.

#  Atributos Públicos e Atributos Privados

class Acesso:

    def __init__(self, email, senha):
        self.email = email
        self.__senha = senha

    def mostra_senha(self):
        print(self.__senha)

    def mostra_email(self):
        print(self.email)


#  OBS: Lembre-se que isso é apenas uma convenção, ou seja, a linguagem Python não vai impedir que
#  façamos acesso aos atributos sinalizados como privados fora da classe.

#  Exemplo

user = Acesso('user@gmail.com', '123456')

print(user.email)

#  Print(user.__senha) #  AttributeError

print(user._Acesso__senha) #  Temos acesso. Mas não deveríamos fazer este acesso. (Name Manglong)

user.mostra_senha()
user.mostra_email()

#  Atributos Públicos e Atributos Privados

class Acesso:

    def __init__(self, email, senha):
        self.email = email
        self.__senha = senha

    def mostra_senha(self):
        print(self.__senha)

    def mostra_email(self):
        print(self.email)

#  O que significa atributos de instância?

#  Significa, que ao criarmos instâncias/objetos de uma classe, todas as instâncias
#  terão estes atributos.

user1 = Acesso('user1@gmail.com', '123456')
user2 = Acesso('user2@gmail.com', '654321')

user1.mostra_email()
user2.mostra_email()

#  Classes com Atributos de Instância Público
class Lampada:

    #  Construtor
    def __init__(self, voltagem, cor):
        self.voltagem = voltagem
        self.cor = cor
        self.ligada = False

class ContaCorrente:

    #  Construtor
    def __init__(self, numero, limite, saldo):
        self.numero = numero
        self.limite = limite
        self.saldo = saldo

class Produto:

    #  Construtor
    def __init__(self, nome, descricao, valor):
        self.nome = nome
        self.descricao = descricao
        self.valor = valor

class Usuario:

    #  Construtor
    def __init__(self, nome, email, senha):
        self.nome = nome
        self.email = email
        self.senha = senha

#  Atributos Públicos e Atributos Privados

class Acesso:

    def __init__(self, email, senha):
        self.email = email
        self.__senha = senha

    def mostra_senha(self):
        print(self.__senha)

    def mostra_email(self):
        print(self.email)

#  Atributos de Classes
p1 = Produto('PlayStation 4', 'Video game', 2300)
p2 = Produto('Xbox S', 'Video game', 4500)

#  Atributos de Classes

#  Atributos de classe, são atributos, claro, que são declarados diretamente na classe, ou seja,
#  fora do construtor. Geralmente já inicializamos um valor, e este valor é compartilhado entre
#  todas as instâncias da classe. Ou seja, ao invés de cada instância da classe ter seus próprios
#  valores como é o caso dos atributos de  instância, com os atributos de classe todas as instâncias
#  terão o mesmo valor para este atributo.

#  Refatorar a classe Produto

class Produto:

    #  Atributo de classe
    imposto = 1.05  #  0.05% de imposto
    contador = 0

    #  Construtor
    def __init__(self, nome, descricao, valor):
        self.id = Produto.contador + 1
        self.nome = nome
        self.descricao = descricao
        self.valor = (valor * Produto.imposto)

        Produto.contador = self.id

p3 = Produto('PlayStation 4', 'Video game', 2300)
p4 = Produto('Xbox S', 'Video game', 4500)

print(p3.imposto)  #  Acesso possível, mas incorreto de um atributo de classe
print(p4.imposto)  #  Acesso possível, mas incorreto de um atributo de classe

print(p3.valor)
print(p4.valor)

#  Não precisamos criar uma instância de uma classe para fazer acesso a um atributo de classe

print(Produto.imposto)  #  Acesso correto de um atributo de classe

print(p3.id)
print(p4.id)

#  OBS:  Em linguagens como o Java, os atributos conhecidos como atributos de classe aqui em Python
#  são chamados de atributos estáticos;
"""

#  Refatorar a classe Produto

class Produto:

    #  Atributo de classe
    imposto = 1.05  #  0.05% de imposto
    contador = 0

    #  Construtor
    def __init__(self, nome, descricao, valor):
        self.id = Produto.contador + 1
        self.nome = nome
        self.descricao = descricao
        self.valor = (valor * Produto.imposto)

        Produto.contador = self.id

#  Atributos dinâmicos -> um atributo de instância que pode ser criado em tempo de execução.

#  OBS: O atributo dinâmico será excluido da instância que o criou.

p1 = Produto('PlayStation 4', 'Video game', 2300)
p2 = Produto('Arroz', 'Mercearia', 5.99)

#  Criando um atributo dinâmico em tempo de execução

p2.peso = '5kg'  #  Note que na classe Produto não existe o atributo peso

print(f'Produto: {p2.nome}, Descrição: {p2.descricao}, Valor: {p2.valor}, Peso: {p2.peso}')
#  print(f'Produto: {p1.nome}, Descrição: {p1.descricao}, Valor: {p1.valor}, Peso: {p1.peso}')

#  Deletando atributos
print(p1.__dict__)
print(p2.__dict__)

print(Produto.__dict__)

del p2.peso
del p2.valor
del p2.descricao

print(p1.__dict__)
print(p2.__dict__)
