/**
 * Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */

import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int num;

        // declarando um vetor com 5 posições e armazenando em memória
        int listaNumeros[] = new int[5];

        // adicionando elementos no vetor
        for(int cont = 0; cont < listaNumeros.length; cont++) {
            System.out.print("Insira um número inteiro: ");
            num = tec.nextInt();
            listaNumeros[cont] = num;           
        }

        // imprime os valores do vetor em ordem inversa
        for(int cont = (listaNumeros.length-1); cont >= 0; cont--) {
            System.out.print(listaNumeros[cont] + " ");
        }

        tec.close();
    }
   
}
