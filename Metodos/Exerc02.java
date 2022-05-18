/**
 * A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
 */
public class Exerc02 {
    
    public static void main(String[] args) {
        Exerc02.boasVindas(10);
        
    }

    public static void boasVindas(int hora) {
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    } 
}
