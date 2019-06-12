package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta;

import fiuba.algo3.tp2.juego.Casillero;
import fiuba.algo3.tp2.materiales.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import org.junit.Test;

public class MapaConstruccionHerramienta {

    private Casillero[][] mapa;
    private LectorDeMapa lector;

    public MapaConstruccionHerramienta() {

        this.mapa = new Casillero[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                mapa[i][j] = new Casillero();

        this.lector = new LectorDeMapa();
    }


    public void insertarMaterialEnPosicion(Material unMaterial, int x, int y) {

        this.mapa[x][y].almacenarMaterial(unMaterial);
    }



    public boolean hayMaderaEnPosicion(int x, int y) {

        return this.mapa[x][y].getMaterialGuardado() instanceof MaderaMaterial;
    }

    public boolean hayPiedraEnPosicion(int x, int y) {

        return this.mapa[x][y].getMaterialGuardado() instanceof PiedraMaterial;
    }

    public boolean hayMetalEnPosicion(int x, int y) {

        return this.mapa[x][y].getMaterialGuardado() instanceof MetalMaterial;
    }

    public boolean noHayMaterialEnPosicion(int x, int y) {

        return this.mapa[x][y].getMaterialGuardado() == null;
    }


    public FiguraDeHerramienta obtenerFiguraMapeada() {

        return this.lector.evaluarMapa(this);
    }
}

