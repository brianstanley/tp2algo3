package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteLineal extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteLineal(int durabilidad, int fuerza, double divisor){

        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.divisor = divisor;
    }

    public EstrategiaDesgasteLineal(int durabilidad, int fuerza){

        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.divisor = 1;
    }

    @Override
    public void desgastar(){

        this.durabilidad -= (this.fuerza / this.divisor);
    }
}
