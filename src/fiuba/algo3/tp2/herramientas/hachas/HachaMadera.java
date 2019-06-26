package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraHachaMadera;


public class HachaMadera extends Hacha {

    public HachaMadera() {
        this.durabilidadInicial = 100;
        this.fuerza = 2;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza);
    }

    @Override
    public FiguraConstruible getFigura(){
        return new FiguraHachaMadera();
    }

}
