/**
 * Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 */

public class Exerc01 {

    public static void main(String[] args) {
        Exerc01.soma(5, 5);
        Exerc01.subtracao(5, 5);
        Exerc01.multiplicacao(5, 5);
        Exerc01.divisao(5, 5);

    }

    public static void soma(double n1, double n2) {
        double s = n1 + n2;
        System.out.println("Soma = " + s);
    }

    public static void subtracao(double n1, double n2) {
        double s = n1 - n2;
        System.out.println("Subtração = " + s);
    }

    public static void multiplicacao(double n1, double n2) {
        double m = n1*n2;
        System.out.println("Multiplicação = " + m);
    }

    public static void divisao(double n1, double n2) {
        double d = n1/n2;
        System.out.println("Divisão = " + d);
    }
}