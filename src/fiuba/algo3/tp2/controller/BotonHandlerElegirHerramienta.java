package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.Jugador;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BotonHandlerElegirHerramienta implements EventHandler<ActionEvent> {

    //private final Jugador jugador;

    public BotonHandlerElegirHerramienta(Jugador unJugador){
        //this.jugador = unJugador;
    }

    @Override
    public void handle(ActionEvent event){
        StackPane secondaryLayout = new StackPane();
        Pane pane = new Pane();
        Label etiquetaSeleccionHerramienta = new Label("Seleccione la herramienta que quiere equipar");
        secondaryLayout.getChildren().add(etiquetaSeleccionHerramienta);

        Button b1 = new Button("Hacha de madera");
        b1.setPrefWidth(170);
        b1.setLayoutX(10);
        b1.setLayoutY(10);
        Button b2 = new Button("Hacha de piedra");
        b2.setPrefWidth(170);
        b2.setLayoutX(140);
        b2.setLayoutY(10);
        Button b3 = new Button("Hacha de metal");
        b3.setPrefWidth(170);
        b3.setLayoutX(200);
        b3.setLayoutY(30);
        Button b4 = new Button("Pico de madera");
        b4.setPrefWidth(170);
        b4.setLayoutX(300);
        b4.setLayoutY(40);
        Button b5 = new Button("Pico de piedra");
        b5.setPrefWidth(170);
        b5.setLayoutX(10);
        b5.setLayoutY(100);
        Button b6 = new Button("Pico de metal");
        b6.setPrefWidth(170);
        b6.setLayoutX(240);
        b6.setLayoutY(100);
        Button b7 = new Button("Pico fino");
        b7.setPrefWidth(170);
        b7.setLayoutX(200);
        b7.setLayoutY(350);
        secondaryLayout.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);



        Scene secondScene = new Scene(secondaryLayout, 600, 300);

        // New window (Stage)
        Stage ventanaSeleccionHerramienta = new Stage();
        ventanaSeleccionHerramienta.setTitle("Seleccion herramienta");
        ventanaSeleccionHerramienta.setScene(secondScene);

        // Set position of second window, related to primary window.
        ventanaSeleccionHerramienta.setX( 200);
        ventanaSeleccionHerramienta.setY( 100);

        ventanaSeleccionHerramienta.show();
    }
}
