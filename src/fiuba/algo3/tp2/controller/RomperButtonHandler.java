package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.vista.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class RomperButtonHandler implements EventHandler<ActionEvent> {

    private final Jugador jugador;
    private final Main main;

    public RomperButtonHandler(Jugador jugador, Main main) {
        this.jugador = jugador;
        this.main = main;
    }

    @Override
    public void handle(ActionEvent event) {
        this.jugador.romper();
        this.main.dibujarEscenario();
    }
}
