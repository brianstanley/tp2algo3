package fiuba.algo3.tp2.estrategiasDesgaste;

import fiuba.algo3.tp2.estrategiasDesgaste.excepciones.DurabilidadCeroExcepcion;

public class EstrategiaDesgasteLogaritmico extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteLogaritmico(double durabilidad, double divisor){

        this.durabilidad = durabilidad;
        this.divisor = divisor;
    }


    @Override
    public void desgastar(){
        if (this.durabilidad <= 0){
            throw new DurabilidadCeroExcepcion("durabilidad 0 o meor");
        }
        this.durabilidad -= (this.durabilidad / this.divisor);
    }
}
