package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.MaterialVista;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public class PiedraMaterial extends Material {

    public PiedraMaterial() {
        this.durabilidad = 30;
    }
    public void desgastarCon(Herramienta unPico)throws MaterialRotoExcepcion  {
        this.checkDurabilidadValida();
        this.durabilidad -= unPico.getFuerza();
    }

    @Override
    public Dibujable dibujo() {
        return new MaterialVista("piedra.png");
    }
}
