package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraPicoFino implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new PicoFino();
    }

    @Override
    public Dibujable dibujo() {
        return new HerramientaVista("picoFino.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }
}
