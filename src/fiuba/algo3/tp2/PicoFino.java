package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDivididaDeDurabilidad;

public class PicoFino extends Pico {

    public PicoFino(){

        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgastador = new EstrategiaDesgasteDivididaDeDurabilidad(this.durabilidad,10);
    }

    @Override
    public void romper(Material unMaterial) {

        unMaterial.desgastar(this);

        if (unMaterial instanceof DiamanteMaterial)
            this.desgastador.desgastar();
    }
}
