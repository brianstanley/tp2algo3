package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.Inventario;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JugadorTest {
    @Test
    public void seCreaJugadorYNoEsNulo() {
        Mapa mapaDelJuego = new Mapa();
        Jugador jugador = new Jugador(mapaDelJuego);
        assertNotNull(jugador);
    }

    @Test
    public void jugadorEmpiezaConHachaEnInventario() {
        Mapa mapaDelJuego = new Mapa();
        Jugador jugador = new Jugador(mapaDelJuego);
        Inventario inventario = jugador.getInventario();
        HachaMadera hacha = new HachaMadera();
        assertTrue(inventario.tiene(hacha));
    }
}
