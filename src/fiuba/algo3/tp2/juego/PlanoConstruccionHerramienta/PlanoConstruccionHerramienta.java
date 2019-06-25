package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta;


import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.materiales.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.*;

import java.util.ArrayList;
import java.util.List;


public class PlanoConstruccionHerramienta {

    private Guardable[][] plano;
    private LectorDePlanoConstruccion lector;

    public PlanoConstruccionHerramienta() {

        this.plano = new Guardable[3][3];
        this.lector = new LectorDePlanoConstruccion();
    }


    public void insertarMaterialEnPosicion(Guardable unMaterial, Posicion posicion) {

        this.plano[posicion.getX()][posicion.getY()] = unMaterial;
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

    public void vaciar() {

        this.plano = new Guardable[3][3];
    }
}

