package fiuba.algo3.tp2;

public class PicoMadera extends Pico {
    public PicoMadera() {
        this.fuerza = 2;
        this.durabilidad = 100;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }
}
