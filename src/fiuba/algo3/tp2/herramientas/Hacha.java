package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.materiales.MaderaMaterial;

public class Hacha extends Herramienta {
    protected int durabilidad;
    protected int fuerza;

    public int getFuerza() {
        return this.fuerza;
    }

    public int getDurabilidad() {
        return this.desgastador.durabilidad();
    }

    public void romper(MaderaMaterial unaMadera) {
        unaMadera.desgastar(this);
        this.desgastador.desgastar();
    }
}
