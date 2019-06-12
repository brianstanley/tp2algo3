package fiuba.algo3.tp2.juegoTest.MapaConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.MapaConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class MapaConstruccionHerramientaTest {

    @Test
    public void seCreaMapaDeConstruccionDeHerramientaIniciaYNoEsNulo(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        Assert.assertNotNull(mapa);
    }

    @Test
    public void seInsertaMaderaEnMapaConstruccionHerramienta(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,1,1);

        Assert.assertTrue(mapa.hayMaderaEnPosicion(1,1));
    }
    @Test
    public void seInsertaMaderaEnPosicionYNoHayOtroMaterial(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,1);

        Assert.assertFalse(mapa.hayPiedraEnPosicion(0,1));
        Assert.assertFalse(mapa.hayMetalEnPosicion(0,1));
    }

    @Test
    public void seInsertaPiedraEnMapaConstruccionHerramienta(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra,2,1);

        Assert.assertTrue(mapa.hayPiedraEnPosicion(2,1));
    }
    @Test
    public void seInsertaPiedraEnPosicionYNoHayOtroMaterial(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra,2,0);

        Assert.assertFalse(mapa.hayMaderaEnPosicion(2,0));
        Assert.assertFalse(mapa.hayMetalEnPosicion(2,0));
    }


    @Test
    public void seInsertaMetalEnMapaConstruccionHerramienta(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal,0,2);

        Assert.assertTrue(mapa.hayMetalEnPosicion(0,2));
    }
    @Test
    public void seInsertaMetalEnPosicionYNoHayOtroMaterial(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal,1,2);

        Assert.assertFalse(mapa.hayMaderaEnPosicion(1,2));
        Assert.assertFalse(mapa.hayPiedraEnPosicion(1,2));
    }

    @Test
    public void noSeInsertaMaterialYMapaConstruccionNoTieneMaterial(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                Assert.assertTrue(mapa.noHayMaterialEnPosicion(i,j));
    }

    @Test
    public void seObtieneFiguraDeHerramientaPuestaEnElMapa(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal, 0,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraDeHerramienta);
    }


    @Test
    public void seObtieneUnaFiguraDeHachaDeMadera(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,0);
        mapa.insertarMaterialEnPosicion(madera,0,1);
        mapa.insertarMaterialEnPosicion(madera,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraHachaMadera);
    }
    @Test
    public void seObtieneUnaFiguraDeHachaDePiedra(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra,0,0);
        mapa.insertarMaterialEnPosicion(piedra,0,1);
        mapa.insertarMaterialEnPosicion(piedra,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraHachaPiedra);
    }
    @Test
    public void seObtieneUnaFiguraDeHachaDeMetal(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal,0,0);
        mapa.insertarMaterialEnPosicion(metal,0,1);
        mapa.insertarMaterialEnPosicion(metal,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraHachaMetal);
    }


    @Test
    public void seObtieneUnaFiguraDePicoDeMadera(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,0);
        mapa.insertarMaterialEnPosicion(madera,0,1);
        mapa.insertarMaterialEnPosicion(madera,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraPicoMadera);
    }
    @Test
    public void seObtieneUnaFiguraDePicoDePiedra(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra,0,0);
        mapa.insertarMaterialEnPosicion(piedra,0,1);
        mapa.insertarMaterialEnPosicion(piedra,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraPicoPiedra);
    }
    @Test
    public void seObtieneUnaFiguraDePicoDeMetal(){

        MapaConstruccionHerramienta mapa = new MapaConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal,0,0);
        mapa.insertarMaterialEnPosicion(metal,0,1);
        mapa.insertarMaterialEnPosicion(metal,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraPicoMetal);
    }


    @Test
    public void seObtieneUnaFiguraDePicoFinol(){

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

        Assert.assertTrue(mapa.obtenerFiguraMapeada() instanceof FiguraPicoFino);
    }

}
