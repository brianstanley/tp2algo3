package fiuba.algo3.tp2.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HerramientaVista implements Dibujable {

    private String dibujo;

    public HerramientaVista(String dibujo) {
        this.dibujo = dibujo;
    }

    @Override
    public void dibujar(Pane root) {
        ImageView herramientaImagen = new ImageView();
        herramientaImagen.setImage(new Image(dibujo));
        herramientaImagen.setFitWidth(40);
        herramientaImagen.setFitHeight(40);
        root.getChildren().add(herramientaImagen);
    }
}
