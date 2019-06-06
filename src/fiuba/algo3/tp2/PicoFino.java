package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLogaritmica;

public class PicoFino extends Pico {

    public PicoFino(){

        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgastador = new EstrategiaDesgasteLogaritmica(this.durabilidad,10);
    }

    @Override
    public void romper(Material unMaterial) {

        /* Aseguramos que pico fino solo actua ante un diamante */
    }

    public void romper(DiamanteMaterial unDiamante){

        unDiamante.desgastar(this);
        this.desgastador.desgastar();
    }
}
