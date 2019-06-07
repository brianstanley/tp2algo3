package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgaste;

public abstract class Herramienta {
    protected int fuerza;
    protected int durabilidadInicial;
    protected EstrategiaDesgaste desgastador;

    public int getFuerza() {
        return this.fuerza;
    }

    public int getDurabilidad() {
        return this.desgastador.durabilidad();
    }

    public void romper(Material unMaterial) {
        this.desgastador.desgastar();
    }
}
