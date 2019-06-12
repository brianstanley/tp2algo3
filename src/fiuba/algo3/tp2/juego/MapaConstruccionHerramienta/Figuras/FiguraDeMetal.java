package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;

public abstract class FiguraDeMetal extends FiguraDeHerramienta{

    public FiguraDeMetal(){

        super();

        this.materialesDeFigura.agregar(new MaderaMaterial());
        this.materialesDeFigura.agregar(new MaderaMaterial());

        this.materialesDeFigura.agregar(new MetalMaterial());
        this.materialesDeFigura.agregar(new MetalMaterial());
        this.materialesDeFigura.agregar(new MetalMaterial());
    }
}
