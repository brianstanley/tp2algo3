package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.Navegador.*;
import fiuba.algo3.tp2.materiales.Material;

public class Jugador implements Movible {

    private Inventario inventario;
    private Navegador navegador;
    private Herramienta herramientaActual;

    public Jugador(Navegador navegadorJugador) {

        this.inventario = new Inventario();
        HachaMadera hacha = new HachaMadera();
        this.navegador = navegadorJugador;
        this.herramientaActual = hacha;
    }

    public Inventario getInventario() {
        return this.inventario;
    }

    public Navegador getNavegador() {
        return this.navegador;
    }

    @Override
    public void moverNorte() {
        DireccionNorte nuevaDireccion = new DireccionNorte();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    @Override
    public void moverSur() {
        DireccionSur nuevaDireccion = new DireccionSur();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    @Override
    public void moverEste() {
        DireccionEste nuevaDireccion = new DireccionEste();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    @Override
    public void moverOeste() {
        DireccionOeste nuevaDireccion = new DireccionOeste();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    public void romper() {
        ElementoDeCampo elementoEnFrente = this.navegador.obtenerElementoEnFrente();
        this.herramientaActual.romper(elementoEnFrente);
    }

    public Herramienta getHerramientaActual() {
        return this.herramientaActual;
    }
}
