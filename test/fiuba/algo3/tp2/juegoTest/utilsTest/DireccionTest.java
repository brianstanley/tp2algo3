package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.juego.*;
import org.junit.Assert;
import org.junit.Test;

public class DireccionTest {

    @Test
    public void direccionNorteLLamaAMoverYDevuelveLaMismaDireccioin(){
        DireccionNorte direccion = new DireccionNorte();
        Posicion unaPosicon = new Posicion();
        Posicion posicionDevuelta = direccion.mover(unaPosicon);
        Assert.assertEquals(posicionDevuelta, unaPosicon);
    }

    @Test
    public void direccionSurLLamaAMoverYDevuelveLaMismaDireccioin(){
        DireccionSur direccion = new DireccionSur();
        Posicion unaPosicon = new Posicion();
        Posicion posicionDevuelta = direccion.mover(unaPosicon);
        Assert.assertEquals(posicionDevuelta, unaPosicon);
    }

    @Test
    public void direccionEsteLLamaAMoverYDevuelveLaMismaDireccioin(){
        DireccionEste direccion = new DireccionEste();
        Posicion unaPosicon = new Posicion();
        Posicion posicionDevuelta = direccion.mover(unaPosicon);
        Assert.assertEquals(posicionDevuelta, unaPosicon);
    }

    @Test
    public void direccionOesteLLamaAMoverYDevuelveLaMismaDireccioin(){
        DireccionOeste direccion = new DireccionOeste();
        Posicion unaPosicon = new Posicion();
        Posicion posicionDevuelta = direccion.mover(unaPosicon);
        Assert.assertEquals(posicionDevuelta, unaPosicon);
    }
}
