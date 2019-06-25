package fiuba.algo3.tp2.juegoTest.PlanoConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.LectorDePlanoConstruccion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
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
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,2));

        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraDesconocida);
    }

    @Test
    public void lectorReconoceFiguraDeHachaDeMaderaEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraHachaMadera);
    }

    @Test
    public void lectorReconoceFiguraDeHachaDePiedraEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraHachaPiedra);
    }

    @Test
    public void lectorReconoceFiguraDeHachaDeMetalEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraHachaMetal);
    }

    @Test
    public void lectorReconoceFiguraDePicoDeMaderaEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue( lector.evaluarMapa(plano) instanceof FiguraPicoMadera);
    }

    @Test
    public void lectorReconoceFiguraDePicoDePiedraEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));


        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraPicoPiedra);
    }

    @Test
    public void lectorReconoceFiguraDePicoDeMetalEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraPicoMetal);
    }

    @Test
    public void lectorReconoceFiguraDePicoFinolEnPlanoDeConstruccionDeHerramienta(){

        LectorDePlanoConstruccion lector = new LectorDePlanoConstruccion();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,2));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(lector.evaluarMapa(plano) instanceof FiguraPicoFino);
    }
}
