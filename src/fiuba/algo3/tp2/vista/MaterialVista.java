package fiuba.algo3.tp2.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MaterialVista implements Dibujable {

    private String dibujo;

    public MaterialVista(String dibujo) {
        this.dibujo = dibujo;
    }

    @Override
    public void dibujar(Pane root) {
        ImageView materialImagen = new ImageView();
        materialImagen.setImage(new Image(dibujo));
        materialImagen.setFitWidth(40);
        materialImagen.setFitHeight(40);
        root.getChildren().add(materialImagen);
    }
}
