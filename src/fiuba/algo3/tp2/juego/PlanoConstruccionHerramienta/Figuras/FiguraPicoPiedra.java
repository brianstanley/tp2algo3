package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraPicoPiedra implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new PicoPiedra();
    }

    @Override
    public Dibujable vista() {
        return new HerramientaVista("picoPiedra.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }
}
