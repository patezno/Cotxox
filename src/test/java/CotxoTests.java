import cotxox.Carrera;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CotxoTests {

    @Test
    public void getTarjetaCreditoTest() {
        Carrera user = new Carrera("4916119711304546");
        assertEquals("4916119711304546", user.getTarjetaCredito());
    }
}
