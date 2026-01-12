#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int idade=0;
	cout<<"Calculo de idade,de dias para anos,meses e dias";
	cout<<"\nDigite a idade:";
	cin>>idade;
	cout<<"Em anos:"<<idade/365;
	cout<<"\nEm meses:"<<idade/30;
	cout<<"\nEm dias:"<<idade;
	
	return 0;
}
