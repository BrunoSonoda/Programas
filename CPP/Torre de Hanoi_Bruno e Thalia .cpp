//atividade: torre de hanoi
//Integrantes: Bruno Sonoda-1840482313035 e Thalia Soares-1840482313036
#include <iostream>
#include <math.h>

using namespace std;

void mover(int n, char origem, char destino, int &contador){
    cout <<contador<< "-Mover disco " << n << " de " << origem << " para " << destino << endl;
    contador++;
}

void moverDisco(int n, char* origem, char* destino, char* auxiliar,int &contador) {
    if (n == 1) {
        mover(n, *origem, *destino, contador);
        return;
    }

    moverDisco(n - 1, origem, auxiliar, destino,contador);
    mover(n, *origem, *destino, contador);
    moverDisco(n - 1, auxiliar, destino, origem,contador);
}

int main() {
    int numDiscos;

    cout << "Informe o numero de discos: ";
    cin >> numDiscos;

    char torreA = 'A';
    char torreB = 'B';
    char torreC = 'C';
    
    int movimentos=1;

    moverDisco(numDiscos, &torreA, &torreC, &torreB,movimentos);
    cout<<"\nO numero minimo de movimentos e: "<<(pow(2,numDiscos))-1;

    return 0;
}
