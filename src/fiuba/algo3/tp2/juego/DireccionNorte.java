package fiuba.algo3.tp2.juego;

public class DireccionNorte extends Direccion {

    public Posicion mover(Posicion posicionActual){
        posicionActual.moverNorte();
        return posicionActual;
    }
}
