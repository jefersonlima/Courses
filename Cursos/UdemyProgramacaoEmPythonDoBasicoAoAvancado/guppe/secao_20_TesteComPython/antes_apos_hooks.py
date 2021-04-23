# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Unittest - Antes e após hooks

----
hooks - são os testes em si. Ou seja, a execuçao dos testes.
----

setup() -> é executado antes de cada método de teste. E util para criarmos instâncias de objetos e outros dados;

tearDown() -> é executado ao final de cada método de teste. É util para excluir dados ou fechar conexões com
bancos de dados.
"""

import unittest

class ModuloTest(unittest.TestCase):

    def setUp(self) -> None:
        #  Configurações do serUp()
        pass

    def test_primeiro(self):
        #  setUp() vai rodar antes do teste
        #  tearDown() vai rodar após o teste
        pass

    def test_segundo(self):
        #  setUp() vai rodar antes do teste
        #  tearDown() vai rodar após o teste
        pass

    def tearDown(self) -> None:
        #  Configurações do tearDown()
        pass