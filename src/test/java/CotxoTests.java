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
    public void gettersCarreraTest() {
        assertEquals("4916119711304546", user.getTarjetaCredito());
        assertEquals("Aeroport Son Sant Joan", user.getOrigen());
        assertEquals("Magaluf", user.getDestino());
        assertEquals(7.75, user.getDistancia(), 0.0);
        assertEquals(10, user.getTiempoEsperadoMinutos());
    }

    @Test
    public void getCosteEsperadoTest() {
        assertEquals(13.9625, user.getCosteEsperado(), 0.0);
    }
}