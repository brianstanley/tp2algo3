package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;

public class DiamanteMaterial extends Material {
    public DiamanteMaterial() {
        this.durabilidad = 100;
    }
    public void desgastarCon(Herramienta unPicoFino) {
        this.durabilidad -= unPicoFino.getFuerza();
    }
}
