/**
 * Com switch faça um exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto "Certo".
 * Se for 4 exibir "Errado", se for 5 "Talvez".
 * Para os demais valores exibir "Valor indefinido".
 */

import java.util.Scanner;

public class Semana2 {

    public static void main(String[] args) {

        Scanner tec2 = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int num = tec2.nextInt();
        tec2.close();

        switch(num) {
            case 1:
            case 2:
            case 3:
                System.out.println("CERTO");
                break;
            case 4:
                System.out.println("ERRADO");
                break;
            case 5:
                System.out.println("TALVEZ");
                break;
            default:
                System.out.println("VALOR INDEFINIDO");
                break;
        }

    }
    
}
    
