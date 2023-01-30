import java.util.Scanner;

public class Exercicios{
    public static void main(String[] args) {     
        /* Aqui é o programa
         * que fará as quatro operações matemáticas
         * com os valores escolhidos pelo usuário
        */
        int valorUm;
        int valorDois;
         
        /* Variáveis que serão utilizadas
         * no exercício Mensagem */     
        int horario;

        System.out.println("***Exercício Calculadora***");
        System.out.println();

        try (/* Comando para que o usuário insira os valores
                 * desejados para o cálculo.
                 */
        Scanner entrada = new Scanner(System.in)) {
            System.out.println("Escolha um valor inteiro diferente de zero: ");
            valorUm = entrada.nextInt();
            System.out.println("Escolha outro valor inteiro diferente de zero: ");
            valorDois = entrada.nextInt();
        }
        

        /* Aqui estão os métodos que foram criados com
         * as operações matemáticas
         */

         //como já está especificado que o resultado precisa ser impresso,
         //então esse comando não precisa ser dado de novo
        MetodosMatematicos.somarValor(valorUm, valorDois);
        MetodosMatematicos.subtrairValor(valorUm, valorDois);
        MetodosMatematicos.multiplicarValor(valorUm, valorDois);
        MetodosMatematicos.dividirValor(valorUm, valorDois);
        
        /*Exercício sobre mensagem
         */
        System.out.println();
        System.out.println("***Mensagem***");
        System.out.println();

        try (/*Criando o comando para entrada
                 * do usuário
                 */
        Scanner horas = new Scanner(System.in)) {
            System.out.println("Escolha um horário:");
                horario = horas.nextInt();
        
        /* Chamanda do método MensagemHorario
         */
        MensagemHorario.obterMensagem(horario); //este único método é o que vai fornecer o horário de acordo com a hora escolhida
        }
        
        /* Bloco correspondente à Juros Compostos
         */
        System.out.println();
        System.out.println("***Juros Compostos***");
        System.out.println();

        /* Bloco para as variáveis que
         * serão utilizadas
         */

         double capitalInicial;
         double taxaJuros;
         double tempo;
         

         try (/* Comando de entrada para os valores
                  */
        Scanner valores = new Scanner(System.in)) {
            JurosCompostos.valorInicial();
            capitalInicial = valores.nextDouble();

            JurosCompostos.duracaoInvestimento();
            tempo = valores.nextDouble();

            JurosCompostos.juros();
            taxaJuros = valores.nextDouble();
        }
        
        JurosCompostos.valorFinal();
        JurosCompostos.calculoJuros(taxaJuros, tempo, capitalInicial);

        /* Bloco sobre sobrecarga de métodos
         */
        System.out.println();
        System.out.println("***Quadriláteros***");
        System.out.println();

        // aqui fica claro a questão da sobrecarga do método area
        Quadrilateros.area(4);
        Quadrilateros.area(5, 9);
        Quadrilateros.area(6, 2, 3);





        

        
    }
}
