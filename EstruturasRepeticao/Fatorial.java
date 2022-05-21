/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int prod = 1;

        System.out.print("Digite um número inteiro para obter seu fatorial: ");
        int num = tec.nextInt();
        System.out.print(num + "! = ");

        for (int cont = num; cont >= 1; cont--) {
            if (cont == 1) {
                System.out.print(cont + " = " + prod);
                break;
            }
            System.out.print(cont + ".");
            prod *= cont;
        }

        tec.close();
    }
    
}
