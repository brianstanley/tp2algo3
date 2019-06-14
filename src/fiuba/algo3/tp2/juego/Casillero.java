package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.materiales.Material;

public class Casillero {

    private Material materialAlmacenado;
    private Jugador jugadorEnCasillero;
    private ElementoDeCampo contenido;

    public Casillero(){
        this.materialAlmacenado = null;
        this.jugadorEnCasillero = null;
        this.contenido = null;
    }

    public ElementoDeCampo getContenido() {
        return this.contenido;
    }

    public void setContenido(ElementoDeCampo unElementoDeCampo) {
        this.contenido = unElementoDeCampo;
    }

    public ElementoDeCampo eliminarContenido() {
        // posibilidad de recoger el elemento eliminado
        ElementoDeCampo elementoRecogido = this.getContenido();
        this.setContenido(null);
        return elementoRecogido;
    }

}
