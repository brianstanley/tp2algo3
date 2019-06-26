package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;

public class FiguraHachaPiedra implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new HachaPiedra();
    }

    @Override
    public Dibujable dibujo() {
        return new HerramientaVista("hachaPiedra.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }
}
