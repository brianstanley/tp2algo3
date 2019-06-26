package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.PanelPlanoClickHandler;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.Material;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class PlanoConstruccionVista implements Dibujable {


    private final Stage constructorDialog;
    private final Jugador jugador;
    private PlanoConstruccionHerramienta planoConstruccion;

    public PlanoConstruccionVista(PlanoConstruccionHerramienta planoConstruccion, Stage constructorDialog, Jugador jugador) {
        this.planoConstruccion = planoConstruccion;
        this.constructorDialog = constructorDialog;
        this.jugador = jugador;
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
                Posicion casilleroDelPlano = new Posicion(j, i);
                PanelPlanoClickHandler paneHandler = new PanelPlanoClickHandler(constructorDialog, casilleroDelPlano, planoConstruccion, jugador);
                pane.addEventFilter(MouseEvent.MOUSE_CLICKED, paneHandler);
                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                if (!planoConstruccion.noHayMaterialEnPosicion(casilleroDelPlano)) {
                    Material contenido = (Material) planoConstruccion.getContenidoCasillero(casilleroDelPlano);
                    MaterialVista materialVista = (MaterialVista) contenido.dibujo();
                    materialVista.dibujoEstatico(pane);
                }
                grid.add(pane, i, j);
            }
        }

        root.getChildren().add(grid);
    }
}
