package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparPicoFinoHandler implements EventHandler<ActionEvent> {
    private final Jugador jugador;
    private final PicoFino picoFino;

    public EquiparPicoFinoHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.picoFino = new PicoFino();
    }

    @Override
    public void handle(ActionEvent event){
        this.jugador.equiparHerramienta(picoFino);
    }
}
