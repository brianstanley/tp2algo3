package fiuba.algo3.tp2.estrategiasDesgaste;

import fiuba.algo3.tp2.estrategiasDesgaste.excepciones.DurabilidadCeroExcepcion;

public class EstrategiaDesgasteAbrupta extends EstrategiaDesgaste{

    private int usos;

    public EstrategiaDesgasteAbrupta(double durabilidad, int usos){

        this.durabilidad = durabilidad;
        this.usos = usos;
    }

    @Override
    public void desgastar() {
        if (this.durabilidad == 0){
            throw new DurabilidadCeroExcepcion("durabilidad 0 o meor");
        }
        this.usos --;
        if (this.usos == 0) this.durabilidad = 0;
    }
}
