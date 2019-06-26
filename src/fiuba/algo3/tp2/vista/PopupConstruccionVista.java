package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.LectorDePlanoConstruccion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PopupConstruccionVista {

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
        root.getChildren().addAll(pane1,flechaPane, pane2);


    }
}
