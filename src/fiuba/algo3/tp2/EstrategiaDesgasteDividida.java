package fiuba.algo3.tp2;

public class EstrategiaDesgasteDividida extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteDividida(int durabilidad, int factorReduccion, double divisor){

        this.durabilidad = durabilidad;
        this.factorDeReduccion = factorReduccion;
        this.divisor = divisor;
    }


    @Override
    public void desgastar(){

        durabilidad -= (factorDeReduccion / divisor);
    }
}
