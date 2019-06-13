package fiuba.algo3.tp2.juegoTest;


import fiuba.algo3.tp2.juego.Jugador;
import fiuba.algo3.tp2.juego.Mapa;
import fiuba.algo3.tp2.juego.Navegador;
import fiuba.algo3.tp2.juego.Posicion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import org.junit.Assert;
import org.junit.Test;

public class MapaTest {
    @Test
    public void seCreaElMapaConFilasYColumnasIndicadas() {
        Mapa mapa = new Mapa(20, 20);

        Assert.assertEquals(20, mapa.getCantidadFilas());
        Assert.assertEquals(20, mapa.getCantidadColumnas());
    }


    @Test
    public void alVaciarCasilleroNoExisteMasElemento() {
        Mapa mapa = new Mapa(20, 20);
        Posicion unaPosicion = new Posicion(1, 1);
        Material materialAnterior = mapa.vaciarContenidoCasillero(unaPosicion);

        Assert.assertEquals(false, mapa.existeElementoEnPosicion(unaPosicion));
    }

    @Test
    public void alAlmacenarElementoEnCasilleroVacioExisteElemento() {
        Mapa mapa = new Mapa(20,20);
        Posicion unaPosicion = new Posicion(1, 1);
        MaderaMaterial unaMadera = new MaderaMaterial();

        mapa.setContenidoCasillero(unaMadera, unaPosicion);

        Assert.assertEquals(true, mapa.existeElementoEnPosicion(unaPosicion));
    }

    @Test
    public void sePuedeOcuparUnCasilleroVacioDelTerreno() {
        Mapa mapa = new Mapa(20,20);
        Navegador navegador = new Navegador(5,5, mapa);
        Jugador jugador = new Jugador(navegador);
        Posicion unaPosicionAlNorte = new Posicion(5,6);
        mapa.vaciarContenidoCasillero(unaPosicionAlNorte);
        jugador.moverNorte();

        Assert.assertEquals(unaPosicionAlNorte.getX(), navegador.getPosicionActual().getX());
        Assert.assertEquals(unaPosicionAlNorte.getY(), navegador.getPosicionActual().getY());
    }

   @Test
    public void noSePuedeOcuparUnCasilleroOcupadoDelTerreno() {
        Mapa mapa = new Mapa(20,20);
        Navegador navegador = new Navegador(5,5, mapa);
        Jugador jugador = new Jugador(navegador);
        Posicion unaPosicionAlNorte = new Posicion(5,6);
        MaderaMaterial unaMadera = new MaderaMaterial();
        mapa.setContenidoCasillero(unaMadera, unaPosicionAlNorte);
        jugador.moverNorte();
        Posicion posicionJugador = navegador.getPosicionActual();

        Assert.assertEquals(5, posicionJugador.getX());
        Assert.assertEquals(5, posicionJugador.getY());
    }

    @Test
    public void sePuedeColocarUnMaterialEnUnCasillero(){
        Mapa mapa = new Mapa(20,20);
        MaderaMaterial unaMadera = new MaderaMaterial();
        Posicion unaPosicion = new Posicion(5,5);
        mapa.setContenidoCasillero(unaMadera, unaPosicion);
        Material materialGuardado = mapa.getCasillero(unaPosicion).getMaterialGuardado();
        Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());
    }
}
