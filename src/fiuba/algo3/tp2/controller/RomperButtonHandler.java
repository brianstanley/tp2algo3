package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.herramientas.herramientaExcepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.vista.Main;
import fiuba.algo3.tp2.vista.MenuPrincipalVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import static fiuba.algo3.tp2.vista.MenuPrincipalVista.dibujarDurabilidadActualInfo;


public class RomperButtonHandler implements EventHandler<ActionEvent> {

    private final Jugador jugador;

    public RomperButtonHandler(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void handle(ActionEvent event) {
        try{
            this.jugador.romper();
            MenuPrincipalVista.dibujarHerramientaActual(jugador);
        } catch (HerramientaRotaExcepcion error) {
            Main.alertaHerramientaRota();
        }
        dibujarDurabilidadActualInfo(jugador);
        Main.dibujarEscenario();
    }
}
