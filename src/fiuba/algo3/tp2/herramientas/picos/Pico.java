package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public abstract class Pico extends Herramienta {

    public void romper(PiedraMaterial unaPiedra) {
        this.desgastador.desgastar();
        unaPiedra.desgastarCon(this);
    }
}
