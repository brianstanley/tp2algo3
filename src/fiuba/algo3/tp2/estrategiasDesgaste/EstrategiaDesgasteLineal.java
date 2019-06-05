package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteLineal extends EstrategiaDesgaste {

    public EstrategiaDesgasteLineal(int durabilidad, int factorDeReduccion){

        this.durabilidad = durabilidad;
        this.fuerza = factorDeReduccion;
    }

    @Override
    public void desgastar(){

        this.durabilidad -= fuerza;
    }


}
