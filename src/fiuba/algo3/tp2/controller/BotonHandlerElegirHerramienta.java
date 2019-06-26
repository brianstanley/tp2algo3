package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.Jugador;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BotonHandlerElegirHerramienta implements EventHandler<ActionEvent> {

    private final Jugador jugador;
    private final FlowPane menu;

    public BotonHandlerElegirHerramienta(Jugador unJugador){
        this.jugador = unJugador;
        this.menu = inicializarMenuEquipar(this.jugador);
    }

    @Override
    public void handle(ActionEvent event){

        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(this.menu);

        Scene secondScene = new Scene(secondaryLayout, 350, 180);

        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Seleccionar herramienta");
        newWindow.setScene(secondScene);

        newWindow.show();
    }

    public FlowPane inicializarMenuEquipar( Jugador unJugador){
        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 0, 5, 0));
        flow.setVgap(4);
        flow.setHgap(4);
        flow.setPrefWrapLength(170);
        flow.setStyle("-fx-background-color: DAE6F3;");

        EquiparHachaMaderaHandler handlerHachaMadera = new EquiparHachaMaderaHandler(unJugador);
        EquiparHachaPiedraHandler handlerHachaPiedra = new EquiparHachaPiedraHandler(unJugador);
        EquiparHachaMetalHandler handlerHachaMetal = new EquiparHachaMetalHandler(unJugador);
        EquiparPicoMaderaHandler handlerPicoMadera = new EquiparPicoMaderaHandler(unJugador);
        EquiparPicoPiedraHandler handlerPicoPiedra = new EquiparPicoPiedraHandler(unJugador);
        EquiparPicoMetalHandler handlerPicoMetal = new EquiparPicoMetalHandler(unJugador);
        EquiparPicoFinoHandler handlerPicoFino = new EquiparPicoFinoHandler(unJugador);
        Button m1 = new Button("Hacha Madera");
        m1.setOnAction(handlerHachaMadera);
        Button m2 = new Button("Hacha Piedra");
        m2.setOnAction(handlerHachaPiedra);
        Button m3 = new Button("Hacha Metal");
        m3.setOnAction(handlerHachaMetal);
        Button m4 = new Button("Pico Madera");
        m4.setOnAction(handlerPicoMadera);
        Button m5 = new Button("Pico Piedra");
        m5.setOnAction(handlerPicoPiedra);
        Button m6 = new Button("Pico Metal");
        m6.setOnAction(handlerPicoMetal);
        Button m7 = new Button("Pico Fino");
        m7.setOnAction(handlerPicoFino);

        m1.setPrefWidth(170);
        m2.setPrefWidth(170);
        m3.setPrefWidth(170);
        m4.setPrefWidth(170);
        m5.setPrefWidth(170);
        m6.setPrefWidth(170);
        m7.setPrefWidth(170);

        flow.getChildren().addAll(m1, m2, m3, m4, m5, m6, m7);
        return flow;
    }
}
