package cotxox;

public class Tarifa {

    // Atributos

    final static double COSTEMILLA = 1.35;
    final static double COSTEMINUTO = 0.35;
    final static int COSTEMINIMO = 5;
    private static double costeTotal = 0;

    // Constructor

    public Tarifa() {}

    // Getters

    public static void getCosteDistancia(Carrera carrera) {
        costeTotal += carrera.getDistancia() * COSTEMILLA;
    }

    public static void getCosteTiempo(Carrera carrera) {
        costeTotal += carrera.getTiempoEsperadoMinutos() * COSTEMINUTO;
    }

    public static double getCosteTotalEsperado() {

        if (costeTotal < COSTEMINIMO) {
            return COSTEMINIMO;
        } else {
            return costeTotal;
        }
    }

}
