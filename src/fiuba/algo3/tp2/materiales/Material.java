package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.Guardable;

public abstract class Material implements Guardable {
    protected int durabilidad;

    public void desgastarCon(Herramienta unaHerramienta) {
    }
    public int getDurabilidad() {
        return this.durabilidad;
    }
}
