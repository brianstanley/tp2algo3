package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraHachaPiedra;

public class HachaPiedra extends Hacha {

    public HachaPiedra() {
        this.durabilidadInicial = 200;
        this.fuerza = 5;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, this.fuerza);
    }

    @Override
    public FiguraConstruible getFigura(){
        return new FiguraHachaPiedra();
    }
}
