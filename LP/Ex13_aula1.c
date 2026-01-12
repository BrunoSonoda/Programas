#include <stdio.h>

void troca(int *a,int *b){
    int c=*a;
    *a=*b;
    *b=c;
}

int main(void)
{   
    int x,y;
    printf("Digite dois valores: ");
    scanf("%d %d",&x,&y);
    troca(&x,&y);
    printf("X=%d, Y=%d",x,y);
    return 0;
}
