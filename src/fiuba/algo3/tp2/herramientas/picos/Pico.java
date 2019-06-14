package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public abstract class Pico extends Herramienta {

    public void romper(PiedraMaterial unaPiedra) throws HerramientaRotaExcepcion {
        this.desgastador.desgastar();
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("la herramienta que quiere utilizar esta rota");
        }
        unaPiedra.desgastarCon(this);
    }
}
