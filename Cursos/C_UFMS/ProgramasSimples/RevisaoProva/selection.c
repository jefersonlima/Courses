#include <stdio.h>

#define MAX 8;//v.length();
int v[] = {44, 55, 12, 42, 94, 18, 06, 67};

void troca(int i,int min){
    int aux = 0;
    aux = v[i];
    v[i] = v[min];
    v[min] = aux;

}

void selecao(int n, int v[]) {
    int i, j, min;
    for (i = 0; i < n -1; i++){
        min = i;
        for (j = i + 1; j < n; j++){
            if (v[j] < v[min]){
                min = j;
            }
        }
        troca(i, min);
        

        for (int i = 0; i < 8; i++){
            printf("%d ",v[i]);
        }
        printf("\n");
    }
}

int main(void){

    for (int i = 0; i < 8; i++){
        printf("%d ", v[i]);
    }
    printf("\n");

    selecao(8, v);
    
    return 0;
}
