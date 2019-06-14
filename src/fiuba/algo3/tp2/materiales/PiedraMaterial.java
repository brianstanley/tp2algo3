package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.Pico;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public class PiedraMaterial extends Material {

    public PiedraMaterial() {
        this.durabilidad = 30;
    }

    public void desgastarCon(Pico unPico) throws MaterialRotoExcepcion {
        this.durabilidad -= unPico.getFuerza();
        if (durabilidad <= 0){
            throw new MaterialRotoExcepcion("este material ya fue desgastado");
        }
    }
}
