package fiuba.algo3.tp2;

public abstract class EstrategiaDesgaste {

    protected int durabilidad;
    protected int fuerza;

    public int durabilidad(){

        return this.durabilidad;
    }


    protected abstract void desgastar();


}
