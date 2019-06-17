package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta;


import fiuba.algo3.tp2.materiales.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;


public class PlanoConstruccionHerramienta {

    private Material[][] mapa;
    private LectorDePlanoConstruccion lector;

    public PlanoConstruccionHerramienta() {

        this.mapa = new Material[3][3];
        this.lector = new LectorDePlanoConstruccion();
    }


    public void insertarMaterialEnPosicion(Material unMaterial, int x, int y) {

        this.mapa[x][y] = unMaterial;
    }



    public boolean hayMaderaEnPosicion(int x, int y) {

        return this.mapa[x][y]  instanceof MaderaMaterial;
    }

    public boolean hayPiedraEnPosicion(int x, int y) {

        return this.mapa[x][y] instanceof PiedraMaterial;
    }

    public boolean hayMetalEnPosicion(int x, int y) {

        return this.mapa[x][y] instanceof MetalMaterial;
    }

    public boolean noHayMaterialEnPosicion(int x, int y) {

        return this.mapa[x][y] == null;
    }


    public FiguraConstruible obtenerFiguraMapeada() {

        return this.lector.evaluarMapa(this);
    }
}

