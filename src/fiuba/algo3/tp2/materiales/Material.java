package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;

public abstract class Material {
    protected int durabilidad;

    public void desgastarCon(Herramienta unaHerramienta) {
    }
    public int getDurabilidad() {
        return this.durabilidad;
    }
}
