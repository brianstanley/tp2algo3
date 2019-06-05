package fiuba.algo3.tp2;

import fiuba.algo3.tp2.herramientas.PicoPiedra;
import org.junit.Assert;
import org.junit.Test;

public class PicoPiedraTest {

    @Test
    public void SeCreaPicoPiedraExitosamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        Assert.assertNotNull(picoPiedra);
    }

    @Test
    public void SeCreaPicoPiedraConDurabilidadYFuerzaCorrectas(){
        PicoPiedra picoPiedra = new PicoPiedra();
        int durabilidadInicialPicoPiedra = 200;
        int fuerzaPicoPiedra = 4;
        Assert.assertEquals(picoPiedra.getDurabilidad(), durabilidadInicialPicoPiedra);
        Assert.assertEquals(picoPiedra.getFuerza(), fuerzaPicoPiedra);
    }

    @Test
    public void SeUsaPicoPiedraEnUnMaterialCualquieraYSuDurabilidadDecreceConFactorDivisor(){
        PicoPiedra picoPiedra = new PicoPiedra();
        MaderaMaterial unaMadera = new MaderaMaterial();
        float durabilidadInicial = picoPiedra.getDurabilidad();
        double durabilidadReducidaPorUso = 4/1.5;
        picoPiedra.romper(unaMadera);
        Assert.assertEquals(picoPiedra.getDurabilidad(), durabilidadInicial - durabilidadReducidaPorUso, 000.4);
    }

}