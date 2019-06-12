package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.juego.utils.*;


public abstract class FiguraDeHerramienta{

    protected MaterialesContainer materialesDeFigura;


    public FiguraDeHerramienta(){

        this.materialesDeFigura = new MaterialesContainer();


    }
    public MaterialesContainer obtenerMateriales(){

        return this.materialesDeFigura;
    }
}


