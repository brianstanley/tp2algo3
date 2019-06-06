package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;

public class PicoPiedra extends Pico {
    public PicoPiedra() {
        this.durabilidad = 200;
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza, 1.5);
    }
}
