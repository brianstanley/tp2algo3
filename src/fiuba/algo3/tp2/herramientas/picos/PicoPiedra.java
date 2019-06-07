package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;

public class PicoPiedra extends Pico {

    public PicoPiedra() {
        this.durabilidadInicial = 200;
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza, 1.5);
    }
}
