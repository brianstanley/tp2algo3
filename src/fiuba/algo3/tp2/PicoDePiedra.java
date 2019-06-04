package fiuba.algo3.tp2;

public class PicoDePiedra extends Herramienta{

    public PicoDePiedra(){
        this.durabilidad = 200;
        this.fuerza = 4;
        this.estrategia = new EstrategiaDesgasteDividida(this.durabilidad, this.fuerza, 1.5);
    }

}
