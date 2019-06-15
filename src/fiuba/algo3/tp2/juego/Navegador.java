package fiuba.algo3.tp2.juego;

public class Navegador implements ElementoDeCampo {

    private Posicion posicionActual;
    private Direccion direccionApuntada;
    private Mapa mapaAsociado;

    public Navegador(int posicionX, int posicionY,  Mapa mapaDelJuego){
        this.mapaAsociado = mapaDelJuego;
        this.posicionActual = new Posicion(posicionX, posicionY);
        this.direccionApuntada = new DireccionNorte();
        this.ponerEnMapa(this.mapaAsociado, this.posicionActual);
    }

    public void moverEnDireccion(Direccion direccionAMoverse){
        this.quitarDelMapa(this.mapaAsociado, this.posicionActual);
        this.direccionApuntada = direccionAMoverse;
        direccionApuntada.mover(this.posicionActual);
        this.ponerEnMapa(this.mapaAsociado, this.posicionActual);
    }

    @Override
    public void ponerEnMapa(Mapa mapa, Posicion posicion){
        mapa.setContenidoCasillero(this, posicion);
    }

    @Override
    public void quitarDelMapa(Mapa mapa, Posicion posicion){
        mapa.vaciarContenidoCasillero(this.posicionActual);
    }

    @Override
    public void retractarMovimiento(){
        Direccion direccionOpuesta = this.direccionApuntada.getDireccionOpuesta();
        this.direccionApuntada = direccionOpuesta;
        direccionApuntada.mover(this.posicionActual);
    }

    private void cambiarDireccion(Direccion nuevaDireccionAPuntar){
        this.direccionApuntada = nuevaDireccionAPuntar;
    }

    public Posicion getPosicionActual() {
        return this.posicionActual;
    }

}
