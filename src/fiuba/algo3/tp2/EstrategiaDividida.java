package fiuba.algo3.tp2;

public class EstrategiaDividida extends EstrategiaDesgaste{

    public EstrategiaDividida(int durabilidad) {
        this.durabilidad = durabilidad;
    }
    @Override
    void reducir(int fuerza) {
        this.durabilidad -= fuerza / 2;
    }
}
