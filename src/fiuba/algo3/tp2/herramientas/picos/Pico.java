package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public abstract class Pico extends Herramienta {

    public void romper(Material unMaterial){
        if (unMaterial.getClass() == PiedraMaterial.class) {
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }
}
