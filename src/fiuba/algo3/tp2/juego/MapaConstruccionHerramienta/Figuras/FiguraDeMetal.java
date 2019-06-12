package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;

public abstract class FiguraDeMetal extends FiguraDeHerramienta{

    public FiguraDeMetal(){

        this.madera = 2;
        this.piedra = 0;
        this.metal = 3;
    }
}
