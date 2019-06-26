package fiuba.algo3.tp2.controller;

import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.vista.Main;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PanelPlanoClickHandler implements EventHandler<MouseEvent> {
    private final Posicion posicionClick;
    private final Jugador jugador;
    private Stage root;
    private PlanoConstruccionHerramienta plano;

    public PanelPlanoClickHandler(Stage dialog, Posicion posicionClick, PlanoConstruccionHerramienta planoConstruccion, Jugador jugador) {
        this.root = dialog;
        this.posicionClick = posicionClick;
        this.plano = planoConstruccion;
        this.jugador = jugador;
    }

    @Override
    public void handle(MouseEvent e) {
        if (!plano.noHayMaterialEnPosicion(posicionClick)) {

            Material material = (Material) plano.getContenidoCasillero(posicionClick);
            jugador.agregarAlInventario(material);
            plano.removerFiguraDePlano(posicionClick);
            Main.redibujarConstructorPopup();
        } else {
            Main.dibujarInventarioMateriales(this.root, posicionClick);
        }
    }
}
