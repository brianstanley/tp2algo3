package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.utils.ItemsContainer;
import fiuba.algo3.tp2.materiales.MaderaMaterial;

public class Inventario {
    private ItemsContainer items;

    public Inventario() {
        this.items = new ItemsContainer();
    }

    public boolean tiene(Guardable item) {
        return this.items.tieneItem(item);
    }

    public void agregar(Guardable item) {

        this.items.agregar(item);
    }

    public int getCantidadDe(Guardable item) {

        return this.items.getCantidadDe(item);
    }

    public int getCantidadItems() {
        return this.items.cantidad();
    }

    public Guardable removerItem(Guardable item) {
        Guardable buscado = this.items.obtener(item);
        return buscado;
    }

    public Guardable obtenerItemEnPosicicion(int indice){
        return this.items.obtenerItemEnPosicicion(indice);
    }

}
