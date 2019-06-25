package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.MoverNavegadorHandler;
import fiuba.algo3.tp2.controller.RomperButtonHandler;
import fiuba.algo3.tp2.juego.Juego;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    private Jugador jugador;
    private Mapa mapa;
    private Navegador navegador;
    private Juego juego;
    private double width;
    private double heigth;
    private BorderPane container;
    private GridPane campoDeJuego;
    static final int FILAS_MAPA = 12;
    static final int COLUMNAS_MAPA = 12;
    static final int NAVEGADOR_X_INICIAL = 8;
    static final int NAVEGADOR_Y_INICIAL = 8;
    static final int BOTONES_MENU_WIDTH = 170;
    static final int ELEMENTOS_WIDTH = 50;
    static final int ELEMENTOS_HEIGTH = 50;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.mapa = new Mapa(FILAS_MAPA, COLUMNAS_MAPA);
        this.navegador = new Navegador(NAVEGADOR_X_INICIAL, NAVEGADOR_Y_INICIAL, this.mapa);
        this.jugador = new Jugador(this.navegador);
        this.juego = new Juego(this.mapa, this.navegador, this.jugador);
        JugadorVista jugadorVista = new JugadorVista();
        this.navegador.setVista(jugadorVista);
        this.juego.inicializacionMateriales();
        this.width = Screen.getPrimary().getVisualBounds().getWidth();
        this.heigth = Screen.getPrimary().getVisualBounds().getHeight();

        primaryStage.setTitle("Algocraft");

        this.container = new BorderPane();
        this.campoDeJuego = new GridPane();
        FlowPane menu = this.inicializarSideMenu(primaryStage);

        this.dibujarEscenario();

        this.container.setCenter(this.campoDeJuego);
        this.container.setRight(menu);

        Scene scene = new Scene(this.container, this.width, this.heigth);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private FlowPane inicializarSideMenu(Stage primaryStage) {
        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 0, 5, 0));
        flow.setVgap(4);
        flow.setHgap(4);
        flow.setPrefWrapLength(170);
        flow.setStyle("-fx-background-color: DAE6F3;");

        MoverNavegadorHandler botonHandlerNorte = new MoverNavegadorHandler(this.navegador, new DireccionNorte(), this);
        MoverNavegadorHandler botonHandlerSur = new MoverNavegadorHandler(this.navegador, new DireccionSur(), this);
        MoverNavegadorHandler botonHandlerEste = new MoverNavegadorHandler(this.navegador, new DireccionEste(), this);
        MoverNavegadorHandler botonHandlerOeste = new MoverNavegadorHandler(this.navegador, new DireccionOeste(), this);
        RomperButtonHandler romperButtonHandler = new RomperButtonHandler(this.jugador, this);
        Button m1 = new Button("Inventario");
        m1.setOnAction(botonHandlerEste);
        Button m2 = new Button("Norte ↑");
        Direccion direccion = new DireccionNorte();
        m2.setOnAction(botonHandlerNorte);
        Button m3 = new Button("Sur ↓");
        m3.setOnAction(botonHandlerSur);
        Button m4 = new Button("Este ->");
        m4.setOnAction(botonHandlerEste);
        Button m5 = new Button("Oeste <-");
        m5.setOnAction(botonHandlerOeste);
        Button m6 = new Button("Romper");
        m6.setOnAction(botonHandlerOeste);
        m6.setOnAction(romperButtonHandler);

        m1.setPrefWidth(BOTONES_MENU_WIDTH);
        m2.setPrefWidth(BOTONES_MENU_WIDTH);
        m3.setPrefWidth(BOTONES_MENU_WIDTH);
        m4.setPrefWidth(BOTONES_MENU_WIDTH);
        m5.setPrefWidth(BOTONES_MENU_WIDTH);
        m6.setPrefWidth(BOTONES_MENU_WIDTH);

        flow.getChildren().addAll(m1, m2, m3, m4, m5, m6);
        return flow;

    }

    public void dibujarEscenario() {
        this.campoDeJuego.getChildren().clear();
        for (int y = 0; y < FILAS_MAPA; y++) {
            this.campoDeJuego.addColumn(y);
            for (int x = 0; x < COLUMNAS_MAPA; x++) {
                this.campoDeJuego.addRow(x);
                Posicion posicion = new Posicion(x, y);
                if (mapa.existeElementoEnPosicion(posicion)) {
                    Pane pane = new Pane();
                    pane.prefWidth(ELEMENTOS_WIDTH);
                    pane.prefHeight(ELEMENTOS_HEIGTH);
                    Dibujable dibujoVista = mapa.getContenidoCasillero(posicion).dibujo();
                    dibujoVista.dibujar(pane);
                    this.campoDeJuego.add(pane, x, y);
                } else {
                    Pane spring = new Pane();
                    spring.setMinHeight(ELEMENTOS_HEIGTH);
                    spring.setMinWidth(ELEMENTOS_WIDTH);
                    this.campoDeJuego.add(spring, x, y);
                }

            }
        }

    }
}
