package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.juego.utils.ItemsContainer;
import fiuba.algo3.tp2.materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class ItemsContainerTest {

    @Test
    public void containerIniciaYNoEsNulo(){

        ItemsContainer container = new ItemsContainer();

        Assert.assertNotNull(container);
    }

    @Test
    public void containerAgregaGuardables(){

        ItemsContainer container = new ItemsContainer();

        Guardable guardableMadera = new MaderaMaterial();
        Guardable guardableMetal = new MetalMaterial();
        Guardable guardablePico = new PicoFino();
        Guardable guardableHacha = new HachaPiedra();

        container.agregar(guardableHacha);
        container.agregar(guardableMadera);
        container.agregar(guardableMetal);
        container.agregar(guardablePico);

        Assert.assertEquals(4, container.cantidad());

    }

    @Test
    public void containerTieneItemGuardable(){

        ItemsContainer container = new ItemsContainer();

        Guardable guardableMaterial = new MaderaMaterial();

        container.agregar(guardableMaterial);

        Assert.assertTrue(container.tieneItem(guardableMaterial));

    }

    @Test
    public void containerDevulveLaCantidadQueTieneDeUnItem(){

        ItemsContainer container = new ItemsContainer();

        Guardable guardableMadera1 = new MaderaMaterial();
        Guardable guardableMadera2 = new MaderaMaterial();
        Guardable guardableMadera3 = new MaderaMaterial();

        container.agregar(guardableMadera1);
        container.agregar(guardableMadera2);
        container.agregar(guardableMadera3);

        Assert.assertEquals(3, container.getCantidadDe(new MaderaMaterial()));
    }

    @Test
    public void containerDevuelveUnitemQuePoseeYYaNoLoPosee(){

        ItemsContainer container = new ItemsContainer();
        Guardable guardableHacha = new HachaPiedra();

        container.agregar(guardableHacha);

        Assert.assertTrue(container.tieneItem(guardableHacha));

        Guardable itemObtenido = container.obtener(new HachaPiedra());

        Assert.assertFalse(container.tieneItem(guardableHacha));


    }
}
