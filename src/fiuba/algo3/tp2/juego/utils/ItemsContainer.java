package fiuba.algo3.tp2.juego.utils;


import fiuba.algo3.tp2.juego.Guardable;

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

    public boolean tieneItem(Guardable item) {
        for (Guardable x: items) {
            if (item.getClass() == x.getClass()) {
                return true;
            }
        }
        return false;
    }

    public int cantidad() {
        return this.items.size();
    }

    public int getCantidadDe(Guardable guardable) {
        int total = 0;
        for (int i = 0; i < this.items.size(); i++) {
            if (guardable.getClass() == this.items.get(i).getClass()) {
                total++;
            }
        }
        return total;
    }


    public Guardable obtener(Guardable item) {
        for (int i = 0; i < this.items.size(); i++){
            if (this.items.get(i).getClass() == item.getClass()){

                return this.items.remove(i);
            }
        }
        return null;
    }
}
