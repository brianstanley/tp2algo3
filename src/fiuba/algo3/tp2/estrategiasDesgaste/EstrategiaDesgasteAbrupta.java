package fiuba.algo3.tp2.estrategiasDesgaste;

public class EstrategiaDesgasteAbrupta extends EstrategiaDesgaste{

    private int usos;

    public EstrategiaDesgasteAbrupta(double durabilidad, int usos){

        this.durabilidad = durabilidad;
        this.usos = usos;
    }

    @Override
    public void desgastar() {

        this.usos --;
        if (this.usos == 0) this.durabilidad = 0;
    }
}
