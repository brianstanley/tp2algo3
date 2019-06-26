package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.Dibujable;

public interface FiguraConstruible {

    Herramienta construir();
    Dibujable dibujo();
}
