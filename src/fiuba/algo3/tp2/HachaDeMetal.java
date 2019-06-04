package fiuba.algo3.tp2;

public class HachaDeMetal extends Herramienta {

    public HachaDeMetal() {
        this.durabilidad = 400;
        this.fuerza = 10;
        this.estrategia = new EstrategiaDesgasteDividida(this.durabilidad, fuerza, 2);
    }
}
