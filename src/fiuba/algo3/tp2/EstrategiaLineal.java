package fiuba.algo3.tp2;

public class EstrategiaLineal extends EstrategiaDesgaste {

    public EstrategiaLineal(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public void reducir(int fuerza) {
        this.durabilidad -= fuerza;
    }
}
