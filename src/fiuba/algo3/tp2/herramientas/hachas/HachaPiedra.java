package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;

public class HachaPiedra extends Hacha {

    public HachaPiedra() {
        this.durabilidadInicial = 200;
        this.fuerza = 5;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza);
    }
}
