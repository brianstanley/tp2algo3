package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;

public class Jugador implements Movible, ElementoDeCampo {

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
        this.navegador.moverNorte();
    }

    @Override
    public void moverSur() {
        this.navegador.moverSur();
    }

    @Override
    public void moverEste() {
        this.navegador.moverEste();
    }

    @Override
    public void moverOeste() {
        this.navegador.moverOeste();
    }
}
