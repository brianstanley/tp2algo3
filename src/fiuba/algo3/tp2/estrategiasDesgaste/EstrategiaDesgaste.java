package fiuba.algo3.tp2.estrategiasDesgaste;

public abstract class EstrategiaDesgaste {

    protected double durabilidad;
    protected int fuerza;

    public double durabilidad(){

        return this.durabilidad;
    }


    public abstract void desgastar();
}
