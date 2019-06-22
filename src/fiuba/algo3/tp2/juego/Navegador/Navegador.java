package fiuba.algo3.tp2.juego.Navegador;

import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.materiales.*;

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

    private boolean puedeMoverseEnDireccionApuntada() {
        Posicion posicionTentativa = direccionApuntada.calcularNuevaPosicionAPartirDe(this.posicionActual);
        return !this.mapaAsociado.estaAfueraDelMapaLaPosicion(posicionTentativa) &&
                !this.mapaAsociado.existeElementoEnPosicion(posicionTentativa);
    }

    public void moverEnDireccion(Direccion direccionAMoverse){
        this.direccionApuntada = direccionAMoverse;
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

    public Posicion getPosicionActual() {
        return this.posicionActual;
    }

    public ElementoDeCampo obtenerElementoEnFrente(){
        Posicion posicionEnfrente = this.direccionApuntada.calcularNuevaPosicionAPartirDe(this.posicionActual);
        return this.mapaAsociado.getContenidoCasillero(posicionEnfrente);
    }

}
