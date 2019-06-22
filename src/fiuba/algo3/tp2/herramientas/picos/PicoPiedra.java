package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
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
        if (unMaterial.getClass() == MetalMaterial.class || unMaterial.getClass() == PiedraMaterial.class) {
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }
}
