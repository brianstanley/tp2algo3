package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import fiuba.algo3.tp2.herramientas.herramientaExcepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public class PicoPiedra extends Pico {

    public PicoPiedra() {
        this.durabilidadInicial = 200;
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza, 1.5);
    }

    public void romper(Material unMaterial){
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("esta herramienta esta rota");
        }
        if (materialCorrecto(unMaterial)){
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }

    private boolean materialCorrecto(Material unMaterial){
        return (unMaterial.getClass() == MetalMaterial.class || unMaterial.getClass() == PiedraMaterial.class);
    }
}
