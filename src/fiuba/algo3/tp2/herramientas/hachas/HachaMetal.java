package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;

public class HachaMetal extends Hacha {

    public HachaMetal() {
        this.durabilidadInicial = 400;
        this.fuerza = 10;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, fuerza, 2);
    }
}
