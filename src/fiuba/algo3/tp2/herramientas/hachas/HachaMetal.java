package fiuba.algo3.tp2.herramientas.hachas;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraHachaMetal;

public class HachaMetal extends Hacha {

    public HachaMetal() {
        this.durabilidadInicial = 400;
        this.fuerza = 10;
        this.desgastador = new EstrategiaDesgasteLineal(this.durabilidadInicial, fuerza, 2);
    }

    @Override
    public FiguraConstruible getFigura(){
        return new FiguraHachaMetal();
    }
}
