package fiuba.algo3.tp2.juego.utils;

import fiuba.algo3.tp2.materiales.Material;

import java.util.LinkedHashMap;

public class MaterialesContainer {
    private LinkedHashMap<Material, Integer> materiales;

    public MaterialesContainer() {
        this.materiales = new LinkedHashMap<>();
    }


    public void agregar(Material unMaterial) {

        this.materiales.merge(unMaterial, 1, Integer::sum);
    }

    public int getCantidadDe(Material unMaterial) {

        if (!this.materiales.containsKey(unMaterial)) {
            return 0;
        }
        return this.materiales.get(unMaterial);
    }

    public void remover(Material unMaterial) {
        this.materiales.remove(unMaterial);
    }

    public void decrementarCantidadDe(Material unMaterial) {
        if (this.materiales == null) return;
        if (this.materiales.get(unMaterial) == 1) {
            this.remover(unMaterial);
            return;
        }
        this.materiales.put(unMaterial, this.materiales.get(unMaterial) - 1);
    }
}
