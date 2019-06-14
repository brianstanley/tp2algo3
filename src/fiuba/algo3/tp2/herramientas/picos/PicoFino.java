package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLogaritmico;
import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
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

    public void romper(DiamanteMaterial unDiamante) throws HerramientaRotaExcepcion {
        this.desgastador.desgastar();
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("la herramienta que quiere utilizar esta rota");
        }
        unDiamante.desgastarCon(this);
    }

    public void romper(MetalMaterial unMetal){
        unMetal.desgastarCon(this);
    }

    public void romper(PiedraMaterial unaPiedra){
        unaPiedra.desgastarCon(this);
    }
}
