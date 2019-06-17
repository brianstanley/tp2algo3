package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.Juego;
import fiuba.algo3.tp2.juego.Mapa;
import fiuba.algo3.tp2.juego.Navegador;
import fiuba.algo3.tp2.juego.Posicion;
import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

    @Test
    public void seInstanciaElJuego(){
        Juego instanciaDeJuego = new Juego();
        Assert.assertNotNull(instanciaDeJuego);
    }

    @Test
    public void seCorreElMainDelJuegoYElMapaSePopulaConMetales(){
        Juego instanciaDeJuego  = new Juego();
        instanciaDeJuego.main(null);
        MetalMaterial instanciaMetal = new MetalMaterial();
        Mapa mapaDeJuego = instanciaDeJuego.getMapa();
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                Posicion posicionDelMapa = new Posicion(i,j);
                Material materialContenido = mapaDeJuego.getContenidoCasillero(posicionDelMapa);
                Assert.assertEquals(instanciaMetal.getClass(), materialContenido.getClass());
            }
        }
    }

    @Test
    public void seCorreElMainDelJuegoYElMapaSePopulaConDiamantes(){
        Juego instanciaDeJuego  = new Juego();
        instanciaDeJuego.main(null);
        DiamanteMaterial instanciaDiamante = new DiamanteMaterial();
        Mapa mapaDeJuego = instanciaDeJuego.getMapa();
        for (int i = 1; i < 3; i++) {
            for (int j = 5; j < 7; j++) {
                Posicion posicionDelMapa = new Posicion(i,j);
                Material materialContenido = mapaDeJuego.getContenidoCasillero(posicionDelMapa);
                Assert.assertEquals(instanciaDiamante.getClass(), materialContenido.getClass());
            }
        }
    }

    @Test
    public void seCorreElMainDelJuegoYElMapaSePopulaConMadera(){
        Juego instanciaDeJuego  = new Juego();
        instanciaDeJuego.main(null);
        MaderaMaterial instanciaMadera = new MaderaMaterial();
        Mapa mapaDeJuego = instanciaDeJuego.getMapa();
        for (int i = 4; i < 8; i++) {
            for (int j = 1; j < 5; j++) {
                Posicion posicionDelMapa = new Posicion(i,j);
                Material materialContenido = mapaDeJuego.getContenidoCasillero(posicionDelMapa);
                Assert.assertEquals(instanciaMadera.getClass(), materialContenido.getClass());
            }
        }
    }

    @Test
    public void elNavegadorSeInicializaEnUnCasilleroDondeNoHayMateriales(){
        Juego instanciaDeJuego = new Juego();
        instanciaDeJuego.main(null);
        Navegador navegadorDelJuegador = instanciaDeJuego.getNavegador();
        Posicion posicionNavegadorJugador = navegadorDelJuegador.getPosicionActual();
        Mapa mapaDeJuego = instanciaDeJuego.getMapa();
        Assert.assertNull(mapaDeJuego.getContenidoCasillero(posicionNavegadorJugador));
    }

}