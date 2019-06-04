package fiuba.algo3.tp2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PicoMaderaTest {

    @Test
    public void SeCreaPicoMaderaExitosamente(){
        PicoDeMadera picoMadera = new PicoDeMadera();
        Assert.assertNotNull(picoMadera);
    }

    @Test
    public void SeCreaPicoMaderaConDurabilidadYFuerzaCorrectas(){
        PicoDeMadera picoMadera = new PicoDeMadera();
        int durabilidadInicialPicoMadera = 100;
        int fuerzaPicoMadera = 2;
        Assert.assertEquals(picoMadera.getDurabilidad(), durabilidadInicialPicoMadera);
        Assert.assertEquals(picoMadera.getFuerza(), fuerzaPicoMadera);
    }

    @Test
    public void SeUsaPicoMaderaEnUnMaterialCualquieraYSuDurabilidadDecreceLinealmente(){
        PicoDeMadera picoMadera = new PicoDeMadera();
        Madera unaMadera = new Madera();
        int durabilidadInicial = picoMadera.getDurabilidad();
        picoMadera.romper(unaMadera);
        Assert.assertEquals(picoMadera.getDurabilidad(), durabilidadInicial - 2);
    }
}
