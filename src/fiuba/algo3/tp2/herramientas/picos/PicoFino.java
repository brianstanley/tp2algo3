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
        if (unMaterial.getClass() == MetalMaterial.class || unMaterial.getClass() == DiamanteMaterial.class
        || unMaterial.getClass() == PiedraMaterial.class) {
            unMaterial.desgastarCon(this);
        }
        if (unMaterial.getClass() == DiamanteMaterial.class ){
            this.desgastador.desgastar();
        }
    }

    }