package fiuba.algo3.tp2;

public abstract class Material {

    protected int durabilidad;

    protected int durabilidad()
        {return this.durabilidad;}

    public abstract void desgastar(HachaDeMadera hachaMadera);

    public abstract void desgastar(HachaDePiedra hachaPiedra);

    public abstract void desgastar(HachaDeMetal hachaMetal);

    public abstract void desgastar(PicoDeMadera picoMadera);

    public abstract void desgastar(PicoDePiedra picoPiedra);

    public abstract void desgastar(PicoDeMetal picoMetal);

    public abstract void desgastar(PicoFino picoFino);

}
