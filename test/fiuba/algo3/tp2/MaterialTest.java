package fiuba.algo3.tp2;

import fiuba.algo3.tp2.herramientas.HachaDeMadera;
import fiuba.algo3.tp2.herramientas.HachaDeMetal;
import fiuba.algo3.tp2.herramientas.HachaDePiedra;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaterialTest {
    @Test
    public void MaderaEsGolpeadaPorHachaDeMaderaYSeReduceSuDurabildiad() {
        MaderaMaterial unaMadera = new MaderaMaterial();
        HachaDeMadera unHacha = new HachaDeMadera();
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
        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        HachaDePiedra unHachaDePiedra = new HachaDePiedra();

        unHachaDeMadera.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());

        unHachaDeMetal.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());

        unHachaDePiedra.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
    }
}
