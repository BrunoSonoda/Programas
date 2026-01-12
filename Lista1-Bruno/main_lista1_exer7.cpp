#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int n=0, c=0;
	cout<<"Tabuada de 1 numero";
	cout<<"\n Insira o numero";
	cin>>n;
	while(c<=10){
		cout<<n<<"*"<<c<<"="<<n*c<<"\n";
		c++;
	}
	return 0;
}
