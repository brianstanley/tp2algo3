package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.Navegador.Direccion;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.vista.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class MoverNavegadorHandler implements EventHandler<ActionEvent> {

    private final Navegador navegador;
    private final Direccion direccion;
    private final Main main;

    public MoverNavegadorHandler(Navegador navegador, Direccion direccion, Main main) {
        this.navegador = navegador;
        this.direccion = direccion;
        this.main = main;
    }

    @Override
    public void handle(ActionEvent event) {
        this.navegador.moverEnDireccion(direccion);
        main.dibujarEscenario();
    }
}
