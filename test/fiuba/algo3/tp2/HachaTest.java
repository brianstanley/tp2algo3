package fiuba.algo3.tp2;
import static org.junit.Assert.*;

import fiuba.algo3.tp2.herramientas.HachaDeMadera;
import fiuba.algo3.tp2.herramientas.HachaDeMetal;
import fiuba.algo3.tp2.herramientas.HachaDePiedra;
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
    public void hachaMaderaSeUsaContraCadaUnoDeLosMaterialesYSeReduceSuDurabilidadLinealmenteDependiendoDeLaFuerza() {
        HachaDeMadera hacha = new HachaDeMadera();
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
        HachaDePiedra hacha = new HachaDePiedra();
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
        HachaDeMetal hacha = new HachaDeMetal();
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
