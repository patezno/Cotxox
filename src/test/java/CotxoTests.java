import cotxox.Carrera;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CotxoTests {

    private Carrera user = null;

    @Before
    public void init() {

        String tarjetaCredito = "4916119711304546";
        String origen = "Aeroport Son Sant Joan";
        String destino = "Magaluf";
        double distancia = 7.75;
        int tiempoEsperadoMinutos = 10;

        user = new Carrera(tarjetaCredito);
        user.setOrigen(origen);
        user.setDestino(destino);
        user.setDistancia(distancia);
        user.setTiempoEsperado(tiempoEsperadoMinutos);
    }

    @Test
    public void getTarjetaCreditoTest() {
        assertEquals("4916119711304546", user.getTarjetaCredito());
    }
}
