public class Quadrilateros {
     /* Métodos criados para cálculo das áreas
      */

      // a sobrecargar está no método _ÁREA_
      // pois os parâmetros mudam para cada caso
    public static void area (double lado) {
        System.out.println( "Área do quadrado: " + lado*lado);
    }

    public static void area (double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1*lado2);
    }

    public static void area (double baseMaior, double altura, double baseMenor) {
        System.out.println("Área trapézio: " + ((baseMaior + baseMenor)*altura)/2);
    }
}
