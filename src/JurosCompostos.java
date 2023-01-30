import java.lang.Math;

public class JurosCompostos {
    // A fórmula 
    // para calcular os juros compostos é: 
    // M = C.(1+i)^n, sendo M o montante, C o capital inicial, i a taxa de juros e n o tempo.

    double capitalInicial;
    double montante;
    double taxaJuros;
    double tempo;
   

    /* Comandos para que os valores sejam adicionados 
    */ 
    public static void valorInicial () {
        System.out.println("Valor Capital Inicial investido: ");
    }
    public static void duracaoInvestimento () {
        System.out.println("Tempo de investimento (em anos): ");
    }
    public static void juros (){
        System.out.println("Taxa de juros: ");
    }
    public static void valorFinal () {
        System.out.println("Ao final do investimento, o montante será de: ");

    }
    

    /* Bloco de métodos para cálculo
     */
    public static void calculoJuros (double taxaJuros, double tempo, double capitalInicial) {
        double jurosTotal = taxaJuros/100;
        double jurosTotal2 = Math.pow ((1 + jurosTotal), tempo);
        double montante = capitalInicial * jurosTotal2;

        System.out.println(montante);
    }
    

}