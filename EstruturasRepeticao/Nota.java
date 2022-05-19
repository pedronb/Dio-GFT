/**
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Nota {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        double nota=0;
        boolean notaAdmissivel = (nota > 0 && nota <= 10);

        
        while(true) {

            System.out.print("Digite uma nota de 0 a 10: ");
            nota = Double.parseDouble(tec.nextLine());

            if (notaAdmissivel) {
                break;
            }

            System.out.println("Nota INVÁLIDA. Insira novamente.");
   
        }

        tec.close();
        
    }
}
