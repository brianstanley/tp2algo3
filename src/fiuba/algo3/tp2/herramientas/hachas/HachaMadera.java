package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;


public class HachaMadera extends Hacha {

    public HachaMadera() {
        this.durabilidadInicial = 100;
        this.fuerza = 2;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza);
    }

}
