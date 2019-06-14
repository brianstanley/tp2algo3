package fiuba.algo3.tp2.juego;

public class DireccionOeste extends Direccion {

    public void mover(Posicion posicionActual){
        posicionActual.moverOeste();
    }

    public Direccion getDireccionOpuesta(){
        return new DireccionEste();
    }
}
