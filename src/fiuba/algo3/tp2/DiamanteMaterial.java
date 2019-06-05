package fiuba.algo3.tp2;

public class DiamanteMaterial extends Material {
    public DiamanteMaterial() {
        this.durabilidad = 100;
    }
    public void desgastar(PicoFino unPicoFino) {
        this.durabilidad -= unPicoFino.getFuerza();
    }
}
