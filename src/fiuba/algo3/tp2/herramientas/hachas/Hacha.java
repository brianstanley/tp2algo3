package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.herramientaExcepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;

public abstract class Hacha extends Herramienta {


    public void romper(Material unMaterial) {
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("esta herramienta esta rota");
        }
        if (materialCorrecto(unMaterial)){
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }

    private boolean materialCorrecto(Material unMaterial){
        return (unMaterial.getClass() == MaderaMaterial.class);
    }
}
