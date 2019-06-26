package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraPicoMadera implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new PicoMadera();
    }
    @Override
    public Dibujable dibujo() {
        return new HerramientaVista("picoMadera.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }
}
