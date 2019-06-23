package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.Hacha;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.MaterialVista;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public class MaderaMaterial extends Material {

    public MaderaMaterial() {
        this.durabilidad = 10;
    }
    public void desgastarCon(Herramienta unHacha) throws MaterialRotoExcepcion {
        this.checkDurabilidadValida();
        this.durabilidad -= unHacha.getFuerza();
    }

    @Override
    public Dibujable dibujo() {
        return new MaterialVista("madera.png");
    }
}
