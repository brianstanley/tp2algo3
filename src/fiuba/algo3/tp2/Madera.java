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
    public  void desgastar(HachaMadera hachaMadera){
        durabilidad -= 2;
    }

    @Override
    public  void desgastar(HachaPiedra hachaPiedra){
        durabilidad -= 5;
    }

    @Override
    public  void desgastar(HachaMetal hachaMetal){
        durabilidad-= 10;
    }

    @Override
    public  void desgastar(PicoMadera picoMadera){
        //nada pasa
    }

    @Override
    public  void desgastar(PicoPiedra picoPiedra){
        //nada pasa
    }

    @Override
    public  void desgastar(PicoMetal picoMetal){
        //nada pasa
    }

    @Override
    public  void desgastar(PicoFino picoFino){
        //nada pasa
    }

}

