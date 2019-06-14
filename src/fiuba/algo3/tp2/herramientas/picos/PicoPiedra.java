package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.MetalMaterial;

public class PicoPiedra extends Pico {

    public PicoPiedra() {
        this.durabilidadInicial = 200;
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza, 1.5);
    }

    public void romper(MetalMaterial unMetal) throws HerramientaRotaExcepcion {
        this.desgastador.desgastar();
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("la herramienta que quiere utilizar esta rota");
        }
        unMetal.desgastarCon(this);
    }
}
