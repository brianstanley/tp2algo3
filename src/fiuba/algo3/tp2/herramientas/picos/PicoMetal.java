package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteAbrupta;

public class PicoMetal extends Pico {
    public PicoMetal() {
        this.durabilidadInicial = 400;
        this.fuerza = 12;
        this.desgastador = new EstrategiaDesgasteAbrupta(this.durabilidadInicial, 10);
    }
}
