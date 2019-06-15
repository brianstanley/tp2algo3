package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.Navegador.*;
import org.junit.Assert;
import org.junit.Test;

public class DireccionTest {
    @Test
    public void CalcularNuevaPosicionConDireccionNorteAPartirDeUnaPosicion() {
        Posicion unaPosicion = new Posicion(2, 2);
        Direccion unaDireccion = new DireccionNorte();

        Posicion nuevaPosicion = unaDireccion.calcularNuevaPosicionAPartirDe(unaPosicion);

        Assert.assertEquals(unaPosicion.getX(), nuevaPosicion.getX());
        Assert.assertEquals(unaPosicion.getY() - 1, nuevaPosicion.getY());
    }

    @Test
    public void CalcularNuevaPosicionConDireccionEsteAPartirDeUnaPosicion() {
        Posicion unaPosicion = new Posicion(2, 2);
        Direccion unaDireccion = new DireccionEste();

        Posicion nuevaPosicion = unaDireccion.calcularNuevaPosicionAPartirDe(unaPosicion);

        Assert.assertEquals(unaPosicion.getX() + 1, nuevaPosicion.getX());
        Assert.assertEquals(unaPosicion.getY(), nuevaPosicion.getY());
    }

    @Test
    public void CalcularNuevaPosicionConDireccionSurAPartirDeUnaPosicion() {
        Posicion unaPosicion = new Posicion(2, 2);
        Direccion unaDireccion = new DireccionSur();

        Posicion nuevaPosicion = unaDireccion.calcularNuevaPosicionAPartirDe(unaPosicion);

        Assert.assertEquals(unaPosicion.getX(), nuevaPosicion.getX());
        Assert.assertEquals(unaPosicion.getY() + 1, nuevaPosicion.getY());
    }

    @Test
    public void CalcularNuevaPosicionConDireccionOesteAPartirDeUnaPosicion() {
        Posicion unaPosicion = new Posicion(2, 2);
        Direccion unaDireccion = new DireccionOeste();

        Posicion nuevaPosicion = unaDireccion.calcularNuevaPosicionAPartirDe(unaPosicion);

        Assert.assertEquals(unaPosicion.getX() - 1, nuevaPosicion.getX());
        Assert.assertEquals(unaPosicion.getY(), nuevaPosicion.getY());
    }
}
