package fiuba.algo3.tp2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PicoPiedraTest {

    @Test
    public void SeCreaPicoPiedraExitosamente(){
        PicoDePiedra picoPiedra = new PicoDePiedra();
        Assert.assertNotNull(picoPiedra);
    }

    @Test
    public void SeCreaPicoPiedraConDurabilidadYFuerzaCorrectas(){
        PicoDePiedra picoPiedra = new PicoDePiedra();
        int durabilidadInicialPicoPiedra = 200;
        int fuerzaPicoPiedra = 4;
        Assert.assertEquals(picoPiedra.getDurabilidad(), durabilidadInicialPicoPiedra);
        Assert.assertEquals(picoPiedra.getFuerza(), fuerzaPicoPiedra);
    }

    @Test
    public void SeUsaPicoPiedraEnUnMaterialCualquieraYSuDurabilidadDecreceConFactorDivisor(){
        PicoDePiedra picoPiedra = new PicoDePiedra();
        Madera unaMadera = new Madera();
        float durabilidadInicial = picoPiedra.getDurabilidad();
        double durabilidadReducidaPorUso = 4/1.5;
        picoPiedra.romper(unaMadera);
        Assert.assertEquals(picoPiedra.getDurabilidad(), durabilidadInicial - durabilidadReducidaPorUso, 000.4);
    }

}
