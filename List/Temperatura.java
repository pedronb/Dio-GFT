/**
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média e em que mês ocorreram.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<Double> listaTemperaturas = new ArrayList<Double>();
        ArrayList<String> mes = new ArrayList<String>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));
        double soma = 0;
        double media;

        for(int cont = 1; cont <= 6; cont++ ) {
            System.out.printf("Informe uma temperatura do %dº mês: ", cont);
            double t = Double.parseDouble(input.next());
            listaTemperaturas.add(t);
        }

        for(double temp : listaTemperaturas) {
            soma += temp;
        }

        media = soma / listaTemperaturas.size();

        System.out.println("-- Temperaturas acima da média: --");

        for(int i=0; i < listaTemperaturas.size(); i++) {
            if(listaTemperaturas.get(i) > media) {
                System.out.printf("%.1f Cº - %s\n", listaTemperaturas.get(i), mes.get(i));               
            }
        }

        input.close();
    }
    
}
