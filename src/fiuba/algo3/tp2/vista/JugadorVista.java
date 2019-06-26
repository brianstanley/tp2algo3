package fiuba.algo3.tp2.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class JugadorVista implements Dibujable {
    Pane root = null;
    ImageView playerImage;
    int factorActual = 1;

    public JugadorVista() {
        playerImage = new ImageView();
        playerImage.setImage(new Image("jugador.png"));
        playerImage.setFitHeight(40);
        playerImage.setFitWidth(40);
    }
    @Override
    public void dibujar(Pane root) {
        root.getChildren().add(playerImage);
    }

    public void cambiarEspejo(int factor) {
        if (this.factorActual != factor && factor != 0) {
            if (factor == 1 && playerImage.getScaleX() < 0) {
                playerImage.setScaleX(playerImage.getScaleX() * - factor);
                playerImage.setScaleY(Math.abs(playerImage.getScaleY()));
            } else if(factor == 2) {
                playerImage.setScaleY(playerImage.getScaleY() * -1);
            }else if(factor==3) {
                playerImage.setScaleY(Math.abs(playerImage.getScaleY()));
            }else {
                playerImage.setScaleY(Math.abs(playerImage.getScaleY()));
                playerImage.setScaleX(playerImage.getScaleX() * factor);
            }
            this.factorActual = factor;
        }
    }
}
