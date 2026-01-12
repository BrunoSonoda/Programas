#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	float v=0, d=0;
	cout<<"Conversao de dolares para real";
	cout<<"\nQual e a cotacao do dolar atual?";
	cin>>v;
	cout<<"Qual e a quantia possuida de dolares?";
	cin>>d;
	cout<<"O valor em reais, da sua quantia de dolares, e:"<<d*v;
	
	
	return 0;
}
