package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteDividida extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteDividida(int durabilidad, int factorReduccion, double divisor){

        this.durabilidad = durabilidad;
        this.fuerza = factorReduccion;
        this.divisor = divisor;
    }


    @Override
    public void desgastar(){

        durabilidad -= (fuerza / divisor);
    }
}
