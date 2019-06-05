package fiuba.algo3.tp2;

public class PiedraMaterial extends Material {
    public PiedraMaterial() {
        this.durabilidad = 30;
    }
    public void desgastar(Pico unPico) {
        this.durabilidad -= unPico.getFuerza();
    }
}
