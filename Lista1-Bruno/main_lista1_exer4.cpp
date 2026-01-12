#include <iostream>

using namespace std;

int main(int argc, char** argv)
 {
     int raio=0, altura=0;
     cout<<"Calculo do volume de uma lata de oleo";
     cout<<"\nDigite o raio da lata";
     cin>>raio;
     cout<<"Digite a altura da lata";
	 cin>>altura;
     cout<<"O volume da lata e:"<<3.14159*(raio*raio)*altura;
    
    
	return 0;
}
