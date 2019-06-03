package fiuba.algo3.tp2;

public class Piedra extends Material {

    public Piedra(){
        durabilidad = 30;
    }

    public void desgastar(HachaMadera hachaMadera){
        //nada pasa

    }

    public void desgastar(HachaPiedra hachaPiedra){
        //nada pasa

    }

    public void desgastar(HachaMetal hachaMetal){
        //nada pasa

    }

    public void desgastar(PicoMadera picoMadera){
        durabilidad -= 2;

    }

    public void desgastar(PicoPiedra picoPiedra){
        durabilidad -= 4;
    }

    public void desgastar(PicoMetal picoMetal){
        durabilidad -= 12;

    }

    public void desgastar(PicoFino picoFino){
        durabilidad -= 20;
    }
}
