package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;

public class Juego {

    static Mapa mapa;
    static Navegador navegador;
    static Jugador jugador;
    public static void main(String [] args) {
        mapa = new Mapa(20, 20);
        navegador = new Navegador(2, 2, mapa);
        jugador = new Jugador(navegador);
        inicializacionMateriales();
    }

    private static void inicializacionMateriales() {
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                MetalMaterial metal = new MetalMaterial();
                Posicion unaPosicion = new Posicion(i, j);
                mapa.setContenidoCasillero(metal, unaPosicion);
            }
        }

        for (int i = 1; i < 3; i++) {
            for (int j = 5; j < 7; j++) {
                DiamanteMaterial diamante = new DiamanteMaterial();
                Posicion unaPosicion = new Posicion(i, j);
                mapa.setContenidoCasillero(diamante, unaPosicion);
            }
        }

        for (int i = 4; i < 8; i++) {
            for (int j = 1; j < 5; j++) {
                MaderaMaterial diamante = new MaderaMaterial();
                Posicion unaPosicion = new Posicion(i, j);
                mapa.setContenidoCasillero(diamante, unaPosicion);
            }
        }

    }
}
