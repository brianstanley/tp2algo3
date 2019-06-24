package fiuba.algo3.tp2.juegoTest.JugadorTests;

import ch.qos.logback.classic.jul.JULHelper;
import fiuba.algo3.tp2.herramientas.hachas.Hacha;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.herramientas.picos.Pico;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.juego.*;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
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
    public void jugadorEmpiezaConInventarioVacio() {
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        Inventario inventario = jugador.getInventario();
        assertEquals(0, inventario.getCantidadItems());
    }

    @Test
    public void jugadorEmpiezaConHachaEnLaMano() {
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        assertTrue(jugador.getHerramientaActual() instanceof HachaMadera);
    }

    @Test
    public void jugadorRompeMaterialDeCasilleroDeEnFrenteQueEstaAlSur() {
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        Posicion posicion = new Posicion(2, 3);
        MaderaMaterial madera = new MaderaMaterial();
        madera.ponerEnMapa(mapaDelJuego, posicion);
        jugador.moverSur(); //cambia la direccion del jugador mirando al material

        ElementoDeCampo material = navegadorDelJugador.obtenerElementoEnFrente();
        Assert.assertEquals(madera, material);

        jugador.romper();
        assertEquals(8, madera.getDurabilidad());

    }

    @Test
    public void elJugadorEquipaHerramientasDelInventario(){
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);

        HachaPiedra hachaP = new HachaPiedra();
        PicoFino picoF = new PicoFino();
        HachaMadera hachaM = new HachaMadera();
        HachaMetal hachaMet = new HachaMetal();

        jugador.agregarAlInventario(hachaP);
        jugador.agregarAlInventario(picoF);

        Assert.assertEquals(HachaMadera.class, jugador.getHerramientaActual().getClass());

        jugador.equiparHerramienta(picoF);
        Assert.assertEquals(PicoFino.class, jugador.getHerramientaActual().getClass());

        jugador.equiparHerramienta(hachaP);
        Assert.assertEquals(HachaPiedra.class, jugador.getHerramientaActual().getClass());

        jugador.equiparHerramienta(hachaM);
        Assert.assertEquals(HachaMadera.class, jugador.getHerramientaActual().getClass());

        jugador.equiparHerramienta(hachaMet);
        Assert.assertEquals(HachaMadera.class, jugador.getHerramientaActual().getClass());
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

    @Test
    public void jugadorRompeMaterialYPasaASuInventarioYElCasilleroSeVacia(){
        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);
        Jugador jugador = new Jugador(navegadorDelJugador);
        Posicion posicion = new Posicion(2, 1);
        MaderaMaterial madera = new MaderaMaterial();
        madera.ponerEnMapa(mapaDelJuego, posicion);

        jugador.romper();
        jugador.romper();
        jugador.romper();
        jugador.romper();
        jugador.romper();

        Assert.assertTrue(jugador.getInventario().tiene(madera));

        Assert.assertNull(mapaDelJuego.getContenidoCasillero(posicion));
    }
}
