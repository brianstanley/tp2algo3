package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;

public class Herrero {


    public Herramienta construirHerramienta(PlanoConstruccionHerramienta plano){

       return plano.obtenerFiguraMapeada().construir();

    }



}