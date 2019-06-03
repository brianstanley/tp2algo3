package fiuba.algo3.tp2;

public abstract class Material {

    protected int durabilidad;

    protected int durabilidad()
        {return this.durabilidad;}

    protected Material desgastar(Herramienta herramienta)
        {return this.desgastar(herramienta);}

    public abstract Material desgastar(HachaMadera hachaMadera);

    public abstract Material desgastar(HachaPiedra hachaPiedra);

    public abstract Material desgastar(HachaMetal hachaMetal);

    public abstract Material desgastar(PicoMadera picoMadera);

    public abstract Material desgastar(PicoPiedra picoPiedra);

    public abstract Material desgastar(PicoMetal picoMetal);

    public abstract Material desgastar(PicoFino picoFino);

}
