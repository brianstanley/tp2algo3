package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.MaterialVista;

public class DiamanteMaterial extends Material {
    public DiamanteMaterial() {
        this.durabilidad = 100;
    }
    public void desgastarCon(PicoFino unPicoFino) {
        this.durabilidad -= unPicoFino.getFuerza();
    }

    @Override
    public Dibujable dibujo() {
        return new MaterialVista("diamond.png");

    }
}
