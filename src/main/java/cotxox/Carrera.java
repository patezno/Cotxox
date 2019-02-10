package cotxox;

public class Carrera {

    // Atributos

    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0;
    private int tiempoEsperadoMinutos = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor = "";

    // Constructor

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperadoMinutos) {
        this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
    }

    // Metodos

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getTiempoEsperadoMinutos() {
        return tiempoEsperadoMinutos;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }
    /*
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
    */
}
