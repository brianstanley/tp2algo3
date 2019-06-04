package fiuba.algo3.tp2;

public class PicoDeMetal extends Herramienta {

    public PicoDeMetal(){
        this.durabilidad = 400;
        this.fuerza = 12;
        this.estrategia = new EstrategiaDesgasteAbrupta(this.durabilidad, 10);
    }
}
