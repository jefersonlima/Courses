"""
Levantando os próprios erros com raise

raise -> Lança exceções

OBS: O raise não é uma função. É uma palavra reservada, assim como def ou qualquer outra em Python.

Para simplificar, pense no raise como sendo útil para que possamos criar nossas próprias exceções e mensagens de erro.

A forma geral de utilização é:

raise TipoDoErro('Mensagem de erro')

OBS: O raise, assim como return, finaliza a função. Ou seja, nada após o raise é executado.

#  Exemplo real
def colore(texto, cor):
    cores = ('verde', 'amarelo', 'azul', 'branco')
    if type(texto) is not str:
        raise TypeError('texto precisa ser uma string')
    if type(cor) is not str:
        raise TypeError('cor precisa ser uma string')
    if cor not in cores:
        raise ValueError(f'A cor precisa ser uma entre: {cores}')
        print('Depois do raise')
    print(f'O texto {texto} será impresso na cor {cor}')

colore('Geek University', 'azul')
colore('Geek University', 'preto')
"""

