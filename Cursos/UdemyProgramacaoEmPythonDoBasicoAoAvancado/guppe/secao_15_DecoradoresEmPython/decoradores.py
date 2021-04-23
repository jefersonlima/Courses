# -*- coding: UTF-8 -*-
"""
Decoradores (Decorators)

O que são decorators?

- Decorators são funções;
- Decorators envolvem outras funções e aprimoram seus comportamentos;

#  Decorators como funções (Sintaxe não recomendada / Sem Açucar Sintático)

def seja_educado(funcao):
    def sendo():
        print('Foi um prazer conhecer você ')
        funcao()
        print('Tenha um ótimo dia!')
    return sendo

#  Testando 1

def saudacao():
    print('Seja bem-vindo(a) à Geek University')

teste = seja_educado(saudacao)

teste()

#  Testando 2
def seja_educado(funcao):
    def sendo():
        print('Foi um prazer conhecer você ')
        funcao()
        print('Tenha um ótimo dia!')
    return sendo

def raiva():
    print('EU TE ODEIO!')

raiva_educada = seja_educado(raiva)

raiva_educada()

#  Decorators com Syntax Sugar (Açucar Sintático)

def seja_educado_mesmo(funcao):
    def sendo_mesmo():
        print('Foi um prazer conhecer você!')
        funcao()
        print('Tenha um excelente dia!')
    return sendo_mesmo

@seja_educado_mesmo
def apresentando():
    print('Meu nome é Pedro')

# testando

apresentando()

@seja_educado_mesmo
def dormir():
    print('Quero dormir...')

dormir()

_______________________________________________________
|  Home  |  Serviços  |  Produtos  |  Administrativo  |
-------------------------------------------------------

http://www.suaempresa.com.br/
http://www.suaempresa.com.br/
http://www.suaempresa.com.br/
http://www.suaempresa.com.br/

#  OBS: Não é código funcional (Que funcione) é apenas exemplo

def checa_login():
    if not request.usuario:
        redirect('http://www.suaempresa.com.br/login')

def home(request):
    return 'Pode acessar home'

@checa_login
def servicos(request):
    return 'Pode acessar serviços'

def produtos(request):
    return 'Pode acessar produtos'

@checa_login
def admin(request):
    return 'Pode acessar admin'

#  OBS  Não confunda Decorator com Decorator Function
"""


