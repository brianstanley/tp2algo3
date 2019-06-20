package fiuba.algo3.tp2.juegoTest.JugadorTests;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.juego.*;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void jugadorAgregaElementosASuInventario(){
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);

        Jugador jugador = new Jugador(navegadorDelJugador);

        MaderaMaterial madera = new MaderaMaterial();
        PicoFino picoFino = new PicoFino();

        jugador.agregarAlInventario(madera);
        jugador.agregarAlInventario(picoFino);

        Inventario inventarioJugador = jugador.getInventario();

        Assert.assertTrue(inventarioJugador.tiene(madera));
        Assert.assertTrue(inventarioJugador.tiene(picoFino));
    }
}
