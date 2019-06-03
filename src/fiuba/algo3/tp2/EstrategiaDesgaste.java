package fiuba.algo3.tp2;

abstract class EstrategiaDesgaste {
    protected int durabilidad;
    abstract void reducir(int fuerza);

    public int getDurabilidad() {
        return this.durabilidad;
    }
}
