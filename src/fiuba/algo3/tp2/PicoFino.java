package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDivididaPorDivisor;

public class PicoFino extends Pico {
    public PicoFino() {
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgastador = new EstrategiaDesgasteDivididaPorDivisor(this.durabilidad, this.fuerza, 0.1);
    }
}
