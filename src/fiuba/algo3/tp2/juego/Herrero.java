package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.MapaConstruccionHerramienta;

public class Herrero {


    public Herramienta construirHerramienta(MapaConstruccionHerramienta mapa){

       return mapa.obtenerFiguraMapeada().construir();

    }



}