package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDividida;

public class PicoPiedra extends Pico {
    public PicoPiedra() {
        this.durabilidad = 200;
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteDividida(this.durabilidad, this.fuerza, 1.5);
    }
}
