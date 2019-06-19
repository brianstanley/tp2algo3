package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLogaritmico;
import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public class PicoFino extends Pico {

    public PicoFino(){

        this.durabilidadInicial = 1000;
        this.fuerza = 20;
        this.desgastador = new EstrategiaDesgasteLogaritmico(this.durabilidadInicial,10);
    }

    @Override
    public void romper(Material unMaterial) {

        // Aseguramos que pico fino solo actua ante un diamante
    }

    public void romper(DiamanteMaterial unDiamante){
        unDiamante.desgastarCon(this);
        this.desgastador.desgastar();
    }

    public void romper(MetalMaterial unMetal){
        unMetal.desgastarCon(this);
    }

    public void romper(PiedraMaterial unaPiedra){
        unaPiedra.desgastarCon(this);
    }
}
