package fiuba.algo3.tp2.juego.Navegador;

public class DireccionNorte extends Direccion {

    public void mover(Posicion posicionActual){
        posicionActual.moverNorte();
    }

    public Direccion getDireccionOpuesta(){
        return new DireccionSur();
    }

    @Override
    public int getFactorDeDireccion() {
        return DIRECCION_NORTE;
    }
}
