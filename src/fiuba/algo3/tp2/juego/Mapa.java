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

    public Casillero getCasillero(int fila, int columna) {
        return this.casilleros.get(fila).get(columna);
    }

    public Material getContenidoCasillero(Posicion unaPosicion) {
        int fila =unaPosicion.getColumna();
        int columna = unaPosicion.getFila();
        return (this.casilleros.get(fila).get(columna)).getMaterialGuardado();
    }

    public boolean existeElementoEnPosicion(Posicion unaPosicion) {

    }

    public void setContenidoCasillero(Material material, int fila, int columna) {
        this.casilleros.get(fila).get(columna).almacenarMaterial(material);
    }

    public Material vaciarContenidoCasillero(int fila, int columna) {
        return (this.casilleros.get(fila).get(columna)).eliminarMaterialAlmacenado();
    }
}
