package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.juego.utils.MaterialesContainer;
import fiuba.algo3.tp2.materiales.MaderaMaterial;



public abstract class FiguraDeMadera extends FiguraDeHerramienta{

    public FiguraDeMadera(){

        super();
        for (int i=0;i<5;i++)
            this.materialesDeFigura.agregar(new MaderaMaterial());
    }
}
