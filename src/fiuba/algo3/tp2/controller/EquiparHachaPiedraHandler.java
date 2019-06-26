package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class EquiparHachaPiedraHandler implements EventHandler<ActionEvent>{

    private final Jugador jugador;
    private final HachaPiedra hachaPiedra;

    public EquiparHachaPiedraHandler(Jugador unJugador){
        this.jugador = unJugador;
        this.hachaPiedra = new HachaPiedra();
    }

    @Override
    public void handle(ActionEvent event){
        this.jugador.equiparHerramienta(hachaPiedra);
    }
}
