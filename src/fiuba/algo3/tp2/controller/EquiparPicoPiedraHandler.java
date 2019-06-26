package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.vista.MenuPrincipalVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EquiparPicoPiedraHandler implements EventHandler<ActionEvent> {
    private final Jugador jugador;
    private final PicoPiedra picoPiedra;

    public EquiparPicoPiedraHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.picoPiedra = new PicoPiedra();
    }

    @Override
    public void handle(ActionEvent event){
        this.jugador.equiparHerramienta(picoPiedra);
        MenuPrincipalVista.dibujarHerramientaActual(jugador);

    }
}
