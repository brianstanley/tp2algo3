package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;

public class MetalMaterial extends Material {

    public MetalMaterial() {
        this.durabilidad = 50;
    }

    public void desgastarCon(PicoPiedra unPicoDePiedra) {
        this.durabilidad -= unPicoDePiedra.getFuerza();
    }

    public void desgastarCon(PicoFino unPicoFino) {
        this.durabilidad -= unPicoFino.getFuerza();
    }
}
