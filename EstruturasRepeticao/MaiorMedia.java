/**
 * Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

import java.util.Scanner;

public class MaiorMedia {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int cont = 1;
        int soma = 0;
        int num, maior = 0;
        double media = 0;

        do {
            System.out.print("Insira um número: ");
            num = tec.nextInt();

            if (num > maior) {
                maior = num;
            }

            soma += num;
            media = soma / cont;
            cont++;           
        } while (cont < 6);

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + media);
        tec.close();

    }
}
