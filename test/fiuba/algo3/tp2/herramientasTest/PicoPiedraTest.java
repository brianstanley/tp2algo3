package fiuba.algo3.tp2.herramientasTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import org.junit.Assert;
import org.junit.Test;

public class PicoPiedraTest {

    public void usarHerramientaNVeces(int veces, Herramienta herramienta, Material material) {
        for (int i = 0; i < veces; i++) {
            herramienta.romper(material);
        }
    }

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

    @Test (expected = HerramientaRotaExcepcion.class)
    public void SeUsaPicoPiedraHastaAgotarSuDurabilidadYSelanzaExcepcion(){
        PicoPiedra pico = new PicoPiedra();
        MaderaMaterial material = new MaderaMaterial();
        usarHerramientaNVeces(80, pico,material);
    }

}