package fiuba.algo3.tp2;

public class PicoPiedra extends Pico {
    public PicoPiedra() {
        this.fuerza = 4;
        this.desgastador = new EstrategiaDesgasteDividida(200, this.fuerza, 1.5);
    }
}
