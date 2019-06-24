package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;

public class FiguraPicoMetal implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new PicoMetal();
    }
}
