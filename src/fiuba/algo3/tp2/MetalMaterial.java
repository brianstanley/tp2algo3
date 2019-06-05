package fiuba.algo3.tp2;

public class MetalMaterial extends Material {
    public MetalMaterial() {
        this.durabilidad = 50;
    }
    public void desgastar(PicoPiedra unPicoDePiedra) {
        this.durabilidad -= unPicoDePiedra.getFuerza();
    }
}
