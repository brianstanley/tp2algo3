package fiuba.algo3.tp2.juego;

public interface ElementoDeCampo {

    void ponerEnMapa(Mapa mapa, Posicion posicion);

    void quitarDelMapa(Mapa mapa, Posicion posicion);

    void retractarMovimiento();
}
