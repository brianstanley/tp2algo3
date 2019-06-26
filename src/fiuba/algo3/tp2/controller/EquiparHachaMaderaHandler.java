package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.vista.MenuPrincipalVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparHachaMaderaHandler implements EventHandler<ActionEvent> {

    private final Jugador jugador;
    private final HachaMadera hachaMadera;

    public EquiparHachaMaderaHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.hachaMadera = new HachaMadera();
    }

    @Override
    public void handle(ActionEvent event){
        this.jugador.equiparHerramienta(hachaMadera);
        MenuPrincipalVista.dibujarHerramientaActual(jugador);
    }
}
