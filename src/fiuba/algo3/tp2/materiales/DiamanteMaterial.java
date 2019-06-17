package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public class DiamanteMaterial extends Material {

    public DiamanteMaterial() {
        this.durabilidad = 100;
    }

    public void desgastarCon(PicoFino unPicoFino) throws MaterialRotoExcepcion {
        this.checkDurabilidadValida();
        this.durabilidad -= unPicoFino.getFuerza();
    }
}
