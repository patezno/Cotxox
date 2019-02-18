package cotxox;

public class Carrera {

    // Atributos

    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0;
    private int tiempoEsperadoMinutos = 0;
    private double costeTotal = 0;
    private Conductor conductor = null;
    private int propina = 0;

    // Constructores

    public Carrera() {}

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    // Setters

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

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    // Getters

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

    public double getCosteEsperado() {

        Tarifa.getCosteDistancia(this);
        Tarifa.getCosteTiempo(this);

        return Tarifa.getCosteTotalEsperado();
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public int getPropina() {
        return propina;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    // Metodos

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void liberarConductor() {
        conductor.setOcupado(false);
    }

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }
}
