package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.ConstruirBotonHandler;
import fiuba.algo3.tp2.controller.MoverNavegadorHandler;
import fiuba.algo3.tp2.juego.Juego;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;

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
    static final int ELEMENTOS_WIDTH = 100;
    static final int ELEMENTOS_HEIGTH = 100;
    private static Stage mainStage;

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
        mainStage = primaryStage;
        this.width = Screen.getPrimary().getVisualBounds().getWidth();
        this.heigth = Screen.getPrimary().getVisualBounds().getHeight();

        mainStage.setTitle("Algocraft");

        this.container = new BorderPane();
        this.campoDeJuego = new GridPane();
        FlowPane menu = this.inicializarSideMenu(mainStage);

        this.dibujarEscenario();

        this.container.setCenter(this.campoDeJuego);
        this.container.setRight(menu);

        Scene scene = new Scene(this.container, this.width, this.heigth);
        mainStage.setScene(scene);
        mainStage.show();
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
        Button m1 = new Button("Construir");
        ConstruirBotonHandler construirBtnHandler = new ConstruirBotonHandler();
        m1.setOnAction(construirBtnHandler);
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

    public static void mostrarConstructorPopup() {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(mainStage);
        VBox dialogVbox = new VBox(500);


        int rows = 6;
        int columns = 6;

        GridPane grid = new GridPane();
        grid.getStyleClass().add("game-grid");

        for(int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(40);
            grid.getColumnConstraints().add(column );
        }

        for(int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(40);
            grid.getRowConstraints().add(row);
        }


        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                Pane pane = new Pane();
                pane.setOnMouseReleased(e -> {
                });
                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                ImageView madera = new ImageView(new Image("madera.png"));
                madera.setFitHeight(20);
                madera.setFitWidth(20);
                pane.getChildren().add(madera);
                grid.add(pane, i, j);
            }
        }

        dialogVbox.getChildren().add(grid);
        Scene dialogScene = new Scene(dialogVbox, 500, 500);
        dialog.setScene(dialogScene);
        dialogScene.getStylesheets().add("/game.css");
        dialog.show();
    }
}
