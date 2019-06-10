package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;

public class Jugador {

    private Inventario inventario;

    public Jugador() {

        this.inventario = new Inventario();
        HachaMadera hacha = new HachaMadera();
        this.inventario.agregar(hacha);
    }

    public Inventario getInventario() {
        return this.inventario;
    }


}
