package fiuba.algo3.tp2.juego.Navegador;

public abstract class Direccion {

    int DIRECCION_NORTE = 2;
    int DIRECCION_SUR = 3;
    int DIRECCION_OESTE = 1;
    int DIRECCION_ESTE = -1;
    protected abstract void mover(Posicion posicionActual);

    protected abstract Direccion getDireccionOpuesta();

    public Posicion calcularNuevaPosicionAPartirDe(Posicion posicionActual) {
        Posicion nuevaPosicion = new Posicion(posicionActual.getX(), posicionActual.getY());
        this.mover(nuevaPosicion);
        return nuevaPosicion;
    }

    public abstract int getFactorDeDireccion();
}
