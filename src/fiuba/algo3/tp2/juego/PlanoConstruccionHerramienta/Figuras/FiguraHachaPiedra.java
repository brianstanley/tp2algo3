package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;

public class FiguraHachaPiedra implements FiguraConstruible {

    @Override
    public Herramienta construir(){

        return new HachaPiedra();
    }
}
