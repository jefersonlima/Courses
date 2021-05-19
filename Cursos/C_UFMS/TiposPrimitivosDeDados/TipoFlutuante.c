#include <stdio.h>

int main (void){

    float f1;
    double d1;
    long double d2;

    f1 = 390.99999922;
    d1 = 490.8888888;
    d2 = 590.999999L;

    printf("%f %.2f\n", f1, f1);
    printf("%f %.2f %e %.2e\n", d1, d1, d1, d1);
    printf("%f %.2f %g %.2g\n", d2, d2, d2, d2); //descobrir como usar o long double

    return 0;
}
