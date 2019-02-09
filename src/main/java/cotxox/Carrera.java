package cotxox;

public class Carrera {

    // Atributos

    private String tarjetaCredito = "";
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor = "";

    // Constructor

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    // Metodos

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
}
    /*

    public String getOrigen() {
    }

    public String getDestino() {
    }

    public String getDistancia() {
    }

    public String getCosteEsperado() {
    }

    public void realizarPago(String costeEsperado) {
    }

    public void asignarConductor(PoolConductores conductores) {
    }

    public void recibirPropina(int i) {
    }

    public void liberarConductor() {
    }
}
*/
