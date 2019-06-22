package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteAbrupta;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public class PicoMetal extends Pico {

    public PicoMetal() {
        this.durabilidadInicial = 400;
        this.fuerza = 12;
        this.desgastador = new EstrategiaDesgasteAbrupta(this.durabilidadInicial, 10);
    }

    public void romper(Material unMaterial){
        if (unMaterial.getClass() == MetalMaterial.class || unMaterial.getClass() == PiedraMaterial.class) {
            unMaterial.desgastarCon(this);
        }
        this.desgastador.desgastar();
    }
}
