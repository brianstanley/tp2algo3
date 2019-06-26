package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.vista.Main;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PanelPlanoClickHandler implements EventHandler<MouseEvent> {
    private Stage root;
    private int i;
    private int j;
    private PlanoConstruccionHerramienta plano;

    public PanelPlanoClickHandler(Stage dialog, int i, int j, PlanoConstruccionHerramienta planoConstruccion) {
        this.root = dialog;
        this.i = i;
        this.j = j;
        this.plano = planoConstruccion;
    }

    @Override
    public void handle(MouseEvent e) {
        if (!plano.noHayMaterialEnPosicion(i, j)) {
            plano.removerFiguraDePlano(i, j);
            Main.redibujarConstructorPopup();
        } else {
            Main.dibujarInventarioMateriales(this.root, this.i, this.j);
        }
    }
}
