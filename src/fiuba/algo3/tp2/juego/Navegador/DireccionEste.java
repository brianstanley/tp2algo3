package fiuba.algo3.tp2.juego.Navegador;

public class DireccionEste extends Direccion{

    public void mover(Posicion posicionActual){
        posicionActual.moverEste();
    }

    public Direccion getDireccionOpuesta(){
        return new DireccionOeste();
    }
}
