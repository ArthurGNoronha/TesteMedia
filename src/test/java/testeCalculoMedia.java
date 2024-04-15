import org.example.CalculoMedia;
import org.junit.Test;

import static org.junit.Assert.*;

public class testeCalculoMedia {
    @Test
    public void testeCalcularMedia() {
        CalculoMedia calculoMedia = new CalculoMedia();
        assertEquals(7.0, calculoMedia.calcularMedia(7.0, 7.0, 7.0), 0.01);
    }

    @Test
    public void testeVerificarSituacaoAprovado() {
        CalculoMedia calculoMedia = new CalculoMedia();
        assertEquals("Aprovado", calculoMedia.verificarSituacao(7.0));
    }

    @Test
    public void testeVerificarSituacaoSegundaOportunidade() {
        CalculoMedia calculoMedia = new CalculoMedia();
        assertEquals("Segunda Oportunidade", calculoMedia.verificarSituacao(5.3));
    }

    @Test
    public void testeVerificarSituacaoReprovado() {
        CalculoMedia calculoMedia = new CalculoMedia();
        assertEquals("Reprovado", calculoMedia.verificarSituacao(3.0));
    }
}
