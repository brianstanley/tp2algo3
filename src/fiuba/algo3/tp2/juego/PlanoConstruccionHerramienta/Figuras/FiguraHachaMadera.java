package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras;


import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.HerramientaVista;
import fiuba.algo3.tp2.vista.MaterialVista;

public class FiguraHachaMadera implements FiguraConstruible {

    @Override
    public Herramienta construir(){
        return new HachaMadera();
    }

    @Override
    public Dibujable dibujo() {
        return new HerramientaVista("hachaMadera.png");
    }

    @Override
    public Boolean esFiguraValida() {
        return true;
    }

}
