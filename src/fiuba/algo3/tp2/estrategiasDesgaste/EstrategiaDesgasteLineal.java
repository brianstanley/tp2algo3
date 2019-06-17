package fiuba.algo3.tp2.estrategiasDesgaste;

import fiuba.algo3.tp2.estrategiasDesgaste.excepciones.DurabilidadCeroExcepcion;

public class EstrategiaDesgasteLineal extends EstrategiaDesgaste {

    private double divisor;

    public EstrategiaDesgasteLineal(double durabilidad, int fuerza, double divisor){

        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.divisor = divisor;
    }

    public EstrategiaDesgasteLineal(double durabilidad, int fuerza){

        this.durabilidad = durabilidad;
        this.fuerza = fuerza;
        this.divisor = 1;
    }

    @Override
    public void desgastar() {
        if(this.durabilidad <= 0){
            throw new DurabilidadCeroExcepcion("durabilidad 0 o meor");
        }
        this.durabilidad -= (this.fuerza / this.divisor);
    }
}
