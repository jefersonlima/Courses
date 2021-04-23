"""
Definindo Funções

- Funções são pequenos trechos de código que realizam tarefas especificas;
- Pode ou não receber entradas de dados e retornar uma saída de dados;
- Muito uteis para executar procedimentos simulares por repetidas vezes;

OBS: se você escrever uma função que realiza várias tarefas dentro dela
é bom fazer uma verificação para que a função seja simplificada.

Já utilizamos varias funções desde o inicio do curso
- print()
- len()
- max()
- min()
- count()
- e muitas outras:

"""

# Exemplo de utilização de funções:

# cores = ['verde', 'amarelo','azul','branco']

# Utilizando a função integrada (Built-in) do Python print()

# print(cores)

# curso = 'Programação em Python: Essencal'

# print(curso)

# cores.append('roxo')

# print(cores)

# curso.append('Mais dados...')  # AttributeError
# print(curso)

# cores.clear()
# print(cores)

# print(help(print))

#DRY - Don't Repeat yourself - Não repita você mesmo / Não repita seu código.

# Mas então, como definir funções?

"""
Em Python, a forma geral de definir uma função é:

def nome_da_funcao(paramentros_de_entrada):
    bloco_da_funcao
    
Onde:
nome_da_funcao -> SEMPRE, com letras minúsculas, e se for nome composto, separado por underline (Snake Case);
parametros_de_entrada -> Opcionais, onde tendo mais de um, cada um é separado por virgula, podemos ser opcionais ou não;
bloco_da_funcao -> Também chamado de corpo da função ou implementaçaõ, é onde o processamento da funçaõ acntece.
    Neste bloco, pode ter ou nao retorno da função.
    
OBS:Veja que para definir uma função, utilizamos a palavra reservada 'def' informando ao Python que estamos definindo 
uma função. Tambem abrimos o bloco de codigo com o já conhecido dois pontos ':' que é utilizado em Python para definir
blocos.
    
"""

def diz_oi():
    print('oi!')

"""
OBS:
1- Veja que, dentro das nossas funções podemos ultilizar outras funçoes;
2- Veja que nossa funções só executa 1 tarefa, ou seja, a unica coisa que ela faz é dizer oi;
3- Veja que esta função nao recebe nenhum parametro de entrada;
4- Veja que esta função nao retorna nada;
"""

# Utilizando funçoes

#chamada de execução
#diz_oi()

"""
ATENÇÃO

Nunca esqueça de utilizar o parenteses ao executar uma função.

Exemplo:

# Errado!
diz_oi

# Errado!
diz_oi ()

# Certo
diz_oi()

"""

#Exemplo 2

def cantar_parabens():
    print('Parabéns pra você')
    print('Nesta data querida')
    print('Muitas felicidade')
    print('Muitos anos de vida')
    print('Viva o Aniversariante!')

#for n in range(5):
#    # print(n+1)
#   cantar_parabens()

canta = cantar_parabens

canta()


