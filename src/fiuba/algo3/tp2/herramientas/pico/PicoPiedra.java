package fiuba.algo3.tp2.herramientas.pico;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDividida;

public class PicoPiedra extends Pico {
    public PicoPiedra() {
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteDividida(200, this.fuerza, 1.5);
    }
}
