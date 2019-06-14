package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;

public abstract class Hacha extends Herramienta {

    public void romper(MaderaMaterial unaMadera) throws HerramientaRotaExcepcion {
        this.desgastador.desgastar();
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("esta herramienta esta rota");
        }
        unaMadera.desgastarCon(this);
    }
}
