#include <stdio.h>

int main(void){
    short int i1;
    unsigned short int i2;
    int i3;
    unsigned int i4;
    long int i5;
    unsigned long int i6;

    i1 = 159;
    i2 = 630u;
    i3 = -991023;
    i4 = 98979U;
    i5 = 8393202L;
    i6 = 34268298UL;

    printf("%hd %d %ho\n", i1, i1, i1);
    printf("%hu %i %hx\n", i2, i2, i2);
    printf("%+d % d %09d\n", i3, i3, i3);
    printf("%X %d %u\n", i4, i4, i4);
    printf("%+ld %ld %101d\n", i5, i5, i5);
    printf("%1u %10.81u %-1u\n", i6, i6, i6);

    //scanf("%d\n", &i1);
    return 0;

}