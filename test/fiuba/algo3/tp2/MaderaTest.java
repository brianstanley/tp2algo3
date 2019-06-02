package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;

public class MaderaTest {

    @Test
    public void SeCreaInstanciaDeMaterialMadera(){
        Madera instanciaMadera = new Madera();
        Assert.assertNotNull(instanciaMadera);
    }

    @Test
    public void InstanciaDeMaderaTieneUnaDurabilidadInicialDeDiez(){
        Madera instanciaMadera = new Madera();
        Assert.assertEquals(instanciaMadera.durabilidad(), 10);
    }

    public void setUp() {
        HachaMadera teast = mock(HachaMadera.class);
    }

    @Test
    public void SeUsaHachaDeMaderaEnInstanciaDeMaderaYSuDurabilidadDecreceEnDosPuntos(){
        Madera instanciaMadera = new Madera();
        HachaMadera hachaMadera = new HachaMadera();
        int durabilidad = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(hachaMadera);
        Assert.assertEquals(durabilidad, durabilidad - 2);
    }
}
