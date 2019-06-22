package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.Pico;

public class PiedraMaterial extends Material {
    public PiedraMaterial() {
        this.durabilidad = 30;
    }
    public void desgastarCon(Herramienta unPico) {
        this.durabilidad -= unPico.getFuerza();
    }
}
