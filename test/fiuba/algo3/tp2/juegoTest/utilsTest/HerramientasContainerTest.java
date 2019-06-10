package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.juego.utils.HerramientasContainer;
import org.junit.Assert;
import org.junit.Test;

public class HerramientasContainerTest {
    @Test
    public void seAgrega3IHerramientasAColleccion() {
        HerramientasContainer herramientasContainer = new HerramientasContainer();
        PicoFino picoFino = new PicoFino();
        PicoMadera picoMadera = new PicoMadera();
        HachaMadera hachaMadera = new HachaMadera();

        herramientasContainer.agregar(picoFino);
        herramientasContainer.agregar(picoMadera);
        herramientasContainer.agregar(hachaMadera);

        Assert.assertEquals(3, herramientasContainer.cantidad());
    }

    @Test
    public void seAgrega2VecesLaMismaHerramientaPeroSoloSeAgregaUna() {
        HerramientasContainer herramientasContainer = new HerramientasContainer();
        PicoFino picoFino = new PicoFino();
        PicoMadera picoMadera = new PicoMadera();

        herramientasContainer.agregar(picoFino);
        herramientasContainer.agregar(picoMadera);
        herramientasContainer.agregar(picoFino);

        Assert.assertEquals(2, herramientasContainer.cantidad());
    }

    @Test
    public void seAgrega3HerramientasDistintasYTieneLas3EnLaCollecion() {
        HerramientasContainer herramientasContainer = new HerramientasContainer();
        PicoFino picoFino = new PicoFino();
        PicoMadera picoMadera = new PicoMadera();
        HachaPiedra hacha = new HachaPiedra();

        herramientasContainer.agregar(picoFino);
        herramientasContainer.agregar(picoMadera);
        herramientasContainer.agregar(hacha);

        Assert.assertTrue(herramientasContainer.tieneHerramienta(picoFino));
        Assert.assertTrue(herramientasContainer.tieneHerramienta(hacha));
        Assert.assertTrue(herramientasContainer.tieneHerramienta(picoMadera));
    }
}
