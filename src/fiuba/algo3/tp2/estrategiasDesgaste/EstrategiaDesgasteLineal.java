package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteLineal extends EstrategiaDesgaste {

    public EstrategiaDesgasteLineal(int durabilidad, int fuerza){

        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
    }

    @Override
    public void desgastar(){

        this.durabilidad -= this.fuerza;
    }


}
