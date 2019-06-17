package fiuba.algo3.tp2.juegoTest.MapaConstruccionHerramientaTest;

import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import org.junit.Assert;
import org.junit.Test;

public class FiguraTest {

    @Test
    public void figuraDesconocidaNoConstruyeNada(){

        FiguraDesconocida firgura = new FiguraDesconocida();

        Assert.assertNull(firgura.construir());
    }

    @Test
    public void figuraHachaMaderaConstruyeUnHachaDeMadera(){

        FiguraHachaMadera figuraHachaMadera = new FiguraHachaMadera();

        Assert.assertTrue(figuraHachaMadera.construir() instanceof HachaMadera);
    }

    @Test
    public void figuraHachaPiedraConstruyeUnHachaDePiedra(){

        FiguraHachaPiedra figuraHachaPiedra = new FiguraHachaPiedra();

        Assert.assertTrue(figuraHachaPiedra.construir() instanceof HachaPiedra);
    }

    @Test
    public void figuraHachaMetalConstruyeUnHachaDeMetal(){

        FiguraHachaMetal figuraHachaMetal = new FiguraHachaMetal();

        Assert.assertTrue(figuraHachaMetal.construir() instanceof HachaMetal);
    }

    @Test
    public void figuraPicoMaderaConstruyeUnPicoDeMadera(){

        FiguraPicoMadera  figuraPicoMadera = new FiguraPicoMadera();

        Assert.assertTrue(figuraPicoMadera.construir() instanceof PicoMadera);
    }

    @Test
    public void figuraPicoPiedraConstruyeUnPicoDePiedra(){

        FiguraPicoPiedra figuraPicoPiedra = new FiguraPicoPiedra();

        Assert.assertTrue(figuraPicoPiedra.construir() instanceof PicoPiedra);
    }

    @Test
    public void figuraPicoMetalConstruyeUnPicoDeMetal(){

        FiguraPicoMetal figuraPicoMetal = new FiguraPicoMetal();

        Assert.assertTrue(figuraPicoMetal.construir() instanceof PicoMetal);
    }

    @Test
    public void figuraPicoFinoConstruyeUnPicoFino(){

        FiguraPicoFino figuraPicoFino = new FiguraPicoFino();

        Assert.assertTrue(figuraPicoFino.construir() instanceof PicoFino);
    }



}






