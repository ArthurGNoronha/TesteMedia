import org.example.CalculoMedia;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAsserts {
    @Test
    public void testCalcularMedia() {
        CalculoMedia calculoMedia = new CalculoMedia();

        assertEquals(7.0, calculoMedia.calcularMedia(7.0, 7.0, 7.0), 0.001);

        assertTrue(calculoMedia.calcularMedia(7.0, 6.0, 5.0) > 6.0);

        assertFalse(calculoMedia.calcularMedia(7.0, 6.0, 5.0) < 6.0);
    }

    @Test
    public void testVerificarSituacao() {
        CalculoMedia calculoMedia = new CalculoMedia();

        assertEquals("Aprovado", calculoMedia.verificarSituacao(7.0));

        assertNotEquals("Aprovado", calculoMedia.verificarSituacao(5.0));
    }

    @Test
    public void testCalcularMediaSame() {
        CalculoMedia calculoMedia = new CalculoMedia();

        assertSame(calculoMedia, calculoMedia);
    }
}
