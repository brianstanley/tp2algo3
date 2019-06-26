package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparPicoMetalHandler implements EventHandler<ActionEvent> {
    private final Jugador jugador;
    private final PicoMetal picoMetal;

    public EquiparPicoMetalHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.picoMetal = new PicoMetal();
    }

    @Override
    public void handle(ActionEvent event){
        this.jugador.equiparHerramienta(picoMetal);
    }
}
