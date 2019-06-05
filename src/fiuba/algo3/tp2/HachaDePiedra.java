package fiuba.algo3.tp2;

public class HachaDePiedra extends Hacha {

    public HachaDePiedra() {
        this.durabilidad = 200;
        this.fuerza = 5;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }
}
