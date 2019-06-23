package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;

public class FiguraPicoFino implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new PicoFino();
    }
}
