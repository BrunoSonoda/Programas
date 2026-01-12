#include <stdio.h>
#include <string.h>
#include "pilha.h"

int main(void)
{
    int x,y,z,a,b,c;
    char frase[50];
    Pilha F = pilha(50);
    printf("Informe a cadeia: ");
    fgets(frase,50,stdin);
    printf("\nInvertida:\n");
    for(int i=0;frase[i];i++) {
        empilha(frase[i], F);
    }
    while(!vaziap(F)){
        if(topo(F)=='['){
            a++;
            desempilha(F);
        }
        else if(topo(F)==']'){
            b++;
            desempilha(F);
        }
        else if(topo(F)=='{'){
            c++;
            desempilha(F);
        }
        else if(topo(F)=='}'){
            x++;
            desempilha(F);
        }
        else if(topo(F)=='('){
            y++;
            desempilha(F);
        }
        else if(topo(F)==')'){
            z++;
            desempilha(F);
        }
        else{
            desempilha(F);
        }
    } 
    if((x%2)!=0||(y%2)!=0||(z%2)!=0||(a%2)!=0||(b%2)!=0||(c%2)!=0){
        printf("Esta cadeia nao esta balanceada. ");
    }
    else{
        printf("Esta cadeia esta balanceada. ");
    }
    return 0;
}
