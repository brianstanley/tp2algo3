package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Posicion;

public interface ElementoDeCampo {

    void ponerEnMapa(Mapa mapa, Posicion posicion);

    void quitarDelMapa(Mapa mapa, Posicion posicion);

    void retractarMovimiento();
}
