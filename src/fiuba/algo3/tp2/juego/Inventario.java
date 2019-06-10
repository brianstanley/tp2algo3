package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.utils.HerramientasContainer;
import fiuba.algo3.tp2.juego.utils.MaterialesContainer;
import fiuba.algo3.tp2.materiales.Material;



public class Inventario {
    private HerramientasContainer herramientas;
    private MaterialesContainer materiales;

    public Inventario() {
        this.herramientas = new HerramientasContainer();
        this.materiales = new MaterialesContainer();
    }

    public boolean tiene(Herramienta herramienta) {
        return this.herramientas.tieneHerramienta(herramienta);
    }

    public void agregar(Material unMaterial) {

        this.materiales.agregar(unMaterial);
    }

    public void agregar(Herramienta unaHerramienta) {

        this.herramientas.agregar(unaHerramienta);
    }

    public int getCantidadDe(Material unMaterial) {

        return this.materiales.getCantidadDe(unMaterial);
    }

    public void removerItem(Material unMaterial) {
        this.materiales.decrementarCantidadDe(unMaterial);
    }

    public int getCantidadDeHerramientas() {
        return this.herramientas.cantidad();
    }
}
