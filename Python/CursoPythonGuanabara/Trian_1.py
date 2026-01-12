print("-="*20)
print("Analisador")
print("-="*20)
r1 = float(input("Digite a primeira reta: "))
r2 = float(input("Digite a segunda reta: "))
r3 = float(input("Digite a terceira reta: "))
if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r2 + r1:
    print("Os segmentos acima podem formar um triângulo!")
else:
    print("Os segmentos acima NÃO podem formar um triângulo!")
