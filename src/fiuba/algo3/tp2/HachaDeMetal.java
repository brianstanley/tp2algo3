package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDivididaPorDivisor;

public class HachaDeMetal extends Hacha {

    public HachaDeMetal() {
        this.durabilidad = 400;
        this.fuerza = 10;
        this.desgastador = new EstrategiaDesgasteDivididaPorDivisor(this.durabilidad, fuerza, 2);
    }
}
