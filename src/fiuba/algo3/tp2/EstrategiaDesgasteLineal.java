package fiuba.algo3.tp2;

public class EstrategiaDesgasteLineal extends EstrategiaDesgaste {

    public EstrategiaDesgasteLineal(int durabilidad, int factorDeReduccion){

        this.durabilidad = durabilidad;
        this.factorDeReduccion = factorDeReduccion;
    }

    @Override
    public void desgastar(){

        this.durabilidad -= factorDeReduccion;
    }


}
