package fiuba.algo3.tp2.juego;

public class Navegador implements ElementoDeCampo {

    private Posicion posicionActual;
    private Direccion direccionApuntada;
    private Mapa mapaAsociado;

    public Navegador(int posicionX, int posicionY,  Mapa mapaDelJuego){
        this.mapaAsociado = mapaDelJuego;
        this.posicionActual = new Posicion(posicionX, posicionY);
        this.direccionApuntada = new DireccionNorte();
    }

    public void moverEnDireccion(Direccion direccionAMoverse){
        this.quitarDelMapa(this.posicionActual);
        this.direccionApuntada = direccionAMoverse;
        direccionApuntada.mover(this.posicionActual);
        this.ponerEnMapa(this.posicionActual);
    }

    public void ponerEnMapa(Posicion posicion){
        this.mapaAsociado.setContenidoCasillero(this, posicion);
    }

    public void quitarDelMapa(Posicion posicion){
        this.mapaAsociado.vaciarContenidoCasillero(this.posicionActual);
    }

    public void retractarMovimiento(){
        Direccion direccionOpuesta = this.direccionApuntada.getDireccionOpuesta();
        this.moverEnDireccion(direccionOpuesta);
    }

    private void cambiarDireccion(Direccion nuevaDireccionAPuntar){
        this.direccionApuntada = nuevaDireccionAPuntar;
    }

    public Posicion getPosicionActual() {
        return this.posicionActual;
    }

}
