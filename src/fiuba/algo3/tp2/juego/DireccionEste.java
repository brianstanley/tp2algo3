package fiuba.algo3.tp2.juego;

public class DireccionEste extends Direccion{

    public Posicion mover(Posicion posicionActual){
        posicionActual.moverEste();
        return posicionActual;
    }
}
