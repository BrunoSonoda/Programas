#include <stdio.h>
#include "pilha.h"

int main(void)
{
    int m,n,o,p;
    Pilha A=pilha(8*sizeof(int));
    Pilha B=pilha(8*sizeof(int));
    printf("Digite a quantidade de numeros: ");
    scanf("%d",&m);
    for(int i=0;i<m;i++){
        printf("\nDigite um numero: ");
        scanf("%d",&n);
        empilha(n,B);
        if(i>=1){
            o=desempilha(B);
            if(topo(B)<o){
                p=desempilha(B);
                empilha(o,B);
                empilha(p,B);
            }
            else{
                empilha(o,B);
            }
        }
    }
    empilha(desempilha(B),A);
    while(!vaziap(B)){
        if(topo(B)<topo(A)){
            n=desempilha(A);
            empilha(desempilha(B),A);
            empilha(n,A);
        }
        else{
            empilha(desempilha(B),A);
        }
    }
    empilha(desempilha(A),B);
    while(!vaziap(A)){
		if(topo(A)==topo(B)){
			desempilha(B);
		}
		else{
		    empilha(desempilha(A),B);
		}
	}
    while(!vaziap(B)){
		empilha(desempilha(B),A);
	}
    destroip(&B);
    while(!vaziap(A)){
        printf("%d ",desempilha(A));
    }
    destroip(&A);

    return 0;
}
