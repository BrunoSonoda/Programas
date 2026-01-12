#include <stdio.h>
#include "pilha.h"

int main(void)
{
    char frase[50];
    Pilha F = pilha(50);
    printf("Informe a frase: ");
    fgets(frase,50,stdin);
    printf("\nInvertida:\n");
    for(int i=0;frase[i];i++) {
        if(frase[i]!=' '){
        empilha(frase[i], F);
        }
        else{
        while(!vaziap(F)){
            printf("%c",desempilha(F));
        } 
        printf(" ");
        }
    }
    while(!vaziap(F)){
        printf("%c",desempilha(F));
    } 
    return 0;
}
