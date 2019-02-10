package cotxox;

public class Tarifa {

    // Atributos

    private double costeMilla = 1.35;
    private double costeMinuto = 0.35;
    private int costeMinimo = 5;
    private double porcentajeComision = 20;

    // Metodos

    public double getCosteDistancia(Carrera carrera) {
        return carrera.getDistancia() * costeMilla;
    }

    public double getCosteTiempo(Carrera carrera) {
        return carrera.getTiempoCarrera() * costeMinuto;
    }
    

}
