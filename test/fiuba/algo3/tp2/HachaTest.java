package fiuba.algo3.tp2;
import static org.junit.Assert.*;
import org.junit.Test;

public class HachaTest {
    @Test
    public void SeCreaHachaDeMaderaYNoEsNulo() {
        HachaDeMadera hacha = new HachaDeMadera();
        assertNotNull(hacha);
    }

    @Test
    public void hachaDeMaderaTieneDurabilidad100yFuerza2() {
        HachaDeMadera hacha = new HachaDeMadera();
        assertEquals(100, hacha.getDurabilidad());
        assertEquals(2, hacha.getFuerza());
    }

    @Test
    public void hachaMaderaSeUsaContraMaderaYReduceSuDurabilidadLinealmente() {
        HachaDeMadera hacha = new HachaDeMadera();
        Madera unaMadera = new Madera();
        hacha.romper(unaMadera);
        assertEquals(98, hacha.getDurabilidad());
    }

    @Test
    public void hachaDePiedraSeUsaContraMaderaYReduceSuDurabilidadLinealmente() {
        HachaDePiedra hacha = new HachaDePiedra();
        Madera unaMadera = new Madera();
        hacha.romper(unaMadera);
        assertEquals(195, hacha.getDurabilidad());
    }

    @Test
    public void hachaDeMetalSeUsaContraMaderaYReduceSuDurabilidadEnLaMitadDeLaFuerza() {
        HachaDeMetal hacha = new HachaDeMetal();
        Madera unaMadera = new Madera();
        hacha.romper(unaMadera);
        assertEquals(395, hacha.getDurabilidad());
    }
}
