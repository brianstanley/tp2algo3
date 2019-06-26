package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.PanelPlanoClickHandler;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.Material;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class PlanoConstruccionVista implements Dibujable {


    private final Stage constructorDialog;
    private PlanoConstruccionHerramienta planoConstruccion;

    public PlanoConstruccionVista(PlanoConstruccionHerramienta planoConstruccion, Stage constructorDialog) {
        this.planoConstruccion = planoConstruccion;
        this.constructorDialog = constructorDialog;
    }

    @Override
    public void dibujar(Pane root) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("game-grid");

        for(int i = 0; i < planoConstruccion.getColumnas(); i++) {
            ColumnConstraints column = new ColumnConstraints(40);
            grid.getColumnConstraints().add(column );
        }

        for(int i = 0; i < planoConstruccion.getFilas(); i++) {
            RowConstraints row = new RowConstraints(40);
            grid.getRowConstraints().add(row);
        }


        for (int i = 0; i < planoConstruccion.getColumnas(); i++) {
            for (int j = 0; j < planoConstruccion.getFilas(); j++) {
                Pane pane = new Pane();
                PanelPlanoClickHandler paneHandler = new PanelPlanoClickHandler(constructorDialog, j, i, planoConstruccion);
                pane.addEventFilter(MouseEvent.MOUSE_CLICKED, paneHandler);
                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                if (!planoConstruccion.noHayMaterialEnPosicion(j, i)) {
                    Material contenido = (Material) planoConstruccion.getContenidoCasillero(j, i);
                    Dibujable materialVista = contenido.dibujo();
                    materialVista.dibujar(pane);
                }
                grid.add(pane, i, j);
            }
        }

        root.getChildren().add(grid);
    }
}
