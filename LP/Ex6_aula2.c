#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

int main(void)
{
    char s[11];
    Pilha P = pilha(5);
    for(int i = 1; i <= 3; i++) {
        printf("? ");
        fgets(s, sizeof(s), stdin);
        s[strcspn(s, "\n")] = '\0'; 
        empilha(strdup(s), P);
    }
    while(!vaziap(P)){
        printf("%s\n", desempilha(P));
    }
    return 0;
}



