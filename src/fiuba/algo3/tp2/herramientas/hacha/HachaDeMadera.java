package fiuba.algo3.tp2.herramientas.hacha;
import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;


public class HachaDeMadera extends Hacha {

    public HachaDeMadera() {
        this.durabilidad = 100;
        this.fuerza = 2;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }

}
