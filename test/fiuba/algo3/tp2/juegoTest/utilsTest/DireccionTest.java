package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.juego.*;
import org.junit.Assert;
import org.junit.Test;

public class DireccionTest {

    @Test
    public void direccionNorteLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionNorte direccion = new DireccionNorte();
        Posicion unaPosicon = new Posicion();
        int coordenadaY = unaPosicon.getY();
        direccion.mover(unaPosicon);
        Assert.assertEquals(coordenadaY + 1, unaPosicon.getY());
    }

    @Test
    public void direccionSurLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionSur direccion = new DireccionSur();
        Posicion unaPosicon = new Posicion();
        int coordenadaY = unaPosicon.getY();
        direccion.mover(unaPosicon);
        Assert.assertEquals(coordenadaY - 1,unaPosicon.getY());
    }

    @Test
    public void direccionEsteLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionEste direccion = new DireccionEste();
        Posicion unaPosicon = new Posicion();
        int coordenadaX = unaPosicon.getX();
        direccion.mover(unaPosicon);
        Assert.assertEquals(coordenadaX + 1, unaPosicon.getX());
    }

    @Test
    public void direccionOesteLLamaAMoverYLaDireccionSeVeAfectada(){
        DireccionOeste direccion = new DireccionOeste();
        Posicion unaPosicon = new Posicion();
        int coordenadaX = unaPosicon.getX();
        direccion.mover(unaPosicon);
        Assert.assertEquals(coordenadaX - 1, unaPosicon.getX());
    }
}
