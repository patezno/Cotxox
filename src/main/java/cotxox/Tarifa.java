package cotxox;

public class Tarifa {

    // Atributos

    private static double costeMilla = 1.35;
    private static double costeMinuto = 0.35;
    private static int costeMinimo = 5;
    private double porcentajeComision = 20;
    private static double costeTotal = 0;

    // Metodos

    public static void getCosteDistancia(Carrera carrera) {
        costeTotal += carrera.getDistancia() * costeMilla;
    }

    public static void getCosteTiempo(Carrera carrera) {
        costeTotal += carrera.getTiempoEsperadoMinutos() * costeMinuto;
    }

    public static double getCosteTotalEsperado() {

        if (costeTotal < costeMinimo) {
            return costeMinimo;
        } else {
            return costeTotal;
        }
    }

}
