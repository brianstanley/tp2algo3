package fiuba.algo3.tp2.juegoTest.JugadorTests;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class JugadorCreacionTest {

    public Jugador crearJugadorParaTest(){

        Mapa mapaDelJuego = new Mapa(20, 20);
        Navegador navegadorDelJugador = new Navegador(2,2, mapaDelJuego);

        return new Jugador(navegadorDelJugador);
    }

    @Test
    public void jugadorCreaUnaHerramienntaYLaGuardaEnSuInventario(){

        Jugador jugador = crearJugadorParaTest();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        plano.insertarMaterialEnPosicion(new MaderaMaterial(),0,0);
        plano.insertarMaterialEnPosicion(new MaderaMaterial(),0,1);
        plano.insertarMaterialEnPosicion(new MaderaMaterial(),1,0);
        plano.insertarMaterialEnPosicion(new MaderaMaterial(),1,1);
        plano.insertarMaterialEnPosicion(new MaderaMaterial(),2,1);

        jugador.crearHerramientaNueva(plano);

        Assert.assertTrue(jugador.getInventario().tiene(new HachaMadera()));
    }

}
