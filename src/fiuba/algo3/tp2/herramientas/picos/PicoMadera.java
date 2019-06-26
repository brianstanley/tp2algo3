package fiuba.algo3.tp2.herramientas.picos;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraPicoMadera;

public class PicoMadera extends Pico {

    public PicoMadera() {
        this.fuerza = 2;
        this.durabilidadInicial = 100;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza);
    }
    @Override
    public FiguraConstruible getFigura(){
        return new FiguraPicoMadera();
    }
}
