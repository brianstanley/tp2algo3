package fiuba.algo3.tp2.vista;

import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class CampoDeJuegoVista {


    static final int ELEMENTOS_WIDTH = 80;
    static final int ELEMENTOS_HEIGTH = 80;
    static final int FILAS_MAPA = 12;
    static final int COLUMNAS_MAPA = 12;

    public void dibujar(GridPane root, Mapa mapa) {
        root.getChildren().clear();
        for (int y = 0; y < FILAS_MAPA; y++) {
            root.addColumn(y);
            for (int x = 0; x < COLUMNAS_MAPA; x++) {
                root.addRow(x);
                Posicion posicion = new Posicion(x, y);
                if (mapa.existeElementoEnPosicion(posicion)) {
                    Pane pane = new Pane();
                    pane.prefWidth(ELEMENTOS_WIDTH);
                    pane.prefHeight(ELEMENTOS_HEIGTH);
                    Dibujable dibujoVista = mapa.getContenidoCasillero(posicion).dibujo();
                    dibujoVista.dibujar(pane);
                    root.add(pane, x, y);
                } else {
                    Pane spring = new Pane();
                    spring.setMinHeight(ELEMENTOS_HEIGTH);
                    spring.setMinWidth(ELEMENTOS_WIDTH);
                    root.add(spring, x, y);
                }

            }
        }
    }
}
