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
        HachaDeMadera hachaMadera = Mockito.mock(HachaDeMadera.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(hachaMadera);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia);
    }

    @Test
    public void seUsaHachaPiedraContraMaterialMetalYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        HachaDePiedra hachaPiedra = Mockito.mock(HachaDePiedra.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(hachaPiedra);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia );
    }

    @Test
    public void seUsaHachaMetalContraMaterialMetalYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        HachaDeMetal hachaMetal = Mockito.mock(HachaDeMetal.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(hachaMetal);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia);
    }

    @Test
    public void seUsaPicoMaderaContraMaterialMetalYDurabilidadMaterialNoDecrece(){
        Metal instanciaMetal = new Metal();
        PicoDeMadera picoMadera = Mockito.mock(PicoDeMadera.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(picoMadera);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia);}

    @Test
    public void seUsaPicoMetalContraMaterialMetalYDurabilidadMaterialDecreceDoceUnidades(){
        Metal instanciaMetal = new Metal();
        PicoDeMetal picoMetal = Mockito.mock(PicoDeMetal.class);
        int durabilidadInstancia = instanciaMetal.durabilidad();
        instanciaMetal.desgastar(picoMetal);
        Assert.assertEquals(instanciaMetal.durabilidad(), durabilidadInstancia - 12);}

    @Test
    public void seUsaPicoPiedraContraMaterialMetalYDurabilidadMaterialDecreceCuatroUnidades(){
        Metal instanciaMetal = new Metal();
        PicoDePiedra picoPiedra = Mockito.mock(PicoDePiedra.class);
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

