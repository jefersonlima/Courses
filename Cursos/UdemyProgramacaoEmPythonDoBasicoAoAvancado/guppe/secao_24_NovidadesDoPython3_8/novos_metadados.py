# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
New Metadata
"""
from importlib import metadata
# print(metadata.version('pip'))
#
# metadados_pip = metadata.metadata('pip')
# print(list(metadados_pip))
# # print(metadados_pip) # melhor que a lista acima

# print(metadados_pip['Project-URL'])

#  print(len(metadata.files('pip')))

print(metadata.requires('pip'))
# print(metadata.requires('django'))





