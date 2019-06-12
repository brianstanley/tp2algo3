package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public class FiguraPicoFino extends FiguraDeHerramienta{

    public FiguraPicoFino(){

        super();

        this.materialesDeFigura.agregar(new MaderaMaterial());
        this.materialesDeFigura.agregar(new MaderaMaterial());

        this.materialesDeFigura.agregar(new PiedraMaterial());

        this.materialesDeFigura.agregar(new MetalMaterial());
        this.materialesDeFigura.agregar(new MetalMaterial());
        this.materialesDeFigura.agregar(new MetalMaterial());
    }
}
