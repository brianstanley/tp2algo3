package fiuba.algo3.tp2.juego;

public abstract class Direccion {

    protected abstract void mover(Posicion posicionActual);

    protected abstract Direccion getDireccionOpuesta();

    public Posicion calcularNuevaPosicionAPartirDe(Posicion posicionActual) {
        Posicion nuevaPosicion = new Posicion(posicionActual.getX(), posicionActual.getY());
        this.mover(nuevaPosicion);
        return nuevaPosicion;
    }
}
