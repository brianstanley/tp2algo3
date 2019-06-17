package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.ExcepcionesHerramientas.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public class MetalMaterial extends Material {

    public MetalMaterial() {
        this.durabilidad = 50;
    }

    public void desgastarCon(PicoPiedra unPicoDePiedra) throws MaterialRotoExcepcion {
        this.checkDurabilidadValida();
        this.durabilidad -= unPicoDePiedra.getFuerza();
    }

    public void desgastarCon(PicoMetal unPicoDeMetal) throws MaterialRotoExcepcion {
        this.checkDurabilidadValida();
        this.durabilidad -= unPicoDeMetal.getFuerza();
    }

    public void desgastarCon(PicoFino unPicoFino) throws MaterialRotoExcepcion{
        this.checkDurabilidadValida();
        this.durabilidad -= unPicoFino.getFuerza();
    }
}
