package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDividida;

public class HachaMetal extends Hacha {

    public HachaMetal() {
        this.durabilidad = 400;
        this.fuerza = 10;
        this.desgastador = new EstrategiaDesgasteDividida(this.durabilidad, fuerza, 2);
    }
}
