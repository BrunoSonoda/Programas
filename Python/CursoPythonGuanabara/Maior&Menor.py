n1 = str(input('Digite um número: '))
n2 = str(input('Digite um número: '))
n3 = str(input('Digite um número: '))

if n1 > n2 and n1 > n3:
    print(n1+" é o maior")
elif n2 > n1 and n2 > n3:
    print(n2+" é o maior")
else:
    print(n3+" é o maior")
