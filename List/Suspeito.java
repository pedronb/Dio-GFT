/**
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificada como "Inocente".
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Suspeito {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<>();
        int culpabilidade = 0;

        System.out.println("-- INTERROGATÓRIO --");
        System.out.print("Telefonou para a vítima? ");
        String telefonou = input.next();
        respostas.add(telefonou);

        System.out.print("Esteve no local do crime? ");
        String local = input.next();
        respostas.add(local);

        System.out.print("Mora perto da vítima? ");
        String mora = input.next();
        respostas.add(mora);

        System.out.print("Devia para a vítima? ");
        String devia = input.next();
        respostas.add(devia);

        System.out.print("Já trabalhou com a vítima? ");
        String trabalhou = input.next();
        respostas.add(trabalhou);

        for(int cont = 0; cont < respostas.size(); cont++) {
            if(respostas.get(cont).equals("sim")) {
                culpabilidade++;
            }
        }

        switch (culpabilidade) {
            case 2:
                System.out.println("Conclusão: SUSPEITA.");
                break;
            case 3:
            case 4:
                System.out.println("Conclusão: CÚMPLICE.");
                break;
            case 5:
                System.out.println("Conclusão: ASSASSINO.");
                break;
            default:
                System.out.println("Conclusão: INOCENTE.");                
                break;
        }

        input.close();
    }
    
}
