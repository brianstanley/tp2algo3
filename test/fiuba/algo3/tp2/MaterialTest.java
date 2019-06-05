package fiuba.algo3.tp2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaterialTest {
    @Test
    public void MaderaEsGolpeadaPorHachaDeMaderaYSeReduceSuDurabildiad() {
        MaderaMaterial unaMadera = new MaderaMaterial();
        HachaDeMadera unHacha = new HachaDeMadera();
        unHacha.romper(unaMadera);
        assertEquals(8, unaMadera.durabilidad);
        unHacha.romper(unaMadera);
        assertEquals(6, unaMadera.durabilidad);
        unHacha.romper(unaMadera);
        assertEquals(4, unaMadera.durabilidad);
    }

    @Test
    public void PiedraEsGolpeadaPorUnHachaYNoSeReduceSuDurabildiad() {
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.durabilidad;
        HachaDeMadera unHachaDeMadera = new HachaDeMadera();
        HachaDeMetal unHachaDeMetal = new HachaDeMetal();
        HachaDePiedra unHachaDePiedra = new HachaDePiedra();

        unHachaDeMadera.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.durabilidad);

        unHachaDeMetal.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.durabilidad);

        unHachaDePiedra.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.durabilidad);
    }
}
