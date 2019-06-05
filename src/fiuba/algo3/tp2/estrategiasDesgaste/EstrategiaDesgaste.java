package fiuba.algo3.tp2.estrategiasDesgaste;

public abstract class EstrategiaDesgaste {

    protected int durabilidad;
    protected int fuerza;

    public int durabilidad(){

        return this.durabilidad;
    }


    public abstract void desgastar();
}