package fiuba.algo3.tp2.juego.Navegador;

public class DireccionSur extends Direccion {

    public void mover(Posicion posicionActual){
        posicionActual.moverSur();
    }

    public Direccion getDireccionOpuesta(){
        return new DireccionNorte();
    }

    @Override
    public int getFactorDeDireccion() {
        return 0;
    }
}
