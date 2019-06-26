package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraPicoMetal implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new PicoMetal();
    }

    @Override
    public Dibujable dibujo() {
        return new HerramientaVista("picoMetal.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }
}
