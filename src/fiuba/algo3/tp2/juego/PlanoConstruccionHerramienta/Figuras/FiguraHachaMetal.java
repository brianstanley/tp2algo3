package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraHachaMetal implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new HachaMetal();
    }

    @Override
    public Dibujable dibujo() {
        return new HerramientaVista("hachaMetal.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }
}
