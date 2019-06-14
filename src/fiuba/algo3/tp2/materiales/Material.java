package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.Posicion;

public abstract class Material implements ElementoDeCampo {
    protected int durabilidad;

    public void desgastarCon(Herramienta unaHerramienta) {
    }

    public int getDurabilidad() {
        return this.durabilidad;
    }

    public void ponerEnMapa(Posicion posicion){

    }

    public void quitarDelMapa(Posicion posicion){

    }

    public void retractarMovimiento(){
        
    }
}
