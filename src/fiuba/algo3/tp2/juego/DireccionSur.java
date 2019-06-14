package fiuba.algo3.tp2.juego;

public class DireccionSur extends Direccion {

    public void mover(Posicion posicionActual){
        posicionActual.moverSur();
    }

    public Direccion getDireccionOpuesta(){
        return new DireccionNorte();
    }
}
