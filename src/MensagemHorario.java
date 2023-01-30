public class MensagemHorario {
    
    int horario;
   
        /*Métodos para exibição da mensagem
         * de acordo com a hora do dia (em números inteiros)
         */
        public static void mensagemManha () {
            System.out.println("Bom dia.");
            }
        public static void mensagemTarde () {
            System.out.println("Boa tarde.");  
            }
        public static void mensagemNoite() {
            System.out.println("Boa noite");    
        }
        /* Método para os horários possíveis do dia
         */
        public static void obterMensagem(int horario) {
            /* O uso do controle de fluxo switch permite 
             * abordar todas as horas do dia sem precisar
             * ficar criando várias condições para cada horário.
             */
            switch(horario) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    mensagemManha(); // é possível chamar um método dentro de um método. O que permite isso é o uso do _static_
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    mensagemTarde();
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 1:
                case 2:
                case 3:
                    mensagemNoite();
                    break;
                default:
                    System.out.println("Horário Inválido");
            }
        }

    }


