package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.ConfirmarConstruccionBotonHandler;
import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.LectorDePlanoConstruccion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;


public class PopupConstruccionVista {

    private final Jugador jugador;

    public PopupConstruccionVista(Jugador jugador) {
        this.jugador = jugador;
    }

    public void dibujar(HBox root, PlanoConstruccionHerramienta planoConstruccion) {
        Pane flechaPane = new Pane();
        ImageView flecha = new ImageView();
        flecha.setImage(new Image("result.png"));
        flecha.setTranslateY(15);
        flecha.setFitWidth(30);
        flecha.setFitHeight(30);
        flechaPane.getChildren().add(flecha);
        Pane pane1 = new Pane();
        VBox dialogVbox = Main.getBoxscene();
        pane1.getChildren().add(dialogVbox);
        Pane pane2 = new Pane();
        VBox result = new VBox(500);
        GridPane grid = new GridPane();
        grid.getStyleClass().add("game-grid");
        grid.addColumn(0);
        grid.addRow(0);

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();

        FiguraConstruible figura = lector.evaluarMapa(planoConstruccion);

        Pane pane = new Pane();
        pane.getStyleClass().add("game-grid-cell");
        pane.getStyleClass().add("first-row");
        pane.getStyleClass().add("first-column");

        Dibujable herramientaFigura = figura.dibujo();
        herramientaFigura.dibujar(pane);

        grid.add(pane, 0, 0);

        result.getChildren().add(grid);
        pane2.getChildren().add(result);

        Pane panelParaConfirmar = new Pane();
        Button botonConfirmar = new Button();
        botonConfirmar.setText("Confirmar Creacion");
        ConfirmarConstruccionBotonHandler confirmarHandler = new ConfirmarConstruccionBotonHandler(jugador, planoConstruccion);
        botonConfirmar.setOnAction(confirmarHandler);
        botonConfirmar.setDisable(true);
        if (figura.esFiguraValida()) {
            Herramienta herramienta = figura.construir();
            confirmarHandler.setHerramienta(herramienta);
            botonConfirmar.setDisable(false);
        }

        panelParaConfirmar.getChildren().add(botonConfirmar);

        root.getChildren().addAll(pane1,flechaPane, pane2, panelParaConfirmar);


    }
}
