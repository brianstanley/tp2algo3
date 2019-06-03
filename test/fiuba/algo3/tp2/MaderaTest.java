package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;

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


}
