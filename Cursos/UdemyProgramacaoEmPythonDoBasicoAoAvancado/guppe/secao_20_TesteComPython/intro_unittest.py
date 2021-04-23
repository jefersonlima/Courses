# -*- coding: UTF-8 -*- #  Configuração para não da problema nos comentário
"""
Introdução ao Módulo Unittest

Unittest -> Testes Unitários

O que são testes unitários?

Teste é a forma de se testar unidade individuais de código fonte.

Unidades Individuais podem ser: funções, métodos, classes, módulos etc.

#  OBS: Teste unitário não é específico da linguagem Python.

Para criar nossos testes, criamos classes que herdam de unittest, TestCase
e a partir de então ganhamos todos os 'assertions' presentes no módulo.

Para rodar os testes, utilizamos unittest.main()

TestCase -> Casos d eteste para sua unidade

# Conhecendo as assertions
https://docs.python.org/3/library/unittest.html?highlight=unittest#module-unittest

assertEqual(a, b)           a == b
assertNotEqual(a, b)a       != b
assertTrue(x)               bool(x) is True
assertFalse(x)              bool(x) is False
assertIs(a, b)              a is b
assertIsNot(a, b)           a is not b
assertIsNone(x)             x is None
assertIsNotNone(x)          x is not None
assertIn(a, b)              a in b
assertNotIn(a, b)           a not in b
assertIsInstance(a, b)      isinstance(a, b)
assertNotIsInstance(a, b)   not isinstance(a, b)

Por convenção, todos os testes em um test case, devem ter seu nome
iniciado com test_

#  Para executar os testes com unittest

python nome_do_modulo.py

#  Para executar os testes com unittest no modo verbose

python nome_do_modulo.py -v **no terminal dentro do diretorio onde está o arquivo

Podemos acrescentar (e é recomendado) docstrings nos nossos testes.
"""

#  Prtica ´- utilizando a abordagem TDD
