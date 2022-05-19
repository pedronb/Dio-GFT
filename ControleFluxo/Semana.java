/**
 * Com switch use String para a partir do dia da semana exibir seu número.
 */

import java.util.Scanner;

public class Semana {
    
    public static void main(String[] args) {
        Scanner tec1 = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String diaSemana = tec1.nextLine();
        tec1.close();

        switch(diaSemana.toUpperCase()) {
            case "SEGUNDA":
                System.out.println(2);
                break;
            case "TERÇA":
                System.out.println(3);
                break;
            case "QUARTA":
                System.out.println(4);
                break;
            case "QUINTA":
                System.out.println(5);
                break;
            case "SEXTA":
                System.out.println(6);
                break;
            case "SABADO":
                System.out.println(7);
            case "DOMINGO":
                System.out.println(1);
                break;
        }

    }

}
