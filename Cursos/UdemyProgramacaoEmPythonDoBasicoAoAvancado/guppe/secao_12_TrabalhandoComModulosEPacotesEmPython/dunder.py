"""
Dunder Name e Dunder Main

Dunder -> Double Under

Dunder Name -> __name__

Dunder Main -> __main__

Em Python, são utilizados dunder para criar funções, atributos, propriedade e etc utilizando
Double Under para não gerar conflito com os nomes desses elementos na programação.

#  Na linguagem C, temos um programa da seguinte forma:

int main(){
    return 0
}

#  Na linguagem Java, temos um programa da seguinte forma:

public static void main(String[] args){

}

#  Em Python, se executarmos um módulo Python diretamente na linha de comando, internamente
o python atribuirá à variável __name__ o valor __main__ indicando que este módulo é o módulo de execução principal.

from guppe.secao_8_FuncoesEmPython import funcoes_com_parametros as fcp

print(fcp.soma_impares([1, 2, 3, 4, 5, 6]))
"""

import primeiro, segundo


