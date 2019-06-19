package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.ExcepcionesHerrero.HerreroNoConoceFiguraACrearExcepcion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraDesconocida;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;

public class Herrero {


    public Herramienta construirHerramienta(PlanoConstruccionHerramienta plano)
    throws HerreroNoConoceFiguraACrearExcepcion {


        if (plano.obtenerFiguraMapeada() instanceof FiguraDesconocida)
            throw new HerreroNoConoceFiguraACrearExcepcion("La figura creada no es una herramienta conocida");

       return plano.obtenerFiguraMapeada().construir();

    }



}