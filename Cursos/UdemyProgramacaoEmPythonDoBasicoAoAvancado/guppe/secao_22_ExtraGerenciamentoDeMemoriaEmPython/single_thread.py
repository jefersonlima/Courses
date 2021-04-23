import time
from threading import Thread

CONTADOR = 500000000

def contagem_regreciva(n):
    while n > 0:
        n -= 1

inicio = time.time()
contagem_regreciva(CONTADOR)
fim = time.time()

print(f'Tempo em segundos - {fim - inicio}')

#  Tempo em segundos - 21.759676456451416