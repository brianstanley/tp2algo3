package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.vista.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConstruirBotonHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Main.mostrarConstructorPopup();
    }
}
