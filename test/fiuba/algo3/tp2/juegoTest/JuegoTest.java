package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.*;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

    @Test
    public void seInstanciaElJuego(){
        Mapa mapa = new Mapa(20, 20);
        Navegador navegador = new Navegador(8, 8, mapa);
        Jugador jugador = new Jugador(navegador);
        Juego instanciaDeJuego = new Juego(mapa, navegador, jugador);
        Assert.assertNotNull(instanciaDeJuego);
    }
}
