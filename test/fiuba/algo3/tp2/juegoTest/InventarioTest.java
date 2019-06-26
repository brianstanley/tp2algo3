package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.juego.Inventario;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.PiedraMaterial;
import org.junit.Assert;
import org.junit.Test;

public class InventarioTest {
    @Test
    public void seAgrega3ItemsDeMaderaAInventario() {
        Inventario  inventario = new Inventario();
        MaderaMaterial madera = new MaderaMaterial();

        inventario.agregar(madera);
        inventario.agregar(madera);
        inventario.agregar(madera);

        Assert.assertEquals(3, inventario.getCantidadDe(madera));
    }

    @Test
    public void seAgrega4ItemsDePiedraAInventarioYSeRemueve2() {
        Inventario  inventario = new Inventario();
        PiedraMaterial piedra = new PiedraMaterial();

        inventario.agregar(piedra);
        inventario.agregar(piedra);
        inventario.agregar(piedra);
        inventario.agregar(piedra);

        Assert.assertEquals(4, inventario.getCantidadDe(piedra));

        inventario.sacar(piedra);
        inventario.sacar(piedra);

        Assert.assertEquals(2, inventario.getCantidadDe(piedra));
    }

    @Test
    public void seAgregaDosHerramientasAlInventarioYElTamanioEsDos() {
        Inventario  inventario = new Inventario();
        PicoFino picoFino = new PicoFino();
        HachaMadera hacha = new HachaMadera();

        inventario.agregar(picoFino);
        inventario.agregar(hacha);

        Assert.assertEquals(2, inventario.getCantidadItems());
    }

    @Test
    public void seAgrega3VecesLaMismaHerramienta() {
        Inventario  inventario = new Inventario();
        PicoFino picoFino = new PicoFino();

        inventario.agregar(picoFino);
        inventario.agregar(picoFino);
        inventario.agregar(picoFino);

        Assert.assertEquals(3, inventario.getCantidadItems());
    }

    @Test
    public void seAgregaUnHachaDeMaderaYunaPiedraYTieneAmbosItems() {
        Inventario  inventario = new Inventario();
        HachaMadera hacha = new HachaMadera();
        PiedraMaterial piedra = new PiedraMaterial();

        inventario.agregar(hacha);
        inventario.agregar(piedra);

        Assert.assertTrue(inventario.tiene(hacha));
        Assert.assertTrue(inventario.tiene(piedra));
        Assert.assertFalse(inventario.tiene(new HachaMetal()));
    }

    @Test
    public void SeSacaUnMaterialDelInventario(){

        Inventario inventario = new Inventario();
        Material materialMadera = new MaderaMaterial();

        inventario.agregar(materialMadera);

        Assert.assertTrue(inventario.tiene( materialMadera));

        inventario.sacar(materialMadera);

        Assert.assertFalse(inventario.tiene(materialMadera));

    }
    @Test
    public void SeSacaUnaHerramientaDelInventario(){

        Inventario inventario = new Inventario();
        Herramienta hacha = new HachaMadera();

        inventario.agregar(hacha);

        Assert.assertTrue(inventario.tiene( hacha));

        inventario.sacar(hacha);

        Assert.assertFalse(inventario.tiene(hacha));

    }
}
