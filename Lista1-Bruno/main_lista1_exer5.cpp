#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int a=0, b=0, c=0;
	cout<<"Troca de numeros inteiros";
    cout<<"\nInsira o 1 numero:";	
	cin>>a;
	cout<<"Insira o 2 numero:";
	cin>>b;
	c=a, a=b, b=c;
	cout<<"\nO 1 numero e:"<<a;
	cout<<"\nO 2 numero e:"<<b;
	
	return 0;
}
