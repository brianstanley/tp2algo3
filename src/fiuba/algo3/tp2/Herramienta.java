package fiuba.algo3.tp2;

public abstract class Herramienta {
    protected int durabilidad;
    protected int fuerza;
    protected EstrategiaDesgaste estrategia;

    protected int getFuerza() {
        return this.fuerza;
    }

    protected int getDurabilidad() {
        return this.estrategia.durabilidad();
    }

    public void romper(Material unMaterial) {
        unMaterial.desgastar(this);
        this.estrategia.desgastar();
    }

}
