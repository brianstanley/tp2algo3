package fiuba.algo3.tp2;

import fiuba.algo3.tp2.herramientas.PicoMadera;
import org.junit.Assert;
import org.junit.Test;

public class PicoMaderaTest {
    @Test
    public void SeCreaPicoMaderaExitosamente(){
        PicoMadera picoMadera = new PicoMadera();
        Assert.assertNotNull(picoMadera);
    }

    @Test
    public void SeCreaPicoMaderaConDurabilidadYFuerzaCorrectas(){
        PicoMadera picoMadera = new PicoMadera();
        int durabilidadInicialPicoMadera = 100;
        int fuerzaPicoMadera = 2;
        Assert.assertEquals(picoMadera.getDurabilidad(), durabilidadInicialPicoMadera);
        Assert.assertEquals(picoMadera.getFuerza(), fuerzaPicoMadera);
    }

    @Test
    public void SeUsaPicoMaderaEnUnMaterialCualquieraYSuDurabilidadDecreceLinealmente(){
        PicoMadera picoMadera = new PicoMadera();
        MaderaMaterial unaMadera = new MaderaMaterial();
        int durabilidadInicial = picoMadera.getDurabilidad();
        picoMadera.romper(unaMadera);
        Assert.assertEquals(durabilidadInicial - 2, picoMadera.getDurabilidad());
    }
}
