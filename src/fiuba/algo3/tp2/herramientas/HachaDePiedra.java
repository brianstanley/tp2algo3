package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;

public class HachaDePiedra extends Hacha {

    public HachaDePiedra() {
        this.durabilidad = 200;
        this.fuerza = 5;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }
}
