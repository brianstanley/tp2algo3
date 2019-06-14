package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteAbrupta;
import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.MetalMaterial;

public class PicoMetal extends Pico {

    public PicoMetal() {
        this.durabilidadInicial = 400;
        this.fuerza = 12;
        this.desgastador = new EstrategiaDesgasteAbrupta(this.durabilidadInicial, 10);
    }

    public void romper(MetalMaterial unMetal) throws HerramientaRotaExcepcion {
        this.desgastador.desgastar();
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("la herramienta que quiere utilizar esta rota");
        }
        unMetal.desgastarCon(this);
    }
}
