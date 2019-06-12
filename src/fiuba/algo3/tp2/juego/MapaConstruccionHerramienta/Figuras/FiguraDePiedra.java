package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public class FiguraDePiedra extends FiguraDeHerramienta{

    public FiguraDePiedra(){

        super();

        this.materialesDeFigura.agregar(new MaderaMaterial());
        this.materialesDeFigura.agregar(new MaderaMaterial());

        this.materialesDeFigura.agregar(new PiedraMaterial());
        this.materialesDeFigura.agregar(new PiedraMaterial());
        this.materialesDeFigura.agregar(new PiedraMaterial());
    }
}


