package cotxox;

public class Tarifa {

    // Atributos

    private double costeMilla = 1.35;
    private double costeMinuto = 0.35;
    private int costeMinimo = 5;
    private double porcentajeComision = 20;
    private double costeTotal = 0;

    // Metodos

    public void getCosteDistancia(Carrera carrera) {
        costeTotal += carrera.getDistancia() * costeMilla;
    }

    public void getCosteTiempo(Carrera carrera) {
        costeTotal += carrera.getTiempoCarrera() * costeMinuto;
    }

    public double getCosteTotalEsperado(Carrera carrera) {

        if (costeTotal < costeMinimo) {
            return costeMinimo;
        } else {
            return costeTotal;
        }
    }

}
