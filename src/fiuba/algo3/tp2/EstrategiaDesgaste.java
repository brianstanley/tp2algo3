package fiuba.algo3.tp2;

public abstract class EstrategiaDesgaste {

    protected int durabilidad;
    protected int factorDeReduccion;

    /* factorDeReduccion representa la fuerza de la herramienta que afecta siempre igual */


    public int durabilidad(){

        return this.durabilidad;
    }


    public abstract void desgastar();


}
