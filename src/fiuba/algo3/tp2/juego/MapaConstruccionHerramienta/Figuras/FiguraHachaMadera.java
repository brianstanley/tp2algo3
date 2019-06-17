package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;


import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;

public class FiguraHachaMadera implements FiguraConstruible {

    @Override
    public Herramienta construir(){
        return new HachaMadera();
    }
}
