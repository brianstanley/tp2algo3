package fiuba.algo3.tp2;

abstract public class Hacha {
    protected int durabilidad;
    protected int fuerza;
    protected EstrategiaDesgaste estrategia;

    public int getFuerza() {
        return this.fuerza;
    }

    public int getDurabilidad() {
        return this.estrategia.durabilidad();
    }

//    public void romper(Material unMaterial) {
//        unMaterial.desgastar(this);
//        this.estrategia.desgastar();
//    }
}
