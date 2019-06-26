package fiuba.algo3.tp2.herramientas;

import fiuba.algo3.tp2.herramientas.herramientaExcepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraDesconocida;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgaste;

public abstract class Herramienta implements Guardable {
    protected int fuerza;
    protected double durabilidadInicial;
    protected EstrategiaDesgaste desgastador;

    public int getFuerza() {
        return this.fuerza;
    }

    public double getDurabilidad() {
        return this.desgastador.durabilidad();
    }

    public void romper(Material unMaterial) {
        if (this.getDurabilidad() <= 0){
            throw new HerramientaRotaExcepcion("esta herramienta esta rota");
        }
        this.desgastador.desgastar();
    }

    public FiguraConstruible getFigura() {
        return new FiguraDesconocida();
    }
}
