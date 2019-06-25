package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.ExcepcionesHerrero.HerreroNoConoceFiguraACrearExcepcion;
import fiuba.algo3.tp2.juego.Herrero;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class HerreroTest {

    @Test
    public void herreroSeIniciaYNoEsNulo() {

        Herrero herrero = new Herrero();

        Assert.assertNotNull(herrero);
    }

    @Test
    public void herreroRecibeUnPlanoDeHachaDeMaderaYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();

        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof HachaMadera);
    }

    @Test
    public void herreroRecibeUnPlanoDeHachaDePiedraYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof HachaPiedra);
    }

    @Test
    public void herreroRecibeUnaPlanoDeHachaDeMetalYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(1,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof HachaMetal);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoDeMaderaYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        plano.insertarMaterialEnPosicion(madera,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof PicoMadera);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoDePiedraYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,0));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof PicoPiedra);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoDeMetalYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,0));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(metal, new Posicion(0,2));
        plano.insertarMaterialEnPosicion(madera,new Posicion(1,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof PicoMetal);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoFinoYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
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

        Herramienta herramientaCreada = herrero.construirHerramienta(plano);

        Assert.assertTrue(herramientaCreada instanceof PicoFino);
    }

    @Test (expected = HerreroNoConoceFiguraACrearExcepcion.class)
    public void herreroRecibeUnPlanoConUnaFiguraDesconocidaYLanzaExcepcion() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta plano = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        plano.insertarMaterialEnPosicion(metal, new Posicion(0,1));
        plano.insertarMaterialEnPosicion(madera,new Posicion(2,1));
        plano.insertarMaterialEnPosicion(piedra,new Posicion(0,2));

        herrero.construirHerramienta(plano);

    }
}


