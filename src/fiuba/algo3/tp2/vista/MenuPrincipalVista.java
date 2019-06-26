package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.controller.BotonHandlerElegirHerramienta;
import fiuba.algo3.tp2.controller.ConstruirBotonHandler;
import fiuba.algo3.tp2.controller.MoverNavegadorHandler;
import fiuba.algo3.tp2.controller.RomperButtonHandler;
import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Navegador.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class MenuPrincipalVista {
    static final int BOTONES_MENU_WIDTH = 170;
    private static Pane panelContenedorHerramienta;

    public FlowPane dibujar(Navegador navegador, Jugador jugador) {
        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 0, 5, 0));
        flow.setVgap(4);
        flow.setHgap(4);
        flow.setPrefWrapLength(170);
        flow.setStyle("-fx-background-color: DAE6F3;");

        MoverNavegadorHandler botonHandlerNorte = new MoverNavegadorHandler(navegador, new DireccionNorte());
        MoverNavegadorHandler botonHandlerSur = new MoverNavegadorHandler(navegador, new DireccionSur());
        MoverNavegadorHandler botonHandlerEste = new MoverNavegadorHandler(navegador, new DireccionEste());
        MoverNavegadorHandler botonHandlerOeste = new MoverNavegadorHandler(navegador, new DireccionOeste());
        BotonHandlerElegirHerramienta botonHandlerElegirHerramienta = new BotonHandlerElegirHerramienta(jugador);

        RomperButtonHandler romperButtonHandler = new RomperButtonHandler(jugador);
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
        m6.setOnAction(romperButtonHandler);
        Button m7 = new Button("Elegir herramienta");
        m7.setOnAction(botonHandlerElegirHerramienta);

        m1.setPrefWidth(BOTONES_MENU_WIDTH);
        m2.setPrefWidth(BOTONES_MENU_WIDTH);
        m3.setPrefWidth(BOTONES_MENU_WIDTH);
        m4.setPrefWidth(BOTONES_MENU_WIDTH);
        m5.setPrefWidth(BOTONES_MENU_WIDTH);
        m6.setPrefWidth(BOTONES_MENU_WIDTH);
        m7.setPrefWidth(BOTONES_MENU_WIDTH);

        panelContenedorHerramienta = new Pane();
        dibujarHerramientaActual(jugador);

        flow.getChildren().addAll(m1, m2, m3, m4, m5, m6, m7, panelContenedorHerramienta);
        return  flow;
    }

    public static void dibujarHerramientaActual(Jugador jugador) {
        panelContenedorHerramienta.getChildren().clear();
        panelContenedorHerramienta.setTranslateY(15);
        Text m8 = new Text("Herramienta Actual ");
        panelContenedorHerramienta.getChildren().add(m8);
        FiguraConstruible herramienta = jugador.getHerramientaActual().getFigura();
        Dibujable vista = herramienta.vista();
        vista.dibujar(panelContenedorHerramienta);
    }
}
