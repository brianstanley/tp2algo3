package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.Inventario;
import fiuba.algo3.tp2.juego.Jugador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JugadorTest {
    @Test
    public void seCreaJugadorYNoEsNulo() {
        Jugador jugador = new Jugador();
        assertNotNull(jugador);
    }

    @Test
    public void jugadorTieneInventarioVacio() {
        Jugador jugador = new Jugador();
        Inventario inventario = jugador.getInventario();
        assertEquals(0, inventario.cantidadItems());
    }
}
