package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteAbrupta;

public class PicoMetal extends Pico {
    public PicoMetal() {
        this.fuerza = 12;
        this.desgastador = new EstrategiaDesgasteAbrupta(400, 10);
    }
}
