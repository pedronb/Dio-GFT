/**
 * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números.
 */
import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        
        Random gera = new Random();
        int listaInteiros[] = new int[20];

        // adiciona os números gerados aleatoriamente, entre 0 e 100, no vetor.
        for (int cont = 0; cont < listaInteiros.length; cont++) {
            listaInteiros[cont] = gera.nextInt(101);           
        }

        System.out.print("Lista dos números: ");

        // imprime cada elemento do vetor.
        for (int n : listaInteiros) {
            System.out.print(n + " ");           
        }

    }
    
}
