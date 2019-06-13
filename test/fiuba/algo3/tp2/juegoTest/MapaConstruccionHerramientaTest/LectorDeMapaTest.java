package fiuba.algo3.tp2.juegoTest.MapaConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.LectorDeMapa;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.MapaConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;



public class LectorDeMapaTest {

    @Test
    public void lectorSeIniciaYNoEsNulo(){

        LectorDeMapa lector = new LectorDeMapa();

        Assert.assertNotNull(lector);
    }
    @Test
    public void lectorNoReconoceFiguraEnMapaYDevuelveFiguraDesconocida(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(metal, 0,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);
        mapa.insertarMaterialEnPosicion(piedra,0,2);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraDesconocida);
    }



    @Test
    public void lectorReconoceFiguraDeHachaDeMaderaEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,0);
        mapa.insertarMaterialEnPosicion(madera,0,1);
        mapa.insertarMaterialEnPosicion(madera,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraHachaMadera);
    }
    @Test
    public void lectorReconoceFiguraDeHachaDePiedraEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra,0,0);
        mapa.insertarMaterialEnPosicion(piedra,0,1);
        mapa.insertarMaterialEnPosicion(piedra,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraHachaPiedra);
    }
    @Test
    public void lectorReconoceFiguraDeHachaDeMetalEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal,0,0);
        mapa.insertarMaterialEnPosicion(metal,0,1);
        mapa.insertarMaterialEnPosicion(metal,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraHachaMetal);
    }


    @Test
    public void lectorReconoceFiguraDePicoDeMaderaEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,0);
        mapa.insertarMaterialEnPosicion(madera,0,1);
        mapa.insertarMaterialEnPosicion(madera,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue( lector.evaluarMapa(mapa) instanceof FiguraPicoMadera);
    }
    @Test
    public void lectorReconoceFiguraDePicoDePiedraEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra,0,0);
        mapa.insertarMaterialEnPosicion(piedra,0,1);
        mapa.insertarMaterialEnPosicion(piedra,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraPicoPiedra);
    }
    @Test
    public void lectorReconoceFiguraDePicoDeMetalEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal,0,0);
        mapa.insertarMaterialEnPosicion(metal,0,1);
        mapa.insertarMaterialEnPosicion(metal,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraPicoMetal);
    }


    @Test
    public void lectorReconoceFiguraDePicoFinolEnMapaDeConstruccionDeHerramienta(){

        LectorDeMapa lector = new LectorDeMapa();
        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(metal,0,0);
        mapa.insertarMaterialEnPosicion(metal,0,1);
        mapa.insertarMaterialEnPosicion(metal,0,2);
        mapa.insertarMaterialEnPosicion(piedra,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraPicoFino);
    }

}
