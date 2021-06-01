#include <stdio.h>

#define MAX 8 //v.length();
int v[] = {44, 55, 12, 42, 94, 18, 06, 67};

void troca(int i, int j,int min, int max){
    int aux1 = 0;
    int aux2 = 0;
    aux1 = v[i];
    v[i] = v[min];
    v[min] = aux1;

    aux2 = v[max];
    v[max] = v[j-1];
    v[j-1] = aux2;

}

void imprimeVetor(){
    for (int i = 0; i < MAX; i++){
            printf("%d ",v[i]);
        }
    printf("\n");
}

void selecao(int n, int v[]) {
    int i = 0, j = 0, min = 0, max = 0;
    for (i = 0; i < n -1; i++){
        min = i;
        max = j;

        for (j = i + 1; j < n; j++){
            if (v[j] < v[min]){
                min = j;
            }
            if (v[j] > v[max]){
                max = j;
            }
        }
        troca(i, j, min, max);
        
        imprimeVetor();
   
    }
}

int main(void){

    imprimeVetor();

    selecao(MAX, v);
    
    return 0;
}
