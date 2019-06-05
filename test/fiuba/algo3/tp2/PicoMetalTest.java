package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;

public class PicoMetalTest {

    @Test
    public void SeCreaPicoMetalExitosamente(){
        PicoMetal picoMetal = new PicoMetal();
        Assert.assertNotNull(picoMetal);
    }

    @Test
    public void SeCreaPicoMetalConDurabilidadYFuerzaCorrectas(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidadInicialPicoMetal = 400;
        int fuerzaPicoMetal = 12;
        Assert.assertEquals(picoMetal.getDurabilidad(), durabilidadInicialPicoMetal);
        Assert.assertEquals(picoMetal.getFuerza(), fuerzaPicoMetal);
    }

    @Test
    public void SeUsaPicoMetalEnUnMaterialCualquieraUnaVezYSuDurabilidadNoDecrece(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.getDurabilidad();
        MaderaMaterial unaMadera = new MaderaMaterial();
        picoMetal.romper(unaMadera);
        Assert.assertEquals(picoMetal.getDurabilidad(), durabilidad);
    }

    @Test
    public void SeUsaPicoMetalEnUnMaterialCualquieraDiezVecesYSuDurabilidadEsNula(){
        PicoMetal picoMetal = new PicoMetal();
        MaderaMaterial unaMadera = new MaderaMaterial();
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        picoMetal.romper(unaMadera);
        Assert.assertEquals(picoMetal.getDurabilidad(), 0);
    }
}