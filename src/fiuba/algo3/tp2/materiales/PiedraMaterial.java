package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.picos.Pico;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.MaterialVista;

public class PiedraMaterial extends Material {
    public PiedraMaterial() {
        this.durabilidad = 30;
    }
    public void desgastarCon(Pico unPico) {
        this.durabilidad -= unPico.getFuerza();
    }

    @Override
    public Dibujable dibujo() {
        return new MaterialVista("piedra.png");
    }
}
