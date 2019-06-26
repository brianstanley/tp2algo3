package fiuba.algo3.tp2.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MaterialVista implements Dibujable {

    private final int durabilidadInicial;
    private String dibujo;
    private int durabilidadActual;

    public MaterialVista(String dibujo, int durabilidadInicial) {
        this.dibujo = dibujo;
        this.durabilidadInicial = durabilidadInicial;
    }

    public void setDurabilidadActual(int durabilidadActual) {
        this.durabilidadActual = durabilidadActual;
    }

    @Override
    public void dibujar(Pane root) {
        int calculo = (durabilidadActual * 100) / durabilidadInicial;
        calculo = 100 - calculo;
        int sizeReduccion = 0;
        if (durabilidadActual != durabilidadInicial) {
            sizeReduccion = (40 * calculo) / 100;
        }
        ImageView materialImagen = new ImageView();
        materialImagen.setImage(new Image(dibujo));
        materialImagen.setFitWidth(40 - sizeReduccion);
        materialImagen.setFitHeight(40 - sizeReduccion);
        root.getChildren().add(materialImagen);
    }

    public void dibujoEstatico(Pane root) {
        ImageView materialImagen = new ImageView();
        materialImagen.setImage(new Image(dibujo));
        materialImagen.setFitWidth(40);
        materialImagen.setFitHeight(40);
        root.getChildren().add(materialImagen);
    }
}
