package fiuba.algo3.tp2;

import fiuba.algo3.tp2.herramientas.PicoPiedra;

public class MetalMaterial extends Material {
    public MetalMaterial() {
        this.durabilidad = 50;
    }
    public void desgastar(PicoPiedra unPicoDePiedra) {
        this.durabilidad -= unPicoDePiedra.getFuerza();
    }
}
