package fiuba.algo3.tp2.juego.Mapa;

import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.ExcepcionesMapa.CasilleroOcupadoExcepcion;
import fiuba.algo3.tp2.juego.Navegador.Posicion;

import java.util.ArrayList;

public class Mapa {

    private ArrayList<ArrayList<Casillero>> casilleros = new ArrayList<ArrayList<Casillero>>();

    private int filas;
    private int columnas;

    public Mapa(int cantidadFilas, int cantidadColumnas) {
        this.filas = cantidadFilas;
        this.columnas = cantidadColumnas;
        for (int i = 0; i < filas; i++) {
            ArrayList<Casillero> casilleroColumna = new ArrayList<Casillero>();
            for (int j = 0; j < columnas; j++) {
                casilleroColumna.add(j, new Casillero());
            }
            casilleros.add(i, casilleroColumna);
        }
    }

    public Casillero getCasillero(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return this.casilleros.get(fila).get(columna);
    }

    public boolean estaAfueraDelMapaLaPosicion(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return (fila < 0 || columna < 0 || fila > (this.filas - 1) || columna > (this.columnas - 1));
    }

    public ElementoDeCampo getContenidoCasillero(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return (this.casilleros.get(fila).get(columna)).getContenido();
    }

    public boolean existeElementoEnPosicion(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return (this.casilleros.get(fila).get(columna).getContenido() != null);
    }

    public void setContenidoCasillero(ElementoDeCampo elementoDeCampo, Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        this.casilleros.get(fila).get(columna).setContenido(elementoDeCampo);
    }

    public ElementoDeCampo vaciarContenidoCasillero(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return (this.casilleros.get(fila).get(columna)).eliminarContenido();
    }


}
