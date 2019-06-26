package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraDesconocida implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return null;
    }

    @Override
    public Dibujable vista() {
        return new HerramientaVista("vacio.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return false;
    }
}
