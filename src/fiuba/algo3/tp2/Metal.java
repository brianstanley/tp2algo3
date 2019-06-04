package fiuba.algo3.tp2;

public class Metal extends Material {

    public Metal(){
        durabilidad = 50;
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
        //nada pasa
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
