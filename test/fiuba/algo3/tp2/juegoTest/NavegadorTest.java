package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import org.junit.Assert;
import org.junit.Test;

public class NavegadorTest {

    @Test
    public void elNavegadorDevuelveElContenidoDelCasilleroDeEnfente() {
        Mapa mapa = new Mapa(5, 5);
        Navegador navegador = new Navegador(3, 3, mapa);
        Posicion posicionAlNorte = new Posicion(3, 2);
        MaderaMaterial madera = new MaderaMaterial();
        madera.ponerEnMapa(mapa, posicionAlNorte);
        ElementoDeCampo elem = navegador.obtenerElementoEnFrente();
        Assert.assertEquals(madera, elem);
    }
}
