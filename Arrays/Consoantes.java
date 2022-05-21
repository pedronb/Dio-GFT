/**
 * Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        String listaConsoantes[] = new String[6];
        String letra = "";
        int contConsoante = 0;
        
        for (int cont = 0; cont < listaConsoantes.length; cont++) {
            System.out.print("Digite uma letra: ");
            letra = tec.next();
            
            boolean vogal = (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"));

            if (!vogal) {
                contConsoante++;
                listaConsoantes[cont] = letra;
            }
        }

        System.out.println("Quantidade de consoantes: " + contConsoante);
        System.out.print("Consoantes: ");

        for (String consoantes : listaConsoantes) {
            if (consoantes != null) {
                System.out.print(consoantes + " ");
            }           
        }

        tec.close();
    }
    
}
