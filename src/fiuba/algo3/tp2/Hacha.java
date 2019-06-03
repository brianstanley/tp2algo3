package fiuba.algo3.tp2;

abstract public class Hacha {
    protected int durabilidad;
    protected int fuerza;
    protected EstrategiaDesgaste estrategia;

    public int getFuerza() {
        return this.fuerza;
    }


    public int getDurabilidad() {
        return this.estrategia.getDurabilidad();
    }

    public void romper(Madera unaMadera) {
        unaMadera.desgastar(this);
        this.estrategia.reducir(this.fuerza);
    }
}
