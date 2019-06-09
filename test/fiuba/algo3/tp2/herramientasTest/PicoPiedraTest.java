package fiuba.algo3.tp2.herramientasTest;

import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
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
        Assert.assertEquals(picoPiedra.getDurabilidad(), durabilidadInicialPicoPiedra, 0.01);
        Assert.assertEquals(picoPiedra.getFuerza(), fuerzaPicoPiedra, 0.01);
    }

    @Test
    public void SeUsaPicoPiedraEnUnMaterialCualquieraYSuDurabilidadDecreceConFactorDivisor(){
        PicoPiedra picoPiedra = new PicoPiedra();
        MaderaMaterial unaMadera = new MaderaMaterial();
        double durabilidadInicial = picoPiedra.getDurabilidad();
        double durabilidadReducidaPorUso = 4/1.5;
        picoPiedra.romper(unaMadera);
        Assert.assertEquals(picoPiedra.getDurabilidad(), durabilidadInicial - durabilidadReducidaPorUso, 000.4);
    }

}