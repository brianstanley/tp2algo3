package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraPicoMadera;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public abstract class Pico extends Herramienta {

    public void romper(Material unMaterial){
        if (materialCorrecto(unMaterial)) {
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }

    private boolean materialCorrecto(Material unMaterial){
        return (unMaterial.getClass() == PiedraMaterial.class);
    }
}
