package fiuba.algo3.tp2.herramientasTest;

import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
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
        double durabilidadInicialPicoMetal = 400;
        int fuerzaPicoMetal = 12;
        Assert.assertEquals(picoMetal.getDurabilidad(), durabilidadInicialPicoMetal, 0.01);
        Assert.assertEquals(picoMetal.getFuerza(), fuerzaPicoMetal);
    }

    @Test
    public void SeUsaPicoMetalEnUnMaterialCualquieraUnaVezYSuDurabilidadNoDecrece(){
        PicoMetal picoMetal = new PicoMetal();
        double durabilidad = picoMetal.getDurabilidad();
        MaderaMaterial unaMadera = new MaderaMaterial();
        picoMetal.romper(unaMadera);
        Assert.assertEquals(picoMetal.getDurabilidad(), durabilidad, 0.01);
    }

    @Test (expected = HerramientaRotaExcepcion.class)
    public void SeUsaPicoMetalEnUnMaterialCualquieraDiezVecesYSeLanzaExcepcioin(){
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
    }
}