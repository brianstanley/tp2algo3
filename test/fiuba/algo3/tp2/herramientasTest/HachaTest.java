package fiuba.algo3.tp2.herramientasTest;
import static org.junit.Assert.*;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.materiales.*;
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
    public void hachaMaderaSeUsaContraCadaUnoDeLosMaterialesYSeReduceSuDurabilidadLinealmenteDependiendoDeLaFuerza() {
        HachaMadera hacha = new HachaMadera();
        MaderaMaterial unaMadera = new MaderaMaterial();
        PiedraMaterial unaPiedra = new PiedraMaterial();
        MetalMaterial unMetal = new MetalMaterial();
        hacha.romper(unaMadera);
        assertEquals(98, hacha.getDurabilidad());
        hacha.romper(unaPiedra);
        assertEquals(96, hacha.getDurabilidad());
        hacha.romper(unMetal);
        assertEquals(94, hacha.getDurabilidad());
    }

    @Test
    public void hachaDePiedraSeUsaContraCadaUnoDeLosMaterialesYReduceSuDurabilidadLinealmenteDependiendoDeLaFuerza() {
        HachaPiedra hacha = new HachaPiedra();
        MaderaMaterial unaMadera = new MaderaMaterial();
        PiedraMaterial unaPiedra = new PiedraMaterial();
        MetalMaterial unMetal = new MetalMaterial();

        hacha.romper(unaMadera);
        assertEquals(195, hacha.getDurabilidad());

        hacha.romper(unaPiedra);
        assertEquals(190, hacha.getDurabilidad());

        hacha.romper(unMetal);
        assertEquals(185, hacha.getDurabilidad());
    }

    @Test
    public void hachaDeMetalSeUsaContraCadaUnoDeLosMaterialesYReduceSuDurabilidadEnLaMitadDeLaFuerza() {
        HachaMetal hacha = new HachaMetal();
        MaderaMaterial unaMadera = new MaderaMaterial();
        PiedraMaterial unaPiedra = new PiedraMaterial();
        MetalMaterial unMetal = new MetalMaterial();

        hacha.romper(unaMadera);
        assertEquals(395, hacha.getDurabilidad());

        hacha.romper(unaPiedra);

        assertEquals(390, hacha.getDurabilidad());

        hacha.romper(unMetal);
        assertEquals(385, hacha.getDurabilidad());

    }
}
