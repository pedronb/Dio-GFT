/**
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
 */
import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira um número inteiro entre 1 e 10: ");
        int num = tec.nextInt();
        System.out.println("TABUADA DE " + num + ":");

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(num + " x " + cont + " = " + (num*cont));
        }

        tec.close();

    }
}
