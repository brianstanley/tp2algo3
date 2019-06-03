package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mortbay.jetty.security.HTAccessHandler;

import java.nio.charset.MalformedInputException;

public class MetalTest {

    @Test
    public void SeCreaInstanciaDeMaterialMetal(){
        Metal instanciaMetal = new Metal();
        Assert.assertNotNull(instanciaMetal);
    }

    @Test
    public void InstanciaDeMetalTieneUnaDurabilidadInicialDeCincuentaUnidades(){
        Metal instanciaMetal = new Metal();
        Assert.assertEquals(instanciaMetal.durabilidad(), 50); }

    @Test
    public void seUsaHachaMaderaContraMaterialPiedraYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        HachaMadera hachaMadera = Mockito.mock(HachaMadera.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(hachaMadera);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia);
    }

    @Test
    public void seUsaHachaPiedraContraMaterialMetalYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        HachaPiedra hachaPiedra = Mockito.mock(HachaPiedra.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(hachaPiedra);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia );
    }

    @Test
    public void seUsaHachaMetalContraMaterialMetalYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        HachaMetal hachaMetal = Mockito.mock(HachaMetal.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(hachaMetal);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia);
    }

    @Test
    public void seUsaPicoMaderaContraMaterialMetalYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        PicoMadera PicoMadera = Mockito.mock(PicoMadera.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(PicoMadera);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia);}

    @Test
    public void seUsaPicoMetalContraMaterialMetalYDurabilidadMaterialDecreceDoceUnidades(){
        Metal instanciaMetal = new Metal();
        PicoMetal picoMetal = Mockito.mock(PicoMetal.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(picoMetal);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia - 12);}

    @Test
    public void seUsaPicoPiedraContraMaterialMetalYDurabilidadMaterialDecreceCuatroUnidades(){
        Metal instanciaMetal = new Metal();
        PicoPiedra picoPiedra = Mockito.mock(PicoPiedra.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(picoPiedra);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia - 4); }

    @Test
    public void seUsaPicoFinoContraMaterialMetalYDurabilidadMaterialDecreceVeinteUnidades(){
        Metal instanciaMetal = new Metal();
        PicoFino picoFino = Mockito.mock(PicoFino.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(picoFino);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia - 20); }


}

