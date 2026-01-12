#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int ano=0, mes=0, dia=0;
	cout<<"Calculo de idade de anos,mes e dia para dias";
	cout<<"\nDigite a idade em anos:";
	cin>>ano;
	cout<<"Digite a idade em meses:";
	cin>>mes;
	cout<<"De anos para dias:"<<ano*365;
	cout<<"\nDe meses para dias:"<<mes*30.4167;
	cout<<"\nEm dias"<<ano*365;
	
	
	return 0;
}
