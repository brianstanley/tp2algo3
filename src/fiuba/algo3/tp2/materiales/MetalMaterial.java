package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.MaterialVista;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;

public class MetalMaterial extends Material {
    public MetalMaterial() {
        this.durabilidad = 50;
        this.materialVista = new MaterialVista("iron.png", this.durabilidad);
    }

    public void desgastarCon(Herramienta unPicoDePiedra) throws MaterialRotoExcepcion  {
        this.checkDurabilidadValida();
        this.durabilidad -= unPicoDePiedra.getFuerza();
    }

    @Override
    public Dibujable dibujo() {
        materialVista.setDurabilidadActual(this.durabilidad);
        return materialVista;

    }
}
