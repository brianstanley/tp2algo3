package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteLogaritmica extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteLogaritmica(int durabilidad, double divisor){

        this.durabilidad = durabilidad;
        this.divisor = divisor;
    }


    @Override
    public void desgastar(){

        this.durabilidad -= (this.durabilidad / this.divisor);
    }
}
