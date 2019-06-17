package fiuba.algo3.tp2.juegoTest.MapaConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.LectorDePlanoConstruccion;
import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;



public class LectorDePlanoConstruccionTest {

    @Test
    public void lectorSeIniciaYNoEsNulo(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();

        Assert.assertNotNull(lector);
    }
    @Test
    public void lectorNoReconoceFiguraEnPlanoYDevuelveFiguraDesconocida(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(metal, 0,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);
        mapa.insertarMaterialEnPosicion(piedra,0,2);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraDesconocida);
    }



    @Test
    public void lectorReconoceFiguraDeHachaDeMaderaEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,0);
        mapa.insertarMaterialEnPosicion(madera,0,1);
        mapa.insertarMaterialEnPosicion(madera,1,0);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(lector.evaluarMapa(mapa) instanceof FiguraHachaMadera);
    }
    @Test
    public void lectorReconoceFiguraDeHachaDePiedraEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
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
    public void lectorReconoceFiguraDeHachaDeMetalEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
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
    public void lectorReconoceFiguraDePicoDeMaderaEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera,0,0);
        mapa.insertarMaterialEnPosicion(madera,0,1);
        mapa.insertarMaterialEnPosicion(madera,0,2);
        mapa.insertarMaterialEnPosicion(madera,1,1);
        mapa.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue( lector.evaluarMapa(mapa) instanceof FiguraPicoMadera);
    }
    @Test
    public void lectorReconoceFiguraDePicoDePiedraEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
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
    public void lectorReconoceFiguraDePicoDeMetalEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
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
    public void lectorReconoceFiguraDePicoFinolEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
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
