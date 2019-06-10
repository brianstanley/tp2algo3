package fiuba.algo3.tp2.juego;

public class DireccionOeste extends Direccion {

    public Posicion mover(Posicion posicionActual){
        posicionActual.moverOeste();
        return posicionActual;
    }
}
