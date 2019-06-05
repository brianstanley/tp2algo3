package fiuba.algo3.tp2.herramientas.hacha;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDividida;

public class HachaDeMetal extends Hacha {

    public HachaDeMetal() {
        this.durabilidad = 400;
        this.fuerza = 10;
        this.desgastador = new EstrategiaDesgasteDividida(this.durabilidad, fuerza, 2);
    }
}
