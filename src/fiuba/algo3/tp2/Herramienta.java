package fiuba.algo3.tp2;

public class Herramienta {
    protected int fuerza;
    protected int durabilidad;
    protected EstrategiaDesgaste desgastador;

    public int getFuerza() {
        return this.fuerza;
    }

    public int getDurabilidad() {
        return this.desgastador.durabilidad();
    }

    public void romper(Material unMaterial) {
        this.desgastador.desgastar();
    }
}
