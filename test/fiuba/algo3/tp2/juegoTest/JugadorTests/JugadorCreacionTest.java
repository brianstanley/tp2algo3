package fiuba.algo3.tp2.juegoTest.JugadorTests;

import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.Inventario;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
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
    public void jugadorCreaUnaHerramienntaMapeadaEnPlanoYLaGuardaEnSuInventario(){

        Jugador jugador = crearJugadorParaTest();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        plano.insertarMaterialEnPosicion(new MaderaMaterial(), new Posicion(0,0));
        plano.insertarMaterialEnPosicion(new MaderaMaterial(), new Posicion(0,1));
        plano.insertarMaterialEnPosicion(new MaderaMaterial(), new Posicion(1,0));
        plano.insertarMaterialEnPosicion(new MaderaMaterial(), new Posicion(1,1));
        plano.insertarMaterialEnPosicion(new MaderaMaterial(), new Posicion(2,1));

        jugador.crearHerramientaNueva(plano);

        Assert.assertTrue(jugador.getInventario().tiene(new HachaMadera()));
    }

    @Test
    public void jugadorNoCreaHerramientaAlRecibirUnPlanoConHerramientaMapeadaIncorrecta(){

        Jugador jugador = crearJugadorParaTest();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        plano.insertarMaterialEnPosicion(new MaderaMaterial(), new Posicion(0,0));
        plano.insertarMaterialEnPosicion(new PiedraMaterial(), new Posicion(1,1));
        plano.insertarMaterialEnPosicion(new MetalMaterial(), new Posicion(2,0));

        jugador.crearHerramientaNueva(plano);

        Assert.assertFalse(jugador.getInventario().tiene(new HachaMadera()));
        Assert.assertFalse(jugador.getInventario().tiene(new HachaPiedra()));
        Assert.assertFalse(jugador.getInventario().tiene(new HachaMetal()));
        Assert.assertFalse(jugador.getInventario().tiene(new PicoMadera()));
        Assert.assertFalse(jugador.getInventario().tiene(new PicoPiedra()));
        Assert.assertFalse(jugador.getInventario().tiene(new PicoMetal()));
        Assert.assertFalse(jugador.getInventario().tiene(new PicoFino()));

    }

    @Test
    public void jugadorCreaHerramientaMapeadaEnPlanoCargadoConMaterialesDeSuInventario(){

        Jugador jugador = crearJugadorParaTest();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        Inventario inventarioDeJugador = jugador.getInventario();

        MaderaMaterial madera1 = new MaderaMaterial();
        MaderaMaterial madera2 = new MaderaMaterial();
        MetalMaterial metal1 = new MetalMaterial();
        MetalMaterial metal2 = new MetalMaterial();
        MetalMaterial metal3 = new MetalMaterial();

        inventarioDeJugador.agregar(madera1);
        inventarioDeJugador.agregar(madera2);
        inventarioDeJugador.agregar(metal1);
        inventarioDeJugador.agregar(metal2);
        inventarioDeJugador.agregar(metal3);

        Assert.assertEquals(2, inventarioDeJugador.getCantidadDe(new MaderaMaterial()));
        Assert.assertEquals(3, inventarioDeJugador.getCantidadDe(new MetalMaterial()));

        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(metal1), new Posicion(0,0));
        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(metal2), new Posicion(0,1));
        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(metal3), new Posicion(0,2));
        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(madera1), new Posicion(1,1));
        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(madera2), new Posicion(2,1));

        jugador.crearHerramientaNueva(plano);

        Assert.assertTrue(inventarioDeJugador.tiene(new PicoMetal()));

        Assert.assertEquals(0, inventarioDeJugador.getCantidadDe(new MaderaMaterial()));
        Assert.assertEquals(0, inventarioDeJugador.getCantidadDe(new MetalMaterial()));

    }

    @Test
    public void jugadorNoCreaHerramientaMapeadaEnPlanoCargadoConMaterialesDeSuInventarioYNoPierdeLosMaterialesUsados(){

        Jugador jugador = crearJugadorParaTest();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        Inventario inventarioDeJugador = jugador.getInventario();

        PiedraMaterial piedra1 = new PiedraMaterial();
        PiedraMaterial piedra2 = new PiedraMaterial();
        MetalMaterial metal = new MetalMaterial();

        inventarioDeJugador.agregar(piedra1);
        inventarioDeJugador.agregar(piedra2);
        inventarioDeJugador.agregar(metal);

        Assert.assertEquals(2, inventarioDeJugador.getCantidadDe(new PiedraMaterial()));
        Assert.assertEquals(1, inventarioDeJugador.getCantidadDe(new MetalMaterial()));

        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(piedra1), new Posicion(0,0));
        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(metal), new Posicion(1,1));
        plano.insertarMaterialEnPosicion(inventarioDeJugador.sacar(piedra2), new Posicion(2,2));


        jugador.crearHerramientaNueva(plano);

        Assert.assertEquals(2, inventarioDeJugador.getCantidadDe(new PiedraMaterial()));
        Assert.assertEquals(1, inventarioDeJugador.getCantidadDe(new MetalMaterial()));

    }

}
