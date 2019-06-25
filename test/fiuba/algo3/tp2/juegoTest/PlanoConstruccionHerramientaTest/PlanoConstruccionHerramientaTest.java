package fiuba.algo3.tp2.juegoTest.PlanoConstruccionHerramientaTest;

import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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
        Posicion posicion = new Posicion(1,1);

        plano.insertarMaterialEnPosicion(madera,posicion);

        Assert.assertTrue(plano.hayMaderaEnPosicion(posicion));
    }

    @Test
    public void seInsertaMaderaEnPosicionYNoHayOtroMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        Posicion posicion = new Posicion(0,1);

        plano.insertarMaterialEnPosicion(madera,posicion);

        Assert.assertFalse(plano.hayPiedraEnPosicion(posicion));
        Assert.assertFalse(plano.hayMetalEnPosicion(posicion));
    }

    @Test
    public void seInsertaPiedraEnPlanoConstruccionHerramienta(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        PiedraMaterial piedra = new PiedraMaterial();
        Posicion posicion = new Posicion(2,1);

        plano.insertarMaterialEnPosicion(piedra,posicion);

        Assert.assertTrue(plano.hayPiedraEnPosicion(posicion));
    }
    @Test
    public void seInsertaPiedraEnPosicionYNoHayOtroMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        PiedraMaterial piedra = new PiedraMaterial();
        Posicion posicion = new Posicion(2,0);

        plano.insertarMaterialEnPosicion(piedra,posicion);

        Assert.assertFalse(plano.hayMaderaEnPosicion(posicion));
        Assert.assertFalse(plano.hayMetalEnPosicion(posicion));
    }


    @Test
    public void seInsertaMetalEnPlanoConstruccionHerramienta(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MetalMaterial metal = new MetalMaterial();
        Posicion posicion = new Posicion(0,2);

        plano.insertarMaterialEnPosicion(metal,posicion);

        Assert.assertTrue(plano.hayMetalEnPosicion(posicion));
    }
    @Test
    public void seInsertaMetalEnPosicionYNoHayOtroMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MetalMaterial metal = new MetalMaterial();
        Posicion posicion = new Posicion(1,2);

        plano.insertarMaterialEnPosicion(metal,posicion);

        Assert.assertFalse(plano.hayMaderaEnPosicion(posicion));
        Assert.assertFalse(plano.hayPiedraEnPosicion(posicion));
    }

    @Test
    public void noSeInsertaMaterialYPlanoConstruccionNoTieneMaterial(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                Assert.assertTrue(plano.noHayMaterialEnPosicion(new Posicion(i,j)));
    }

    @Test
    public void seObtieneFiguraDeHerramientaPuestaEnElPlano(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraConstruible);
    }


    @Test
    public void seObtieneUnaFiguraDeHachaDeMadera(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraHachaMadera);
    }
    @Test
    public void seObtieneUnaFiguraDeHachaDePiedra(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraHachaPiedra);
    }
    @Test
    public void seObtieneUnaFiguraDeHachaDeMetal(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraHachaMetal);
    }


    @Test
    public void seObtieneUnaFiguraDePicoDeMadera(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoMadera);
    }
    @Test
    public void seObtieneUnaFiguraDePicoDePiedra(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoPiedra);
    }
    @Test
    public void seObtieneUnaFiguraDePicoDeMetal(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoMetal);
    }


    @Test
    public void seObtieneUnaFiguraDePicoFinol(){

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

        Assert.assertTrue(plano.obtenerFiguraMapeada() instanceof FiguraPicoFino);
    }

    @Test
    public void seObtienenLosMaterialesIngresadosEnElPlano(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,2));

        List<Guardable> materiales = plano.obtenerMaterialesIngresados();

        Assert.assertTrue(materiales.contains(madera));
        Assert.assertTrue(materiales.contains(piedra));
    }
    @Test
    public void noSeObtienenMaterialesDeUnPlanoVacio(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        List<Guardable> materiales = plano.obtenerMaterialesIngresados();

        Assert.assertTrue(materiales.isEmpty());
    }

    @Test
    public void seVaciaUnPlanoConMateriales(){

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();

        plano.insertarMaterialEnPosicion(new MetalMaterial(), new Posicion(0,0));
        plano.insertarMaterialEnPosicion(new MaderaMaterial(),new Posicion(0,2));
        plano.insertarMaterialEnPosicion(new MaderaMaterial(),new Posicion(1,1));

        plano.vaciar();

        Assert.assertTrue(plano.noHayMaterialEnPosicion(new Posicion(0,0)));
        Assert.assertTrue(plano.noHayMaterialEnPosicion(new Posicion(0,2)));
        Assert.assertTrue(plano.noHayMaterialEnPosicion(new Posicion(1,1)));
    }
}
