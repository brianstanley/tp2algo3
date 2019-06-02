package fiuba.algo3.tp2;

import junit.framework.Assert;
import org.junit.Test;



public class PicoMaderaTest {

    @Test
    public void picoMaderaIniciaConCienDeDurabilidadTest(){

        PicoMadera picoMadera = new PicoMadera();

        Assert.assertEquals(100, picoMadera.durabilidad());
    }
}
