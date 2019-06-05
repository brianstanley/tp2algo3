package fiuba.algo3.tp2;

public class PicoFino extends Pico {
    public PicoFino() {
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.desgastador = new EstrategiaDesgasteDividida(this.durabilidad, this.fuerza, 0.1);
    }
}
