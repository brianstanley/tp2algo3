package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.*;
import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;

public class Herrero {


    public Guardable construirHerramienta(FiguraDeHerramienta figura){
        return null;
    }
    public Guardable construirHerramienta(FiguraHachaMadera figura){
        return new HachaMadera();
    }
    public Guardable construirHerramienta(FiguraHachaPiedra figura){
        return new HachaPiedra();
    }
    public Guardable construirHerramienta(FiguraHachaMetal figura){
        return new HachaMetal();
    }
    public Guardable construirHerramienta(FiguraPicoFino figura){
        return new PicoFino();
    }
    public Guardable construirHerramienta(FiguraPicoMadera figura){
        return new PicoMadera();
    }
    public Guardable construirHerramienta(FiguraPicoPiedra figura){
        return new PicoPiedra();
    }
    public Guardable construirHerramienta(FiguraPicoMetal figura){
        return new PicoMetal();
    }

}