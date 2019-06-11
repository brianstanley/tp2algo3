package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.juego.*;
import org.junit.Assert;
import org.junit.Test;

public class DireccionTest {

    @Test
    public void direccionNorteLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionNorte direccion = new DireccionNorte();
        Posicion unaPosicion = new Posicion(2, 2);
        int coordenadaY = unaPosicion.getY();
        direccion.mover(unaPosicion);
        Assert.assertEquals(coordenadaY + 1, unaPosicion.getY());
    }

    @Test
    public void direccionSurLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionSur direccion = new DireccionSur();
        Posicion unaPosicion = new Posicion(2, 2);
        int coordenadaY = unaPosicion.getY();
        direccion.mover(unaPosicion);
        Assert.assertEquals(coordenadaY - 1,unaPosicion.getY());
    }

    @Test
    public void direccionEsteLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionEste direccion = new DireccionEste();
        Posicion unaPosicion = new Posicion(2, 2);
        int coordenadaX = unaPosicion.getX();
        direccion.mover(unaPosicion);
        Assert.assertEquals(coordenadaX + 1, unaPosicion.getX());
    }

    @Test
    public void direccionOesteLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionOeste direccion = new DireccionOeste();
        Posicion unaPosicion = new Posicion(2, 2);
        int coordenadaX = unaPosicion.getX();
        direccion.mover(unaPosicion);
        Assert.assertEquals(coordenadaX - 1, unaPosicion.getX());
    }
}
