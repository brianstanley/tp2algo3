package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;

public abstract class Hacha extends Herramienta {

    public void romper(MaderaMaterial unaMadera) {
        this.desgastador.desgastar();
        unaMadera.desgastarCon(this);
    }
}
