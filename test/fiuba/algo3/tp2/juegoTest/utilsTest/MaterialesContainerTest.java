package fiuba.algo3.tp2.juegoTest.utilsTest;

import fiuba.algo3.tp2.juego.utils.MaterialesContainer;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import org.junit.Assert;
import org.junit.Test;

public class MaterialesContainerTest {
    @Test
    public void seAgrega3ItemsMetalAColleccion() {
        MetalMaterial metal = new MetalMaterial();
        MaterialesContainer materialesContainer = new MaterialesContainer();

        materialesContainer.agregar(metal);
        materialesContainer.agregar(metal);
        materialesContainer.agregar(metal);

        Assert.assertEquals(3, materialesContainer.getCantidadDe(metal));
    }

    @Test
    public void seRemueveItemDeLaCollecionYDecrementaSuCantidad() {
        MetalMaterial metal = new MetalMaterial();
        MaterialesContainer materialesContainer = new MaterialesContainer();

        materialesContainer.agregar(metal);
        materialesContainer.agregar(metal);
        materialesContainer.agregar(metal);

        Assert.assertEquals(3, materialesContainer.getCantidadDe(metal));

        materialesContainer.decrementarCantidadDe(metal);

        Assert.assertEquals(2, materialesContainer.getCantidadDe(metal));
    }

    @Test
    public void seRemueveClaveDeColeccion() {
        MetalMaterial metal = new MetalMaterial();
        MaterialesContainer materialesContainer = new MaterialesContainer();

        materialesContainer.agregar(metal);
        materialesContainer.agregar(metal);
        materialesContainer.agregar(metal);

        materialesContainer.remover(metal);

        Assert.assertEquals(0, materialesContainer.getCantidadDe(metal));

    }
}
