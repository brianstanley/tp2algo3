package fiuba.algo3.tp2;

public class HachaDeMadera extends Hacha {

    public HachaDeMadera() {
        this.durabilidad = 100;
        this.fuerza = 2;
        this.estrategia = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }

}
