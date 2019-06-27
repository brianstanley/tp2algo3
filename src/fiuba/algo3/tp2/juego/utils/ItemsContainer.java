package fiuba.algo3.tp2.juego.utils;


import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.materiales.Material;

import java.util.ArrayList;
import java.util.List;

public class ItemsContainer {
    private List<Guardable> items;


    public ItemsContainer() {
        items = new ArrayList<>();
    }

    public void agregar(Guardable item) {
        this.items.add(item);
    }

    public boolean tieneItem(Guardable itemBuscado) {

        for (Guardable itemActual: items)
            if (itemBuscado.getClass() == itemActual.getClass())
                return true;

        return false;
    }

    public int cantidad() {
        return this.items.size();
    }

    public int getCantidadDe(Guardable guardable) {

        int total = 0;

        for (Guardable itemActual: items)
            if (guardable.getClass() == itemActual.getClass())
                total++;

        return total;
    }

    public int getCantidadDeMateriales() {
        ArrayList<Material> materiales = this.obtenerMateriales();
        return materiales.size();
    }

    public Guardable obtener(Guardable item) {

        for (int i = 0; i < this.items.size(); i++)
            if (this.items.get(i).getClass() == item.getClass())
                return this.items.remove(i);

        return null;
    }

    public Guardable obtenerItemEnPosicicion(int indice) {
        return this.items.get(indice);
    }

    public ArrayList<Material> obtenerMateriales() {
        ArrayList<Material> materiales = new ArrayList<>();
        for(Guardable g : this.items) {
            if(g instanceof Material)
                materiales.add((Material) g);
        }

        return materiales;
    }
}
