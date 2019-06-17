package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.Guardable;

public abstract class Material implements ElementoDeCampo, Guardable {
    protected int durabilidad;

    public void desgastarCon(Herramienta unaHerramienta) {
    }

    public int getDurabilidad() {
        return this.durabilidad;
    }

    public void ponerEnMapa(Mapa mapa, Posicion posicion){
        mapa.setContenidoCasillero(this, posicion);
    }

    public void quitarDelMapa(Mapa mapa, Posicion posicion){
        mapa.setContenidoCasillero(this, posicion);
    }

}
