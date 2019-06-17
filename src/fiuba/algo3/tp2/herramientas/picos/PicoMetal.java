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

    public void romper(MetalMaterial unMetal)  {
        this.desgastador.desgastar();
        unMetal.desgastarCon(this);
    }
}
