import java.util.Scanner;

public class Equacao2Grau {
    private double a;
    private double b;
    private double c;

    public Equacao2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double calcularX1() {
        double delta = calcularDelta();
        if (delta < 0) {
            return Double.NaN; 
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public double calcularX2() {
        double delta = calcularDelta();
        if (delta < 0) {
            return Double.NaN; 
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os coeficientes:");

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        Equacao2Grau equacao = new Equacao2Grau(a, b, c);

        double delta = equacao.calcularDelta();
        double x1 = equacao.calcularX1();
        double x2 = equacao.calcularX2();

        System.out.println("Delta: " + delta);
        if (!Double.isNaN(x1)) {
            System.out.println("x1: " + x1);
        } else {
            System.out.println("Não há raiz real para x1.");
        }

        if (!Double.isNaN(x2)) {
            System.out.println("x2: " + x2);
        } else {
            System.out.println("Não há raiz real para x2.");
        }

        scanner.close();
    }
}
