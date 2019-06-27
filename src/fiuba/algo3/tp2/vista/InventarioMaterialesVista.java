package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.juego.Inventario;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.Material;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.util.ArrayList;

public class InventarioMaterialesVista implements Dibujable {


    private final Stage constructorDialog;
    private final Inventario inventario;
    private final Stage dialog;
    private final Posicion posicionClickeada;
    private PlanoConstruccionHerramienta planoConstruccion;

    public InventarioMaterialesVista(PlanoConstruccionHerramienta planoConstruccion, Inventario inventario, Stage constructorDialog, Posicion posicionClickeada, Stage dialog) {
        this.planoConstruccion = planoConstruccion;
        this.inventario = inventario;
        this.constructorDialog = constructorDialog;
        this.posicionClickeada = posicionClickeada;
        this.dialog = dialog;
    }

    @Override
    public void dibujar(Pane root) {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("game-grid");
        for(int i = 0; i < 5; i++) {
            ColumnConstraints column = new ColumnConstraints(40);
            grid.getColumnConstraints().add(column );
        }

        double cantidadItems = (double) inventario.getCantidadMateriales() / 5;

        int cantidadFilas = (int) Math.ceil( cantidadItems);
        for(int i = 0; i < cantidadFilas; i++) {
            RowConstraints row = new RowConstraints(40);
            grid.getRowConstraints().add(row);
        }

        ArrayList<Material> materialesDisponibles = inventario.obtenerMateriales();


        int currentColumn = 0;
        for (int i = 0; i < inventario.getCantidadMateriales(); i++) {
            currentColumn = (int) Math.ceil(i);
            Pane pane = new Pane();
            Material material = materialesDisponibles.get(i);
            MaterialVista materialVista = (MaterialVista) material.dibujo();
            materialVista.dibujoEstatico(pane);
            pane.setOnMouseClicked(e -> {
                planoConstruccion.insertarMaterialEnPosicion(material, posicionClickeada);
                inventario.removerItem(material);
                constructorDialog.close();
                Main.mostrarConstructorPopup();
                dialog.close();
            });
            pane.getStyleClass().add("game-grid-cell");
            if (i == 0) {
                pane.getStyleClass().add("first-column");
            }
            if (currentColumn == 0) {
                pane.getStyleClass().add("first-row");
            }

            grid.add(pane, i, currentColumn);

        }


        root.getChildren().add(grid);
    }
}
