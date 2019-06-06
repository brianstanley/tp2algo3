package fiuba.algo3.tp2.materialesTest;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaterialTest {
    @Test
    public void MaderaEsGolpeadaPorHachaDeMaderaYSeReduceSuDurabildiad() {
        MaderaMaterial unaMadera = new MaderaMaterial();
        HachaMadera unHacha = new HachaMadera();
        unHacha.romper(unaMadera);
        assertEquals(8, unaMadera.getDurabilidad());
        unHacha.romper(unaMadera);
        assertEquals(6, unaMadera.getDurabilidad());
        unHacha.romper(unaMadera);
        assertEquals(4, unaMadera.getDurabilidad());
    }

    @Test
    public void PiedraEsGolpeadaPorUnHachaYNoSeReduceSuDurabildiad() {
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        HachaMadera unHachaMadera = new HachaMadera();
        HachaMetal unHachaMetal = new HachaMetal();
        HachaPiedra unHachaPiedra = new HachaPiedra();

        unHachaMadera.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());

        unHachaMetal.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());

        unHachaPiedra.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
    }

    @Test
    public void MetalEsGolpeadoPorUnPicoDeMaderaYNoSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoMadera unPicoDeMadera = new PicoMadera();

        unPicoDeMadera.romper(unMetal);
        assertEquals(durabilidadInicial, unMetal.getDurabilidad());

    }
}
