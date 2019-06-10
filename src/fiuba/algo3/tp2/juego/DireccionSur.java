package fiuba.algo3.tp2.juego;

public class DireccionSur extends Direccion {

    public Posicion mover(Posicion posicionActual){
        posicionActual.moverSur();
        return posicionActual;
    }
}
