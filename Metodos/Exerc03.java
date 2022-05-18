/**
 * Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. defina arbitrariamente as faixas que influeciam nos valores.
 */
public class Exerc03 {
    
    public static void main(String[] args) {

        Exerc03.obterEmprestimo(1500, 1.7, 12);

    }

    public static void detalhesEmprestimo(double c, double m, double i, int p) {
        System.out.println("Detalhes empréstimo:");
        System.out.println("Valor empréstimo: R$ " + c);
        System.out.println("Taxa: " + i + "%a.m");
        System.out.println("Parcelas: " + p + " meses ");
        System.out.println("Total a pagar: R$ " + m);
    }
    public static void obterEmprestimo(double capital, double taxa, int parcela) {
        double m = capital + (capital* (taxa/100) * parcela);
        Exerc03.detalhesEmprestimo(capital, m, taxa, parcela);   
    }


}
