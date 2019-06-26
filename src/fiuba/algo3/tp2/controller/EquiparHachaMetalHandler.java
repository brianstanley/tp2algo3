package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.vista.MenuPrincipalVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparHachaMetalHandler implements EventHandler<ActionEvent> {

    private final Jugador jugador;
    private final HachaMetal hachaMetal;

    public EquiparHachaMetalHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.hachaMetal = new HachaMetal();
    }

    @Override
    public void handle(ActionEvent event){
        this.jugador.equiparHerramienta(hachaMetal);
        MenuPrincipalVista.dibujarHerramientaActual(jugador);

    }
}
