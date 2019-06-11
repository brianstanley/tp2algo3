package fiuba.algo3.tp2.juego;

public class Navegador implements Movible {

    private Posicion posicionActual;
    private Direccion direccionApuntada;
    private Mapa mapaAsociado;

    public Navegador(int posicionX, int posicionY,  Mapa mapaDelJuego){
        this.mapaAsociado = mapaDelJuego;
        this.posicionActual = new Posicion(posicionX, posicionY);
        this.direccionApuntada = new DireccionNorte();
    }

    private void mover(){
        if (this.puedeMoverseEn(this.direccionApuntada)) {
            direccionApuntada.mover(posicionActual);
        }
    }

    private boolean puedeMoverseEn(Direccion direccionApuntada) {
        return true;
//        return this.mapa.existeElementoEnPosicion(direccionApuntada.calcularNuevaPosicionAPartirDe(this.posicionActual));
    }

    private void cambiarDireccion(Direccion nuevaDireccionAPuntar){
        this.direccionApuntada = nuevaDireccionAPuntar;
    }

    public void moverNorte(){
        DireccionNorte nuevaDireccion = new DireccionNorte();
        this.cambiarDireccion(nuevaDireccion);
        this.mover();
    }

    public void moverSur(){
        DireccionSur nuevaDireccion = new DireccionSur();
        this.cambiarDireccion(nuevaDireccion);
        this.mover();
    }

    public void moverEste(){
        DireccionEste nuevaDireccion = new DireccionEste();
        this.cambiarDireccion(nuevaDireccion);
        this.mover();
    }

    public void moverOeste(){
        DireccionOeste nuevaDireccion = new DireccionOeste();
        this.cambiarDireccion(nuevaDireccion);
        this.mover();
    }
}
