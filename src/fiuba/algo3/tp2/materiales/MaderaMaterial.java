package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.hacha.Hacha;

public class MaderaMaterial extends Material {

    public MaderaMaterial() {
        this.durabilidad = 10;
    }
    public void desgastar(Hacha unHacha) {
        this.durabilidad -= unHacha.getFuerza();
    }
}
