package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.*;
import fiuba.algo3.tp2.herramientas.picos.*;
import fiuba.algo3.tp2.juego.Herrero;
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

        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera, 0, 0);
        mapa.insertarMaterialEnPosicion(madera, 0, 1);
        mapa.insertarMaterialEnPosicion(madera, 1, 0);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof HachaMadera);
    }

    @Test
    public void herreroRecibeUnPlanoDeHachaDePiedraYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra, 0, 0);
        mapa.insertarMaterialEnPosicion(piedra, 0, 1);
        mapa.insertarMaterialEnPosicion(piedra, 1, 0);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof HachaPiedra);
    }

    @Test
    public void herreroRecibeUnaPlanoDeHachaDeMetalYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal, 0, 0);
        mapa.insertarMaterialEnPosicion(metal, 0, 1);
        mapa.insertarMaterialEnPosicion(metal, 1, 0);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof HachaMetal);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoDeMaderaYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();

        mapa.insertarMaterialEnPosicion(madera, 0, 0);
        mapa.insertarMaterialEnPosicion(madera, 0, 1);
        mapa.insertarMaterialEnPosicion(madera, 0, 2);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof PicoMadera);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoDePiedraYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(piedra, 0, 0);
        mapa.insertarMaterialEnPosicion(piedra, 0, 1);
        mapa.insertarMaterialEnPosicion(piedra, 0, 2);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof PicoPiedra);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoDeMetalYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();

        mapa.insertarMaterialEnPosicion(metal, 0, 0);
        mapa.insertarMaterialEnPosicion(metal, 0, 1);
        mapa.insertarMaterialEnPosicion(metal, 0, 2);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof PicoMetal);
    }

    @Test
    public void herreroRecibeUnPlanoDePicoFinoYConstruyelaHerramienta() {

        Herrero herrero = new Herrero();
        PlanoConstruccionHerramienta mapa = new PlanoConstruccionHerramienta();
        MaderaMaterial madera = new MaderaMaterial();
        MetalMaterial metal = new MetalMaterial();
        PiedraMaterial piedra = new PiedraMaterial();

        mapa.insertarMaterialEnPosicion(metal, 0, 0);
        mapa.insertarMaterialEnPosicion(metal, 0, 1);
        mapa.insertarMaterialEnPosicion(metal, 0, 2);
        mapa.insertarMaterialEnPosicion(piedra, 1, 0);
        mapa.insertarMaterialEnPosicion(madera, 1, 1);
        mapa.insertarMaterialEnPosicion(madera, 2, 1);

        Herramienta herramientaCreada = herrero.construirHerramienta(mapa);

        Assert.assertTrue(herramientaCreada instanceof PicoFino);
    }
}

