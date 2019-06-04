package fiuba.algo3.tp2;

public class Madera extends Material {


    public Madera(){
        durabilidad = 10;
    }

    @Override
    public int durabilidad() {
        return durabilidad;
    }

    @Override
    public  void desgastar(HachaDeMadera hachaMadera){
        durabilidad -= 2;
    }

    @Override
    public  void desgastar(HachaDePiedra hachaPiedra){
        durabilidad -= 5;
    }

    @Override
    public  void desgastar(HachaDeMetal hachaMetal){
        durabilidad-= 10;
    }

    @Override
    public  void desgastar(PicoDeMadera picoMadera){
        //nada pasa
    }

    @Override
    public  void desgastar(PicoDePiedra picoPiedra){
        //nada pasa
    }

    @Override
    public  void desgastar(PicoDeMetal picoMetal){
        //nada pasa
    }

    @Override
    public  void desgastar(PicoFino picoFino){
        //nada pasa
    }

}

