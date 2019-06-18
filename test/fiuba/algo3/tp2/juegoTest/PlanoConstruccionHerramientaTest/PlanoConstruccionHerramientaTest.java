package fiuba.algo3.tp2.juegoTest.PlanoConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class PlanoConstruccionHerramientaTest {

    @Test
    public void seCreaPlanoDeConstruccionDeHerramientaIniciaYNoEsNulo(){

        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        Assert.assertNotNull(mapa);
    }

    @Test
    public void seInsertaMaderaEnPlanoConstruccionHerramienta(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,1,1);

        Assert.assertTrue(plano.hayMaderaEnPosicion(1,1));
    }

    @Test
    public void seInsertaMaderaEnPosicionYNoHayOtroMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,0,1);

        Assert.assertFalse(plano.hayPiedraEnPosicion(0,1));
        Assert.assertFalse(plano.hayMetalEnPosicion(0,1));
    }

    @Test
    public void seInsertaPiedraEnPlanoConstruccionHerramienta(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,2,1);

        Assert.assertTrue(plano.hayPiedraEnPosicion(2,1));
    }
    @Test
    public void seInsertaPiedraEnPosicionYNoHayOtroMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,2,0);

        Assert.assertFalse(plano.hayMaderaEnPosicion(2,0));
        Assert.assertFalse(plano.hayMetalEnPosicion(2,0));
    }


    @Test
    public void seInsertaMetalEnPlanoConstruccionHerramienta(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal,0,2);

        Assert.assertTrue(plano.hayMetalEnPosicion(0,2));
    }
    @Test
    public void seInsertaMetalEnPosicionYNoHayOtroMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal,1,2);

        Assert.assertFalse(plano.hayMaderaEnPosicion(1,2));
        Assert.assertFalse(plano.hayPiedraEnPosicion(1,2));
    }

    @Test
    public void noSeInsertaMaterialYPlanoConstruccionNoTieneMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                Assert.assertTrue(plano.noHayMaterialEnPosicion(i,j));
    }

    @Test
    public void seObtieneFiguraDeHerramientaPuestaEnElPlano(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, 0,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraConstruible);
    }


    @Test
    public void seObtieneUnaFiguraDeHachaDeMadera(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,0,0);
        plano.insertarMaterialEnPosicion(madera,0,1);
        plano.insertarMaterialEnPosicion(madera,1,0);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraHachaMadera);
    }
    @Test
    public void seObtieneUnaFiguraDeHachaDePiedra(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,0,0);
        plano.insertarMaterialEnPosicion(piedra,0,1);
        plano.insertarMaterialEnPosicion(piedra,1,0);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraHachaPiedra);
    }
    @Test
    public void seObtieneUnaFiguraDeHachaDeMetal(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal,0,0);
        plano.insertarMaterialEnPosicion(metal,0,1);
        plano.insertarMaterialEnPosicion(metal,1,0);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraHachaMetal);
    }


    @Test
    public void seObtieneUnaFiguraDePicoDeMadera(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,0,0);
        plano.insertarMaterialEnPosicion(madera,0,1);
        plano.insertarMaterialEnPosicion(madera,0,2);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoMadera);
    }
    @Test
    public void seObtieneUnaFiguraDePicoDePiedra(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,0,0);
        plano.insertarMaterialEnPosicion(piedra,0,1);
        plano.insertarMaterialEnPosicion(piedra,0,2);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoPiedra);
    }
    @Test
    public void seObtieneUnaFiguraDePicoDeMetal(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal,0,0);
        plano.insertarMaterialEnPosicion(metal,0,1);
        plano.insertarMaterialEnPosicion(metal,0,2);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoMetal);
    }


    @Test
    public void seObtieneUnaFiguraDePicoFinol(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(metal,0,0);
        plano.insertarMaterialEnPosicion(metal,0,1);
        plano.insertarMaterialEnPosicion(metal,0,2);
        plano.insertarMaterialEnPosicion(piedra,1,0);
        plano.insertarMaterialEnPosicion(madera,1,1);
        plano.insertarMaterialEnPosicion(madera,2,1);

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoFino);
    }

}
