package cotxox;

public class Tarifa {

    // Atributos

    final static double COSTEMILLA = 1.35;
    final static double COSTEMINUTO = 0.35;
    final static int COSTEMINIMO = 5;
    private static double costeTotal = 0d;

    // Constructor

    public Tarifa() {}

    // Setters

    public static void setCosteTotal(double coste) {
        costeTotal += coste;
    }

    // Getters

    public static double getCOSTEMILLA() {
        return COSTEMILLA;
    }

    public static double getCOSTEMINUTO() {
        return COSTEMINUTO;
    }

    public static double getCosteTotal() {
        return costeTotal;
    }

    public static int getCOSTEMINIMO() {
        return COSTEMINIMO;
    }

    // Metodos

    public static void getCosteDistancia(Carrera carrera) {
        setCosteTotal(carrera.getDistancia() * getCOSTEMILLA());
    }

    public static void getCosteTiempo(Carrera carrera) {
        setCosteTotal(carrera.getTiempoEsperadoMinutos() * getCOSTEMINUTO());
    }

    public static double getCosteTotalEsperado() {

        if (getCosteTotal() < getCOSTEMINUTO()) {
            return getCOSTEMINIMO();
        } else {
            return getCosteTotal();
        }
    }

}
