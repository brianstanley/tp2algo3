package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.juego.Juego;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    private static Jugador jugador;
    private static Stage constructorDialog;
    private static Mapa mapa;
    private Navegador navegador;
    protected double width;
    private static GridPane campoDeJuego;
    private static final int FILAS_MAPA = 12;
    private static final int COLUMNAS_MAPA = 12;
    private static final int NAVEGADOR_X_INICIAL = 8;
    private static final int NAVEGADOR_Y_INICIAL = 8;
    private static Stage mainStage;
    private static PlanoConstruccionHerramienta planoConstruccion;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mapa = new Mapa(FILAS_MAPA, COLUMNAS_MAPA);
        this.navegador = new Navegador(NAVEGADOR_X_INICIAL, NAVEGADOR_Y_INICIAL, this.mapa);
        jugador = new Jugador(this.navegador);
        Juego juego = new Juego(this.mapa, this.navegador, jugador);
        JugadorVista jugadorVista = new JugadorVista();
        this.navegador.setVista(jugadorVista);
        juego.inicializacionMateriales();
        planoConstruccion = new PlanoConstruccionHerramienta();
        mainStage = primaryStage;
        this.width = Screen.getPrimary().getVisualBounds().getWidth();
        double heigth = Screen.getPrimary().getVisualBounds().getHeight();

        mainStage.setTitle("Algocraft");

        BorderPane container = new BorderPane();
        campoDeJuego = new GridPane();
        FlowPane menu = this.inicializarSideMenu(mainStage);

        dibujarEscenario();

        container.setCenter(campoDeJuego);
        container.setRight(menu);

        Scene scene = new Scene(container, this.width, heigth);
        mainStage.setScene(scene);
        mainStage.show();
    }

    private FlowPane inicializarSideMenu(Stage primaryStage) {
        MenuPrincipalVista menuPrincipalVista = new MenuPrincipalVista();
        return menuPrincipalVista.dibujar(navegador, jugador);
    }

    public static void dibujarEscenario() {
        CampoDeJuegoVista campoDeJuegoVista = new CampoDeJuegoVista();
        campoDeJuegoVista.dibujar(campoDeJuego, mapa);
    }

    public static VBox getBoxscene() {
        VBox dialogVbox = new VBox(500);
        PlanoConstruccionVista planoVista = new PlanoConstruccionVista(planoConstruccion, constructorDialog, jugador);
        planoVista.dibujar(dialogVbox);
        return dialogVbox;
    }

    public static void redibujarConstructorPopup() {
        constructorDialog.close();
        mostrarConstructorPopup();
    }
    public static void mostrarConstructorPopup() {
        constructorDialog = new Stage();
        constructorDialog.setTitle("Construya su herramienta");
        HBox rootPane = new HBox();
        rootPane.setPadding(new Insets(15, 12, 15, 12));
        rootPane.setSpacing(10);
        Scene scene = new Scene(rootPane, 400, 400);
        PopupConstruccionVista popupConstruccionVista = new PopupConstruccionVista();
        popupConstruccionVista.dibujar(rootPane, planoConstruccion);
        constructorDialog.initModality(Modality.APPLICATION_MODAL);
        constructorDialog.initOwner(mainStage);
        constructorDialog.setScene(scene);
        scene.getStylesheets().add("/game.css");
        constructorDialog.show();
    }

    public static void dibujarInventarioMateriales(Stage parentStage, Posicion posicionClickeada) {
        final Stage dialog = new Stage();
        dialog.setTitle("Seleccione un material de su inventario");
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(parentStage);
        VBox dialogVbox = new VBox(100);
        InventarioMaterialesVista inventarioVista = new InventarioMaterialesVista(planoConstruccion, jugador.getInventario(), constructorDialog, posicionClickeada, dialog);
        inventarioVista.dibujar(dialogVbox);
        Scene dialogScene = new Scene(dialogVbox, 350, 200);
        dialog.setScene(dialogScene);
        dialogScene.getStylesheets().add("/game.css");
        dialog.show();

    }
}
