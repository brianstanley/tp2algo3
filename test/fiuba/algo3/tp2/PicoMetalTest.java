package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;

public class PicoMetalTest {

    @Test
    public void SeCreaPicoMetalExitosamente(){
        PicoDeMetal picoMetal = new PicoDeMetal();
        Assert.assertNotNull(picoMetal);
    }

    @Test
    public void SeCreaPicoMetalConDurabilidadYFuerzaCorrectas(){
        PicoDeMetal picoMetal = new PicoDeMetal();
        int durabilidadInicialPicoMetal = 400;
        int fuerzaPicoMetal = 12;
        Assert.assertEquals(picoMetal.getDurabilidad(), durabilidadInicialPicoMetal);
        Assert.assertEquals(picoMetal.getFuerza(), fuerzaPicoMetal);
    }

    @Test
    public void SeUsaPicoMetalEnUnMaterialCualquieraYSuDurabilidadDecreceAlDecimoGolpe(){
        PicoDeMetal picoMetal = new PicoDeMetal();
        Madera unaMadera = new Madera();
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
