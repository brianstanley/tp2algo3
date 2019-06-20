package fiuba.algo3.tp2.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class JugadorVista implements Dibujable {
    @Override
    public void dibujar(Pane root) {
        ImageView playerImage = new ImageView();
        playerImage.setImage(new Image("jugador.png"));
        playerImage.setFitHeight(40);
        playerImage.setFitWidth(40);
        root.getChildren().add(playerImage);
    }
}
