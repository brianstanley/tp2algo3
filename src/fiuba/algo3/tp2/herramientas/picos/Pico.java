package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.herramientaExcepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public abstract class Pico extends Herramienta {

    public void romper(Material unMaterial){
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("esta herramienta esta rota");
        }
        if (materialCorrecto(unMaterial)) {
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }

    private boolean materialCorrecto(Material unMaterial){
        return (unMaterial.getClass() == PiedraMaterial.class);
    }
}
