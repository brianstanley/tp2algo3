package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.Inventario;
import fiuba.algo3.tp2.juego.Jugador;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JugadorTest {
    @Test
    public void seCreaJugadorYNoEsNulo() {
        Jugador jugador = new Jugador();
        assertNotNull(jugador);
    }

    @Test
    public void jugadorEmpiezaConHachaEnInventario() {
        Jugador jugador = new Jugador();
        Inventario inventario = jugador.getInventario();
        HachaMadera hacha = new HachaMadera();
        assertTrue(inventario.tiene(hacha));
    }
}
