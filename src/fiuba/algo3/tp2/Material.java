package fiuba.algo3.tp2;

public abstract class Material {

    protected int durabilidad;

    protected int durabilidad()
        {return this.durabilidad;}

    public abstract void desgastar(HachaMadera hachaMadera);

    public abstract void desgastar(HachaPiedra hachaPiedra);

    public abstract void desgastar(HachaMetal hachaMetal);

    public abstract void desgastar(PicoMadera picoMadera);

    public abstract void desgastar(PicoPiedra picoPiedra);

    public abstract void desgastar(PicoMetal picoMetal);

    public abstract void desgastar(PicoFino picoFino);

}
