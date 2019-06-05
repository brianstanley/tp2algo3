package fiuba.algo3.tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;

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
