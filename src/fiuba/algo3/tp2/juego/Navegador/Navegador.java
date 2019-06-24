package fiuba.algo3.tp2.juego.Navegador;

import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.vista.JugadorVista;

public class Navegador implements ElementoDeCampo {

    private Posicion posicionActual;
    private Direccion direccionApuntada;
    private Mapa mapaAsociado;
    private JugadorVista vista;

    public Navegador(int posicionX, int posicionY,  Mapa mapaDelJuego){
        this.mapaAsociado = mapaDelJuego;
        this.posicionActual = new Posicion(posicionX, posicionY);
        this.direccionApuntada = new DireccionNorte();
        this.ponerEnMapa(this.mapaAsociado, this.posicionActual);
    }

    private boolean puedeMoverseEnDireccionApuntada() {
        Posicion posicionTentativa = direccionApuntada.calcularNuevaPosicionAPartirDe(this.posicionActual);
        return !this.mapaAsociado.estaAfueraDelMapaLaPosicion(posicionTentativa) &&
                !this.mapaAsociado.existeElementoEnPosicion(posicionTentativa);
    }

    public void moverEnDireccion(Direccion direccionAMoverse){
        this.direccionApuntada = direccionAMoverse;
        this.vista.cambiarEspejo(direccionAMoverse.getFactorDeDireccion());
        if (this.puedeMoverseEnDireccionApuntada()) {
            this.quitarDelMapa(this.mapaAsociado, this.posicionActual);
            direccionApuntada.mover(this.posicionActual);
            this.ponerEnMapa(this.mapaAsociado, this.posicionActual);
        }
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
    public JugadorVista dibujo() {
        return this.vista;
    }

    public void setVista(JugadorVista jugadorVista) {
        this.vista = jugadorVista;
    }

    public Posicion getPosicionActual() {
        return this.posicionActual;
    }

}
