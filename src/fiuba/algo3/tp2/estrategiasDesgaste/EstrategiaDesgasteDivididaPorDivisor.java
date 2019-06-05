package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteDivididaPorDivisor extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteDivididaPorDivisor(int durabilidad, int fuerza, double divisor){

        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.divisor = divisor;
    }


    @Override
    public void desgastar(){

        this.durabilidad -= (this.fuerza / this.divisor);
    }
}
