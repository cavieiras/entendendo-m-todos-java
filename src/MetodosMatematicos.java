public class MetodosMatematicos {

    double valorUm;
    double valorDois;

    /*Criação dos métodos
     * matemáticos que serão utilizados
     */
    // visib   tipo  retorno nomeMét parametros
        public static void somarValor(double valorUm, double valorDois) { //colocar os parâmetros
           double somar = valorUm + valorDois;
           System.out.println(" A soma é: " + somar);
        }

        public static void subtrairValor(double valorUm, double valorDois) {
            double subtrair = valorUm - valorDois;
            System.out.println(" A subtração é: " + subtrair);
        }

        public static void multiplicarValor(double valorUm, double valorDois) {
            double multiplicar = valorUm * valorDois;
            System.out.println(" A multiplicaçao é: " + multiplicar);
        }

        public static void dividirValor( double valorUm, double valorDois) {
            if (valorDois != 0) { //essa operação só será feita se valorDois diferente de zero.
                double dividir = valorUm / valorDois;
                System.out.println(" A divisão é: " + dividir);
            } else {
                System.out.println("Não pode dividir por zero, cidadão");
            }
            
             
        }

    }
