package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;

public class Jugador implements Movible {

    private Inventario inventario;
    private Navegador navegador;

    public Jugador(Navegador navegadorJugador) {

        this.inventario = new Inventario();
        HachaMadera hacha = new HachaMadera();
        this.navegador = navegadorJugador;
        this.inventario.agregar(hacha);
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
}
