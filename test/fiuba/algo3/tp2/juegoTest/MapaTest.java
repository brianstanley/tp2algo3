package fiuba.algo3.tp2.juegoTest;


import fiuba.algo3.tp2.juego.*;
import fiuba.algo3.tp2.juego.ExcepcionesMapa.CasilleroOcupadoExcepcion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import org.junit.Assert;
import org.junit.Test;

public class MapaTest {
    @Test
    public void seCreaElMapaYNoEsNulo() {
        Mapa mapa = new Mapa(20, 20);
        Assert.assertNotNull(mapa);
    }


    @Test
    public void alVaciarCasilleroNoExisteMasElemento() {
        Mapa mapa = new Mapa(20, 20);
        Posicion unaPosicion = new Posicion(1, 1);
        ElementoDeCampo elementoAnterior = mapa.vaciarContenidoCasillero(unaPosicion);

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
        Posicion unaPosicionAlNorte = new Posicion(5,4);
        jugador.moverNorte();

        Assert.assertEquals(unaPosicionAlNorte.getX(), navegador.getPosicionActual().getX());
        Assert.assertEquals(unaPosicionAlNorte.getY(), navegador.getPosicionActual().getY());
    }

   @Test
    public void noSePuedeOcuparUnCasilleroOcupadoDelTerreno() {
        Mapa mapa = new Mapa(20,20);
        Navegador navegador = new Navegador(5,5, mapa);
        Posicion posInicialNav = navegador.getPosicionActual();
        Jugador jugador = new Jugador(navegador);
        Posicion unaPosicionAlNorte = new Posicion(5,4);
        MaderaMaterial unaMadera = new MaderaMaterial();
        mapa.setContenidoCasillero(unaMadera, unaPosicionAlNorte);
        jugador.moverNorte();
        Assert.assertEquals(posInicialNav.getX(), navegador.getPosicionActual().getX());
        Assert.assertEquals(posInicialNav.getY(), navegador.getPosicionActual().getY());
    }

    @Test
    public void ElNavegadorNoPuedeSalirDelMapa(){
        Mapa mapa = new Mapa(2,2);
        Navegador navegador = new Navegador(0,0, mapa);
        Posicion posNavIn = navegador.getPosicionActual();
        Jugador jugador = new Jugador(navegador);
        jugador.moverNorte();
        Assert.assertEquals(posNavIn.getX(), navegador.getPosicionActual().getX());
        Assert.assertEquals(posNavIn.getY(), navegador.getPosicionActual().getY());
    }

    @Test
    public void sePuedeColocarUnMaterialEnUnCasillero(){
        Mapa mapa = new Mapa(20,20);
        MaderaMaterial unaMadera = new MaderaMaterial();
        Posicion unaPosicion = new Posicion(5,5);
        mapa.setContenidoCasillero(unaMadera, unaPosicion);
        ElementoDeCampo materialGuardado = mapa.getCasillero(unaPosicion).getContenido();
        Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());
    }

}
