package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.juego.Posicion;
import org.junit.Assert;
import org.junit.Test;

public class PosicionTest {

    @Test
    public void seCreaInstanciaNoNulaDePosicion(){
        Posicion unaPosicion = new Posicion();
        Assert.assertNotNull(unaPosicion);
    }

    @Test
    public void cuandoSeLLamaMoverEsteLaCoordenadaXAumentaEnUnaUnidad(){
        Posicion unaPosicion = new Posicion();
        int posicionX = unaPosicion.getX();
        unaPosicion.moverEste();
        Assert.assertEquals(posicionX + 1, unaPosicion.getX());
    }

    @Test
    public void cuandoSeLLamaMoverNorteLaCoordenadaYAumentaEnUnaUnidad(){
        Posicion unaPosicion = new Posicion();
        int posicionY = unaPosicion.getY();
        unaPosicion.moverNorte();
        Assert.assertEquals(posicionY + 1, unaPosicion.getY());
    }

    @Test
    public void cuandoSeLLamaMoverOesteLaCoordenadaXDisminuyeEnUnaUnidad(){
        Posicion unaPosicion = new Posicion();
        int posicionX = unaPosicion.getX();
        unaPosicion.moverOeste();
        Assert.assertEquals(posicionX - 1, unaPosicion.getX());
    }

    @Test
    public void cuandoSeLLamaMoverSurLaCoordenadaYDisminuyeEnUnaUnidad(){
        Posicion unaPosicion = new Posicion();
        int posicionY = unaPosicion.getY();
        unaPosicion.moverSur();
        Assert.assertEquals(posicionY - 1, unaPosicion.getY());
    }
}
