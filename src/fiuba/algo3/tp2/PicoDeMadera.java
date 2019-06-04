package fiuba.algo3.tp2;

public class PicoDeMadera extends Herramienta{

    public PicoDeMadera(){
        this.durabilidad = 100;
        this.fuerza = 2;
        this.estrategia = new EstrategiaDesgasteLineal(this.durabilidad, this.fuerza);
    }
}
