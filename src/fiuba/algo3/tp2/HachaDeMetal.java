package fiuba.algo3.tp2;

public class HachaDeMetal extends Hacha {
    public HachaDeMetal() {
        this.durabilidad = 400;
        this.fuerza = 10;
        this.estrategia = new EstrategiaDividida(this.durabilidad);
    }
}
