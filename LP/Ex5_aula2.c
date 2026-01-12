#include <stdio.h>
#include "pilha.h"

int main(void)
{
    char s[11];
    Pilha P = pilha(5);
    for(int i=1;i<=3;i++) {
        printf("? ");
        gets(s);
        empilha(s,P);
    }
    while(!vaziap(P)){
        puts(desempilha(P));
    }
    return 0;
}
