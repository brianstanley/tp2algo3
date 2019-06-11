package fiuba.algo3.tp2.juegoTest;


import fiuba.algo3.tp2.juego.Mapa;
import fiuba.algo3.tp2.juego.Posicion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import org.junit.Assert;
import org.junit.Test;

public class MapaTest {
    @Test
    public void seCreaElMapaConVeinteFilasYConVeinteColumnas() {
        Mapa mapa = new Mapa();

        Assert.assertEquals(20, mapa.getCantidadFilas());
        Assert.assertEquals(20, mapa.getCantidadColumnas());
    }


    @Test
    public void alVaciarCasilleroNoExisteMasElemento() {
        Mapa mapa = new Mapa();
        Posicion unaPosicion = new Posicion(1, 1);
        Material materialAnterior = mapa.vaciarContenidoCasillero(unaPosicion);

        Assert.assertEquals(false, mapa.existeElementoEnPosicion(unaPosicion));
    }

    @Test
    public void alAlmacenarElementoEnCasilleroVacioExisteElemento() {
        Mapa mapa = new Mapa();
        Posicion unaPosicion = new Posicion(1, 1);
        MaderaMaterial unaMadera = new MaderaMaterial();

        mapa.setContenidoCasillero(unaMadera, unaPosicion);

        Assert.assertEquals(true, mapa.existeElementoEnPosicion(unaPosicion));
    }

}
