package fiuba.algo3.tp2.juego.utils;


import fiuba.algo3.tp2.herramientas.Herramienta;

import java.util.ArrayList;
import java.util.List;

public class HerramientasContainer  {
    private List<Herramienta> herramientas;


    public HerramientasContainer() {
        herramientas = new ArrayList<>();
    }

    public void agregar(Herramienta herramienta) {
        if (!this.tieneHerramienta(herramienta)) {
            this.herramientas.add(herramienta);
        }
    }

    public boolean tieneHerramienta(Herramienta herramienta) {
        for (Herramienta item: herramientas) {
            if (item.getClass() == herramienta.getClass()) {
                return true;
            }
        }
        return false;
    }

    public int cantidad() {
        return this.herramientas.size();
    }
}
