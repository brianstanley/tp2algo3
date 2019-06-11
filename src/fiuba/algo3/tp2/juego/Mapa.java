package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.materiales.Material;

import java.util.ArrayList;

public class Mapa {

    private ArrayList<ArrayList<Casillero>> casilleros = new ArrayList<ArrayList<Casillero>>();

    private int filas = 20;

    private int columnas = 20;

    public Mapa() {
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

    public int getCantidadFilas() {
        return filas;
    }

    public int getCantidadColumnas() {
        return columnas;
    }

    public Material getContenidoCasillero(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return (this.casilleros.get(fila).get(columna)).getMaterialGuardado();
    }

    public boolean existeElementoEnPosicion(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        if (fila < 0 || columna < 0 ||  fila > (filas - 1) || columna > (columnas - 1)) {
            return (true);
        }
        return (this.casilleros.get(fila).get(columna).getMaterialGuardado() != null);
    }

    public void setContenidoCasillero(Material material, Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        this.casilleros.get(fila).get(columna).almacenarMaterial(material);
    }

    public Material vaciarContenidoCasillero(Posicion unaPosicion) {
        int fila = unaPosicion.getY();
        int columna = unaPosicion.getX();
        return (this.casilleros.get(fila).get(columna)).eliminarMaterialAlmacenado();
    }
}
