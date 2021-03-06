package fiuba.algo3.tp2.herramientasTest;
import static org.junit.Assert.*;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Test;

public class HachaTest {

    public void usarHerramientaNVeces(int veces, Herramienta herramienta, Material material){
        for (int i=0; i<veces; i++){
            herramienta.romper(material);
        }
    }
    @Test
    public void SeCreaHachaDeMaderaYNoEsNulo() {
        HachaMadera hacha = new HachaMadera();
        assertNotNull(hacha);
    }

    @Test
    public void hachaDeMaderaTieneDurabilidad100yFuerza2() {
        HachaMadera hacha = new HachaMadera();
        assertEquals(100, hacha.getDurabilidad(), 0.01);
        assertEquals(2, hacha.getFuerza(), 0.01);
    }

    @Test
    public void hachaMaderaSeUsaContraCadaUnoDeLosMaterialesYSeReduceSuDurabilidadLinealmenteDependiendoDeLaFuerza() {
        HachaMadera hacha = new HachaMadera();
        MaderaMaterial unaMadera = new MaderaMaterial();
        PiedraMaterial unaPiedra = new PiedraMaterial();
        MetalMaterial unMetal = new MetalMaterial();
            hacha.romper(unaMadera);
            assertEquals(98, hacha.getDurabilidad(), 0.01);
            hacha.romper(unaPiedra);
            assertEquals(96, hacha.getDurabilidad(), 0.01);
            hacha.romper(unMetal);
            assertEquals(94, hacha.getDurabilidad(), 0.01);
    }

    @Test
    public void hachaDePiedraSeUsaContraCadaUnoDeLosMaterialesYReduceSuDurabilidadLinealmenteDependiendoDeLaFuerza() {
        HachaPiedra hacha = new HachaPiedra();
        MaderaMaterial unaMadera = new MaderaMaterial();
        PiedraMaterial unaPiedra = new PiedraMaterial();
        MetalMaterial unMetal = new MetalMaterial();
            hacha.romper(unaMadera);
            assertEquals(195, hacha.getDurabilidad(), 0.01);
            hacha.romper(unaPiedra);
            assertEquals(190, hacha.getDurabilidad(), 0.01);
            hacha.romper(unMetal);
            assertEquals(185, hacha.getDurabilidad(), 0.01);
    }

    @Test
    public void hachaDeMetalSeUsaContraCadaUnoDeLosMaterialesYReduceSuDurabilidadEnLaMitadDeLaFuerza() {
        HachaMetal hacha = new HachaMetal();
        PiedraMaterial unaPiedra = new PiedraMaterial();
        MetalMaterial unMetal = new MetalMaterial();
            hacha.romper(unaPiedra);
            assertEquals(395, hacha.getDurabilidad(), 0.01);
            hacha.romper(unMetal);
            assertEquals(390, hacha.getDurabilidad(), 0.01);
    }

}
