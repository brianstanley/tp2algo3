package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.vista.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConfirmarConstruccionBotonHandler implements EventHandler<ActionEvent> {

    private final Jugador jugador;
    private final PlanoConstruccionHerramienta planoHerramientas;
    private Herramienta herramienta;

    public ConfirmarConstruccionBotonHandler(Jugador jugador, PlanoConstruccionHerramienta planoConstruccion) {
        this.jugador = jugador;
        this.planoHerramientas = planoConstruccion;
    }

    @Override
    public void handle(ActionEvent event) {
        jugador.crearHerramientaNueva(planoHerramientas);
        planoHerramientas.vaciar();
        Main.cerrarConstructorPopup();
    }

    public void setHerramienta(Herramienta herramienta) {

        this.herramienta = herramienta;
    }
}
