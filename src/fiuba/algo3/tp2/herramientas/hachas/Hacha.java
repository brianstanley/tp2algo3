package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;

public abstract class Hacha extends Herramienta {


    public void romper(Material unMaterial) {
        if (unMaterial.getClass() == MaderaMaterial.class) {
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }
}
