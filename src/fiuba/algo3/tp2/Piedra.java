package fiuba.algo3.tp2;

public class Piedra extends Material {

    public Piedra(){
        durabilidad = 30;
    }

    public void desgastar(HachaDeMadera hachaMadera){
        //nada pasa

    }

    public void desgastar(HachaDePiedra hachaPiedra){
        //nada pasa

    }

    public void desgastar(HachaDeMetal hachaMetal){
        //nada pasa

    }

    public void desgastar(PicoDeMadera picoMadera){
        durabilidad -= 2;

    }

    public void desgastar(PicoDePiedra picoPiedra){
        durabilidad -= 4;
    }

    public void desgastar(PicoDeMetal picoMetal){
        durabilidad -= 12;

    }

    public void desgastar(PicoFino picoFino){
        durabilidad -= 20;
    }
}
