package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.Hacha;

public class MaderaMaterial extends Material {

    public MaderaMaterial() {
        this.durabilidad = 10;
    }
    public void desgastarCon(Herramienta unHacha) {
        this.durabilidad -= unHacha.getFuerza();
    }
}
