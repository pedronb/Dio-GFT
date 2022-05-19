/**
 * Com if, exiba o nome do mês do ano de acordo com seu número.
 * Evite o efeito "flecha". Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias".
 */

import java.util.Scanner;

public class Mes {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");
        int mes = tec.nextInt();
        tec.close();

        if (mes == 1) {
            System.out.println("JANEIRO");
        } else if (mes == 2) {
            System.out.println("FEVEREIRO");
        } else if (mes == 3) {
            System.out.println("MARÇO");
        } else if (mes == 4) {
            System.out.println("ABRIL");
        } else if (mes == 5) {
            System.out.println("MAIO");
        } else if (mes == 6) {
            System.out.println("JUNHO");
        } else if (mes == 7) {
            System.out.println("JULHO");
        } else if (mes == 8) {
            System.out.println("AGOSTO");
        } else if (mes == 9) {
            System.out.println("SETEMBRO");
        } else if (mes == 10) {
            System.out.println("OUTUBRO");
        } else if (mes == 11) {
            System.out.println("NOVEMBRO");
        } else if (mes == 12) {
            System.out.println("DEZEMBRO");
        } else {
            System.out.println("MÊS INVÁLIDO!");
        }

        if (mes == 7 || mes == 12 || mes == 1) {
            System.out.println("FÉRIAS!");
        }

    }

}