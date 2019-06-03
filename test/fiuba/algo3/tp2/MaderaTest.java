package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mortbay.jetty.security.HTAccessHandler;

import java.nio.charset.MalformedInputException;

public class MaderaTest {

    @Test
    public void SeCreaInstanciaDeMaterialMadera(){
        Madera instanciaMadera = new Madera();
        Assert.assertNotNull(instanciaMadera);
    }

    @Test
    public void InstanciaDeMaderaTieneUnaDurabilidadInicialDeDiezUnidades(){
        Madera instanciaMadera = new Madera();
        Assert.assertEquals(instanciaMadera.durabilidad(), 10);
    }

    @Test
    public void seUsaHachaMaderaContraMaterialMaderaYDurabilidadMaterialDecreceDosUnidades(){
        Madera instanciaMadera = new Madera();
        HachaMadera hachaMadera = Mockito.mock(HachaMadera.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(hachaMadera);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia - 2);
    }

    @Test
    public void seUsaHachaPiedraContraMaterialMaderaYDurabilidadMaterialDecreceCincoUnidades(){
        Madera instanciaMadera = new Madera();
        HachaPiedra hachaPiedra = Mockito.mock(HachaPiedra.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(hachaPiedra);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia - 5);
    }

    @Test
    public void seUsaHachaMetalContraMaterialMaderaYDurabilidadMaterialDecreceDiezUnidades(){
        Madera instanciaMadera = new Madera();
        HachaMetal hachaMetal = Mockito.mock(HachaMetal.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(hachaMetal);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia - 10);
    }

    @Test
    public void seUsaPicoMaderaContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoMadera PicoMadera = Mockito.mock(PicoMadera.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(PicoMadera);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia);}

    @Test
    public void seUsaPicoMetalContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoMetal picoMetal = Mockito.mock(PicoMetal.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(picoMetal);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia);}

    @Test
    public void seUsaPicoPiedraContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoPiedra picoPiedra = Mockito.mock(PicoPiedra.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(picoPiedra);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia); }
    @Test
    public void seUsaPicoFinoContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoFino picoFino = Mockito.mock(PicoFino.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(picoFino);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia); }


}
