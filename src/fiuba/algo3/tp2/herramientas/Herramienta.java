package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgaste;

public abstract class Herramienta {
    protected int fuerza;
    protected double durabilidadInicial;
    protected EstrategiaDesgaste desgastador;

    public int getFuerza() {
        return this.fuerza;
    }

    public double getDurabilidad() {
        return this.desgastador.durabilidad();
    }

    public void romper(Material unMaterial) throws HerramientaRotaExcepcion{
        this.desgastador.desgastar();
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("la herramienta que quiere utilizar esta rota");
        }
    }
}
