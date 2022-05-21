/**
 * Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num;
        int contPar = 0;
        int contImpar = 0;

        do {
           System.out.print("Insira um número inteiro [999 para sair]: ");
           num = tec.nextInt();

           if (num == 999) break;
           
           if (num % 2 == 0) {
               contPar++;
           } else {
                contImpar++;
           }
           
        } while (true);

        System.out.println("Números pares = " + contPar);
        System.out.println("Números ímpares = " + contImpar);
        tec.close();
    }
}