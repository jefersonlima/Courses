"""
Escrevendo em arquivos

#  OBS: Ao abrir um arquivo para leitura, não podemos realizar a escrita nele. Apenas ler.
Da mesma forma, se abrirmos um arquivo para escrita, não podemos lê-lo, somente escrever nele.

#  OBS: Ao abrir um arquivo para escrita, o arquivo é criado no sistema operacional.
Para escrevermos dados em um arquivo, após abrir o arquivo utilzamos a função write()
Esta função recebe uma string como parâmetro, caso contrário teremos um TypeError

#  Exemplo de escrita - modo 'w' - write (escrita)

with open('novo.txt', 'w') as arquivo:
    arquivo.write('Escrever dados em arquivo é muito fácil.\n')
    arquivo.write('Podemos colocar quantas linhas quisermos.\n')
    arquivo.write('Essa é a última linha')

with open('novo.txt', 'w') as arquivo:
    arquivo.write('Novos dados.\n')
    arquivo.write('Podemos colocar quantas linhas quisermos.\n')
    arquivo.write('Mais esta é a última linha')

#  Forma Tradicional de escrita em arquivo (não Phthônica)
arquivo = open('mais.txt','w', encoding='UTF-8')

arquivo.write('Um texto qualquer.\n')
arquivo.write('Mais um texto')

arquivo.close()

with open('geek.txt', 'w') as arquivo:
    arquivo.write('Geek ' * 100)

with open('cesta1.txt', 'w') as arquivo:
    while True:
        fruta = input('Informe uma fruta ou digite sair: ')
        if fruta != 'sair':
            arquivo.write(fruta + '\n')
        else:
            break
"""





