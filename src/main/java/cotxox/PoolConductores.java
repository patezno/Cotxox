package cotxox;

import java.util.ArrayList;
import java.util.Random;

public class PoolConductores {

    // Atributos

    private ArrayList<Conductor> poolConductores;

    //Constructores

    public PoolConductores() {}

    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    // Getter

    public ArrayList<Conductor> getPoolConductores() {
        return poolConductores;
    }

    // Metodo

    public Conductor asignarConductor() {

        Conductor conductor = new Conductor();
        Random random = new Random();
        boolean ocupado = false;

        while (!ocupado) {

            int indice = random.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(indice);

            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                ocupado = true;
            }
        }

        return conductor;

    }
}
