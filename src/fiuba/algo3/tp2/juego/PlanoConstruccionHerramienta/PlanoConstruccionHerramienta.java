package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta;


import fiuba.algo3.tp2.materiales.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.*;

import java.util.ArrayList;
import java.util.List;


public class PlanoConstruccionHerramienta {

    private Material[][] plano;
    private LectorDePlanoConstruccion lector;

    public PlanoConstruccionHerramienta() {

        this.plano = new Material[3][3];
        this.lector = new LectorDePlanoConstruccion();
    }


    public void insertarMaterialEnPosicion(Material unMaterial, int x, int y) {

        this.plano[x][y] = unMaterial;
    }



    public boolean hayMaderaEnPosicion(int x, int y) {

        return this.plano[x][y]  instanceof MaderaMaterial;
    }

    public boolean hayPiedraEnPosicion(int x, int y) {

        return this.plano[x][y] instanceof PiedraMaterial;
    }

    public boolean hayMetalEnPosicion(int x, int y) {

        return this.plano[x][y] instanceof MetalMaterial;
    }

    public boolean noHayMaterialEnPosicion(int x, int y) {

        return this.plano[x][y] == null;
    }


    public FiguraConstruible obtenerFiguraMapeada() {

        return this.lector.evaluarMapa(this);
    }

    public List<Material> obtenerMaterialesIngresados() {

        List<Material> materialesCargados = new ArrayList<>();

        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if (!this.noHayMaterialEnPosicion(i,j))
                    materialesCargados.add(this.plano[i][j]);

        return materialesCargados;

    }
}

