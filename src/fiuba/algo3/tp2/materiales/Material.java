package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public abstract class Material {
    protected int durabilidad;

    public void desgastarCon(Herramienta unaHerramienta) {
    }

    public int getDurabilidad() {
        return this.durabilidad;
    }

    public void checkDurabilidadValida(){
        if (durabilidad <= 0){
            throw new MaterialRotoExcepcion("este material ya fue desgastado");
        }
    }
}
