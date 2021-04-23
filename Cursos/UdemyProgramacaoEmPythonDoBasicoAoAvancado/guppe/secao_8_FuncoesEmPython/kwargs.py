"""
**kwargs

Poderiamos chamar este parâmetro de **xis, mas por conveção chamamos de **kwargs

Este é só mais um parâmetro, mas diferente do *args que coloca os valores extras
em uma tupla, o **kwargs exige que utilizemos parâmetros nomeados, e transforma esses
parâmetros extras em um dicionário.

#  Exemplo

def cores_favoritas(**kwargs):
    print(kwargs)

cores_favoritas(marcos='verde', julia='amarelo', fernanda='azul', vanessa='branco')

def cores_favoritas(**kwargs):
    for pessoa, cor in kwargs.items():
        print(f'A cor favorita de {pessoa.title()} é {cor}')

cores_favoritas(marcos='verde', julia='amarelo', fernanda='azul', vanessa='branco')

#  OBS: Os parâmetros *args e **kwargs não são obrigatórios.

cores_favoritas()

cores_favoritas(geek='navy')

#  Exemplo mais complexo

def cumprimento_especial(**kwargs):
    if 'geek' in kwargs and kwargs['geek'] == 'Python':
        return 'Você recebeu um cumprimento Pythônico Geek!'
    elif 'geek' in kwargs:
        return f"{kwargs['geek']} Geek!"
    return 'Não tenho certeza quem você é ...'

print(cumprimento_especial())
print(cumprimento_especial(geek='Python'))
print(cumprimento_especial(geek='Oi'))
print(cumprimento_especial(geek='Especial'))

#  Nas nossas funçõs, podemos ter (NESTA ORDEM):

- Parâmetros obrigatórios;
- *args;
- Parâmetros defalt (não obrigatórios);
- **kwargs;

def minha_funcao(idade, nome, *args, solteiro=False, **kwargs):
    print(f'{nome} tem {idade} anos')
    print(args)
    if solteiro:
        print('Solteiro')
    else:
        print('Casado')
    print(kwargs)

minha_funcao(8, 'Julia')
minha_funcao(18, 'Felicity', 4, 5, 3, solteiro=True)
minha_funcao(34, 'Felipe', eu='Não', voce='Vai')
minha_funcao(19, 'Carla', 9, 4, 3, java=False, puthon=True)

#  Entenda por quê é importante manter a ordem dos parâmetros sa declaração

def mostra_info(a, b, *args, instrutor='Geek', **kwargs):
    return [a, b, args, instrutor, kwargs]

print(mostra_info(1, 2, 3, sobrenome='University', cargo='Instrutor'))

#  a = 1
#  b = 2
#  args = (3,)
#  instrutor = 'Geek'
#  kwargs = {'sobrenome': 'University', 'cargo': 'Instrutor'}]

#  Função com a ordem incorreta de parâmetros

def mostra_info(a, b, instrutor='Geek', *args, **kwargs):
    return [a, b, args, instrutor, kwargs]

print(mostra_info(1, 2, 3, sobrenome='University', cargo='Instrutor'))

#  Desempacotar com **kwargs

def mostra_nomes(**kwargs):
    return f"{kwargs['nome']} {kwargs['sobrenome']}"

nomes = {'nome': 'Felicity', 'sobrenome':'Jones'}

print(mostra_nomes(nome='Felicity', sobrenome='Jones'))

print(mostra_nomes(**nomes))

def soma_multiplos_numeros(a,b,c):
    print(a + b + c)

soma_multiplos_numeros(1,2,3)

lista = [1,2,3]
soma_multiplos_numeros(*lista)

tupla = (1,2,3)
soma_multiplos_numeros(*tupla)

conjunto = {1,2,3}
soma_multiplos_numeros(*conjunto)

dicionario = dict(a=1,b=2, c=3)
soma_multiplos_numeros(**dicionario)

#  OBS: Os nomes da chave em um dicionario devem ser o mesmo dos parâmetros da função
#  dicionario = dict(d=1,e=2, f=3)  #  TypeError
#  soma_multiplos_numeros(**dicionario)

def soma_multiplos_numeros(a,b,c, **kwargs):
    print(a + b + c)

dicionario = dict(a=1,b=2, c=3, nome='Geek')
soma_multiplos_numeros(**dicionario, lang='Python')
"""






