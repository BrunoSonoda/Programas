#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	float valor=0, taxa=0, tempo=0;
	cout<<"Calculo do valor de uma prestacao em atraso";
	cout<<"\nDigite o valor:";
	cin>>valor;
	cout<<"Digite a taxa:";
	cin>>taxa;
	cout<<"Digite o tempo de atraso:";
	cin>>tempo;
	cout<<"O valor da prestacao e:"<<valor+(valor*(taxa/100)*tempo);
	
	return 0;
}
