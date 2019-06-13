package fiuba.algo3.tp2.juegoTest.MapaConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import org.junit.Assert;
import org.junit.Test;

public class FiguraTest {

    @Test
    public void figuraDeMaderaEstaFormadaPorCincoMaderas(){

        FiguraDeMadera hacha = new FiguraHachaMadera();

        Assert.assertEquals(5, hacha.getCantidadMadera());
        Assert.assertEquals(0, hacha.getCantidadPiedra());
        Assert.assertEquals(0, hacha.getCantidadMetal());
    }
    @Test
    public void figuraDePiedraEstaFormadaPorDosMaderasYTresPiedras(){

        FiguraDePiedra pico = new FiguraPicoPiedra();

        Assert.assertEquals(2, pico.getCantidadMadera());
        Assert.assertEquals(3, pico.getCantidadPiedra());
        Assert.assertEquals(0, pico.getCantidadMetal());
    }
    @Test
    public void figuraDeMetalEstaFormadaPorDosMaderasYTresMetales(){

        FiguraDeMetal hacha = new FiguraHachaMetal();

        Assert.assertEquals(2, hacha.getCantidadMadera());
        Assert.assertEquals(0, hacha.getCantidadPiedra());
        Assert.assertEquals(3, hacha.getCantidadMetal());
    }
    @Test
    public void figuraDePicoFinoEstaFormadaPorDosMaderasUnaPiedraYTresMetales(){

        FiguraPicoFino picoFino = new FiguraPicoFino();

        Assert.assertEquals(2, picoFino.getCantidadMadera());
        Assert.assertEquals(1, picoFino.getCantidadPiedra());
        Assert.assertEquals(3, picoFino.getCantidadMetal());
    }

}
