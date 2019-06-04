package fiuba.algo3.tp2;

public class HachaDePiedra extends Hacha {

    public HachaDePiedra() {
        this.durabilidad = 200;
        this.fuerza = 5;
        this.estrategia = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }

    public void romper(Madera unaMadera) {
        unaMadera.desgastar(this);
        this.estrategia.desgastar();
    }

}
