package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.Herrero;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import org.junit.Assert;
import org.junit.Test;

public class HerreroTest {

    @Test
    public void herreroSeIniciaYNoEsNulo(){

        Herrero herrero = new Herrero();

        Assert.assertNotNull(herrero);
    }

    @Test
    public void herreroRecibeUnaFiguraDeHachaDeMaderaYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraHachaMadera figura = new FiguraHachaMadera();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof HachaMadera);
    }
    @Test
    public void herreroRecibeUnaFiguraDeHachaDePiedraYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraHachaPiedra figura = new FiguraHachaPiedra();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof HachaPiedra);
    }
    @Test
    public void herreroRecibeUnaFiguraDeHachaDeMetalYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraHachaMetal figura = new FiguraHachaMetal();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof HachaMetal);
    }
    @Test
    public void herreroRecibeUnaFiguraDePicoDeMaderaYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraPicoMadera figura = new FiguraPicoMadera();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof PicoMadera);
    }
    @Test
    public void herreroRecibeUnaFiguraDePicoDePiedraYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraPicoPiedra figura = new FiguraPicoPiedra();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof PicoPiedra);
    }
    @Test
    public void herreroRecibeUnaFiguraDePicoDeMetalYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraPicoMetal figura = new FiguraPicoMetal();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof PicoMetal);
    }

    @Test
    public void herreroRecibeUnaFiguraDePicoFinoYConstruyelaHerramienta(){

        Herrero herrero = new Herrero();
        FiguraPicoFino figura = new FiguraPicoFino();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertTrue(herramientaCreada instanceof PicoFino);
    }

    @Test
    public void herreroRecibeUnaFiguraDesconocidaYNoConstruyeHerramienta(){

        Herrero herrero = new Herrero();
        FiguraDesconocida figura = new FiguraDesconocida();
        Herramienta herramientaCreada = herrero.construirHerramienta(figura);

        Assert.assertNull(herramientaCreada);
    }
}
