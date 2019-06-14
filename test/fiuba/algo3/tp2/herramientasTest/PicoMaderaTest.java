package fiuba.algo3.tp2.herramientasTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import org.junit.Assert;
import org.junit.Test;

public class PicoMaderaTest {
    public void usarHerramientaNVeces(int veces, Herramienta herramienta, Material material){
        for(int i=0; i<veces; i++){
            herramienta.romper(material);
        }
    }

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
        Assert.assertEquals(picoMadera.getDurabilidad(), durabilidadInicialPicoMadera, 0.01);
        Assert.assertEquals(picoMadera.getFuerza(), fuerzaPicoMadera);
    }

    @Test
    public void SeUsaPicoMaderaEnUnMaterialCualquieraYSuDurabilidadDecreceLinealmente(){
        PicoMadera picoMadera = new PicoMadera();
        MaderaMaterial unaMadera = new MaderaMaterial();
        double durabilidadInicial = picoMadera.getDurabilidad();
        picoMadera.romper(unaMadera);
        Assert.assertEquals(durabilidadInicial - 2, picoMadera.getDurabilidad(), 0.01);
    }

    @Test (expected = HerramientaRotaExcepcion.class)
    public void seUsaPicoMaderaHastaRomperseYSeLanzaExcepcion(){
        PicoMadera pico = new PicoMadera();
        MaderaMaterial unaMadera = new MaderaMaterial();
        usarHerramientaNVeces(50,pico,unaMadera);
    }
}
