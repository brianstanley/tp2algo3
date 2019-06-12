package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.*;
import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;

public class Herrero {


    public Herramienta construirHerramienta(FiguraDeHerramienta figura){
        return null;
    }
    public Herramienta construirHerramienta(FiguraHachaMadera figura){
        return new HachaMadera();
    }
    public Herramienta construirHerramienta(FiguraHachaPiedra figura){
        return new HachaPiedra();
    }
    public Herramienta construirHerramienta(FiguraHachaMetal figura){
        return new HachaMetal();
    }
    public Herramienta construirHerramienta(FiguraPicoFino figura){
        return new PicoFino();
    }
    public Herramienta construirHerramienta(FiguraPicoMadera figura){
        return new PicoMadera();
    }
    public Herramienta construirHerramienta(FiguraPicoPiedra figura){
        return new PicoPiedra();
    }
    public Herramienta construirHerramienta(FiguraPicoMetal figura){
        return new PicoMetal();
    }

}