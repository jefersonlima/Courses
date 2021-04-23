"""
Filter

filter() -> Serve para filtrar dados de um determinada coleção.

#  valores = 1, 2, 3, 4, 5, 6
#  media = (sum(valores) / len(valores))
#  print(media)

#  Bliblioteca para trabalar com dados estatísticos
import statistics

#  Dados coletados de algum sensor
dados = [1.3, 2.7, 0.8, 4.1, 4.3, -0.1]

#  Calculando a média dos dados utilizando a função mean()
media = statistics.mean(dados)
print(f'Média: {media}')

#  OBS: Assim como a função map(), a filter() recebe dois parâmetros, sendo
#  uma função e um interável.

print('Maior que média')
res = filter(lambda x: x > media, dados)
print(list(res))
print('Menor que média')
res = filter(lambda x: x < media, dados)
print(type(res))
print(list(res))

#  OBS: Assim como fa função map(), após serem utilizados so dados de filter eles são excluídos da memória
print(f'Novamente: {list(res)}')

#  Exemplos de dados faltantes

#  usando None
paises = ['', 'Argentina', '', 'Brasil', 'Chile', '', 'Colômbia', '', 'Equador', '', '', 'Venezuela']
print(paises)
res = filter(None, paises)
print(list(res))

#  Usando Lambda 1
paises = ['', 'Argentina', '', 'Brasil', 'Chile', '', 'Colômbia', '', 'Equador', '', '', 'Venezuela']
print(paises)
res = filter(lambda pais: len(pais)> 0, paises)
print(list(res))
#  Usando Lambda 2
paises = ['', 'Argentina', '', 'Brasil', 'Chile', '', 'Colômbia', '', 'Equador', '', '', 'Venezuela']
print(paises)
res = filter(lambda pais: pais != '', paises)
print(list(res))

#  OBS: A diferença entre map() e filter() é:
#  map() -> Recebe dois parâmetros, uma função e um interável e retorna um objeto mapeando a função para cada elemento
#        do interável. no map ele retorna todos os tipo de valores
#  filter() -> Recebe dois parâmetros, uma função e um interável e retorna um objeto filtrando apenas os elementos
#        de acordo com função. a função filter só retorna valor boleanos

#  Exemplo mais complexo

usuarios = [
    {"username": "samuel", "tweets": ["Eu adoro bolos", "Eu adoro pizzas"]},
    {"username": "carla", "tweets": ["Eu amo meu gato"]},
    {"username": "jeff", "tweets": []},
    {"username": "bob123", "tweets": []},
    {"username": "doggo", "tweets": ["Eu gosto de cachorros", "vou sair hoje!"]},
    {"username": "gal", "tweets": []}
]

print(usuarios)

#  Filtrar os usuários que estão inativos no Twitter

#  Forma 1
print('Forma 1')
inativos = list(filter(lambda usuario: len(usuario['tweets']) == 0, usuarios))
print(inativos)

#  Forma 2
print('Forma 2')
inativos = list(filter(lambda usuario: not usuario['tweets'], usuarios))
print(inativos)

#  Combinar filter() e map()

nomes = ['Vanessa', 'Ana', 'Maria']

#  Devemos criar uma lista contendo 'Sua instrutora é' + nome, desde que cada nome tenha menos de 5 caracteres
lista = list(map(lambda nome: f'Sua instrutora é {nome}', filter(lambda nome: len(nome) < 5, nomes)))
print(lista)
"""








