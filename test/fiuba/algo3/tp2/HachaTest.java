package fiuba.algo3.tp2;
import static org.junit.Assert.*;

import fiuba.algo3.tp2.herramientas.HachaMadera;
import fiuba.algo3.tp2.herramientas.HachaMetal;
import fiuba.algo3.tp2.herramientas.HachaPiedra;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import org.junit.Test;

public class HachaTest {
    @Test
    public void SeCreaHachaDeMaderaYNoEsNulo() {
        HachaMadera hacha = new HachaMadera();
        assertNotNull(hacha);
    }

    @Test
    public void hachaDeMaderaTieneDurabilidad100yFuerza2() {
        HachaMadera hacha = new HachaMadera();
        assertEquals(100, hacha.getDurabilidad());
        assertEquals(2, hacha.getFuerza());
    }

    @Test
    public void hachaMaderaSeUsaContraMaderaYReduceSuDurabilidadLinealmente() {
        HachaMadera hacha = new HachaMadera();
        MaderaMaterial unaMadera = new MaderaMaterial();
        hacha.romper(unaMadera);
        assertEquals(98, hacha.getDurabilidad());
    }

    @Test
    public void hachaDePiedraSeUsaContraMaderaYReduceSuDurabilidadLinealmente() {
        HachaPiedra hacha = new HachaPiedra();
        MaderaMaterial unaMadera = new MaderaMaterial();
        hacha.romper(unaMadera);
        assertEquals(195, hacha.getDurabilidad());
    }

    @Test
    public void hachaDeMetalSeUsaContraMaderaYReduceSuDurabilidadEnLaMitadDeLaFuerza() {
        HachaMetal hacha = new HachaMetal();
        MaderaMaterial unaMadera = new MaderaMaterial();
        hacha.romper(unaMadera);
        assertEquals(395, hacha.getDurabilidad());
    }
}
