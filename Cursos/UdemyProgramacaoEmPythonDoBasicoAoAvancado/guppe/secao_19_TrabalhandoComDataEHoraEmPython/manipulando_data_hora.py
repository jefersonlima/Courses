# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Manipulando Data e Hora
Python tem um módulo built-in (integrado) para se trabalhar com data e hora
chamado datetime

import datetime

print(dir(datetime))
print(datetime.MAXYEAR)
print(datetime.MINYEAR)

#  Retorna a data e hora corrente
print(datetime.datetime.now())

#datetime.datetime(year, month, day, hour, minute, second, microsecond)
print(repr(datetime.datetime.now()))

# replace() para fazer ajustes na data/hora

inicio = datetime.datetime.now()

print(inicio)

#  Alterar o horário pata 16 horas, 0 minuto, 0 segundo, 0 microsegundo(milésimos)

inicio = inicio.replace(year=2023, hour=16, minute=0, second=0, microsecond=0)

print(inicio)

#  Recebendo dados dos usuarios e convertendo para data
import datetime

evento = datetime.datetime(2019, 1, 1, 0)
print(type(evento))
print(type('31/12/2018'))

print(evento)

nascimento = input('Informa sua data de nascimento (dd/mm/yyyy)')
nascimento = nascimento.split('/')

nascimento = datetime.datetime(int(nascimento[2]), int(nascimento[1]), int(nascimento[0]))
print(nascimento)
print(type(nascimento))
"""

import datetime

evento = datetime.datetime.now()

print(evento.year)
print(evento.month)
print(evento.day)
print(evento.hour)
print(evento.minute)
print(evento.second)
print(evento.microsecond)

print(dir(evento))


