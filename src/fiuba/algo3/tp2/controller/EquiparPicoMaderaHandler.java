package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.vista.MenuPrincipalVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparPicoMaderaHandler implements EventHandler<ActionEvent>{

    private final Jugador jugador;
    private final PicoMadera picoMadera;

    public EquiparPicoMaderaHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.picoMadera = new PicoMadera();
    }

    @Override
    public void handle(ActionEvent event){

        this.jugador.equiparHerramienta(picoMadera);
        MenuPrincipalVista.dibujarHerramientaActual(jugador);

    }
}
