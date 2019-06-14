package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.juego.ExcepcionesMapa.CasilleroOcupadoExcepcion;

public class Casillero {

    private ElementoDeCampo elementoGuardado;

    public Casillero(){
        this.elementoGuardado = null;
    }

    public ElementoDeCampo getContenido() {
        return this.elementoGuardado;
    }

    public void setContenido(ElementoDeCampo unElementoDeCampo) throws CasilleroOcupadoExcepcion {
        if (this.elementoGuardado == null){
            this.elementoGuardado = unElementoDeCampo;
        }
        else{
            throw new CasilleroOcupadoExcepcion("el casillero que se intenta ocupar ya esta ocupado");
        }
    }

    public ElementoDeCampo eliminarContenido() {
        // posibilidad de recoger el elemento eliminado
        ElementoDeCampo elementoRecogido = this.getContenido();
        this.setContenido(null);
        return elementoRecogido;
    }

}
