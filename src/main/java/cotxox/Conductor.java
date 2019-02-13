package cotxox;

import java.util.ArrayList;

public class Conductor {

    // Atributos

    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();
    private boolean ocupado = false;

    // Constructor

    public Conductor() {}

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularMedia();
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    // Metodos

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public double calcularMedia() {

        int suma = 0;

        for (byte valoracion : this.valoraciones) {
            suma += valoracion;
        }

        this.valoracionMedia = (double) suma / this.valoraciones.size();

        return valoracionMedia;

    }
}
