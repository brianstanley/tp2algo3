package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Navegador;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

public class Juego {

    private Mapa mapa;
    private Navegador navegador;
    private Jugador jugador;

    public Juego(Mapa mapa, Navegador navegador, Jugador jugador) {
        this.mapa = mapa;
        this.navegador = navegador;
        this.jugador = jugador;
    }

    public void inicializacionMateriales() {
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                MetalMaterial metal = new MetalMaterial();
                Posicion unaPosicion = new Posicion(j, i);
                metal.ponerEnMapa(this.mapa,unaPosicion);
            }
        }

        for (int i = 1; i < 3; i++) {
            for (int j = 5; j < 7; j++) {
                DiamanteMaterial diamante = new DiamanteMaterial();
                Posicion unaPosicion = new Posicion(j, i);
                diamante.ponerEnMapa(this.mapa, unaPosicion);
            }
        }

        for (int i = 4; i < 8; i++) {
            for (int j = 1; j < 5; j++) {
                MaderaMaterial madera = new MaderaMaterial();
                Posicion unaPosicion = new Posicion(j, i);
                madera.ponerEnMapa(this.mapa, unaPosicion);
            }
        }

        for (int i = 4; i < 8; i++) {
            for (int j = 6; j < 8; j++) {
                PiedraMaterial piedra = new PiedraMaterial();
                Posicion unaPosicion = new Posicion(j, i);
                piedra.ponerEnMapa(mapa, unaPosicion);
            }
        }

    }

    public Mapa getMapa(){
        return mapa;
    }

    public Navegador getNavegador(){
        return navegador;
    }
}
