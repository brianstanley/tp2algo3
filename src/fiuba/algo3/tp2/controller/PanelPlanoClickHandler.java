package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.vista.Main;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PanelPlanoClickHandler implements EventHandler<MouseEvent> {
    private final Posicion posicionClick;
    private Stage root;
    private int i;
    private int j;
    private PlanoConstruccionHerramienta plano;

    public PanelPlanoClickHandler(Stage dialog, Posicion posicionClick, PlanoConstruccionHerramienta planoConstruccion) {
        this.root = dialog;
        this.posicionClick = posicionClick;
        this.plano = planoConstruccion;
    }

    @Override
    public void handle(MouseEvent e) {
        if (!plano.noHayMaterialEnPosicion(posicionClick)) {
            plano.removerFiguraDePlano(posicionClick);
            Main.redibujarConstructorPopup();
        } else {
            Main.dibujarInventarioMateriales(this.root, posicionClick);
        }
    }
}
