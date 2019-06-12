package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JugadorTest {
    @Test
    public void seCreaJugadorYNoEsNulo() {
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        assertNotNull(jugador);
    }

    @Test
    public void seColocaElJugador() {
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        Posicion posicionInicial = new Posicion(2,2);
        Assert.assertEquals(posicionInicial.getX(), jugador.getNavegador().getPosicionActual().getX());
        Assert.assertEquals(posicionInicial.getY(), jugador.getNavegador().getPosicionActual().getY());
    }

    @Test
    public void jugadorEmpiezaConHachaEnInventario() {
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        Inventario inventario = jugador.getInventario();
        HachaMadera hacha = new HachaMadera();
        assertTrue(inventario.tiene(hacha));
    }
}
