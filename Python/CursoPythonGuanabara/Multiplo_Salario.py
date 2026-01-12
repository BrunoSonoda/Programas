salario = float(input("Qual o seu salário: "))
if salario > 1250:
    novo = (salario * 0.10) + salario
    print("Seu salário é de: R${:.2f} passa a ganhar R${:.2f} agora.".format(salario, novo))
elif salario <= 1250 and salario > 0:
    novo = (salario * 0.15) + salario
    print("Seu salário é de: R${:.2f} passa a ganhar R${:.2f} agora.".format(salario, novo))
else:
    print("Valor inválido")
