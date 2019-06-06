package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;


public class HachaMadera extends Hacha {

    public HachaMadera() {
        this.durabilidad = 100;
        this.fuerza = 2;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }

}
