package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta;


import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.FiguraConstruible;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;

import java.util.ArrayList;
import java.util.List;


public class PlanoConstruccionHerramienta {

    private Guardable[][] plano;
    private LectorDePlanoConstruccion lector;
    private int FILAS = 3;
    private int COLUMNAS = 3;

    public PlanoConstruccionHerramienta() {

        this.plano = new Guardable[FILAS][COLUMNAS];
        this.lector = new LectorDePlanoConstruccion();
    }


    public void insertarMaterialEnPosicion(Guardable unMaterial, Posicion posicion) {

        this.plano[posicion.getX()][posicion.getY()] = unMaterial;
    }

    public void removerFiguraDePlano(Posicion posicion) {
        this.plano[posicion.getX()][posicion.getY()] = null;
    }

    public Guardable getContenidoCasillero(int x, int y) {
        return this.plano[x][y];
    }

    public boolean hayMaderaEnPosicion(Posicion posicion) {

        return this.plano[posicion.getX()][posicion.getY()]  instanceof MaderaMaterial;
    }

    public boolean hayPiedraEnPosicion(Posicion posicion) {

        return this.plano[posicion.getX()][posicion.getY()] instanceof PiedraMaterial;
    }

    public boolean hayMetalEnPosicion(Posicion posicion) {

        return this.plano[posicion.getX()][posicion.getY()] instanceof MetalMaterial;
    }

    public boolean noHayMaterialEnPosicion(Posicion posicion) {

        return this.plano[posicion.getX()][posicion.getY()] == null;
    }


    public FiguraConstruible obtenerFiguraMapeada() {

        return this.lector.evaluarMapa(this);
    }

    public List<Guardable> obtenerMaterialesIngresados() {

        List<Guardable> materialesCargados = new ArrayList<>();

        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if (!this.noHayMaterialEnPosicion(new Posicion(i,j)))
                    materialesCargados.add(this.plano[i][j]);

        return materialesCargados;

    }

    public Guardable[][] getPlano() {
        return this.plano;
    }

    public int getFilas() {
        return this.FILAS;
    }

    public int getColumnas(){
        return this.COLUMNAS;
    }

    public void vaciar() {

        this.plano = new Guardable[3][3];
    }
}

