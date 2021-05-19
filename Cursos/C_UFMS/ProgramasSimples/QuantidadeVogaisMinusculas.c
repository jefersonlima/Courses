#include <stdio.h>

/* Recebe uma frase e conta o número de vogais minúsculas que ela possui */
int main (void){
    char c;
    int conta;

    printf("Digite uma frase: ");
    conta = 0;

    do {
        scanf("%c", &c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            conta++;
        }
    }while (c != '\n');
    
    printf("A frase tem %d vogais minúsculas\n", conta);    
    //scanf("%c", &c);
    return 0;
}