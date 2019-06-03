package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mortbay.jetty.security.HTAccessHandler;

import java.nio.charset.MalformedInputException;

public class PiedraTest {

    @Test
    public void SeCreaInstanciaDeMaterialPiedra(){
        Piedra instanciaPiedra = new Piedra();
        Assert.assertNotNull(instanciaPiedra);
    }

    @Test
    public void InstanciaDePiedraTieneUnaDurabilidadInicialDeTreintaUnidades(){
        Piedra instanciaPiedra = new Piedra();
        Assert.assertEquals(instanciaPiedra.durabilidad(), 30);
    }

    @Test
    public void seUsaHachaMaderaContraMaterialPiedraYDurabilidadMaterialNoDecrece(){
        Piedra instanciaPiedra = new Piedra();
        HachaMadera hachaMadera = Mockito.mock(HachaMadera.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(hachaMadera);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia);
    }

    @Test
    public void seUsaHachaPiedraContraMaterialPiedraYDurabilidadMaterialNoDecrece(){
        Piedra instanciaPiedra = new Piedra();
        HachaPiedra hachaPiedra = Mockito.mock(HachaPiedra.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(hachaPiedra);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia );
    }

    @Test
    public void seUsaHachaMetalContraMaterialPiedraYDurabilidadMaterialNoDecrece(){
        Piedra instanciaPiedra = new Piedra();
        HachaMetal hachaMetal = Mockito.mock(HachaMetal.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(hachaMetal);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia);
    }

    @Test
    public void seUsaPicoMaderaContraMaterialPiedraYDurabilidadMaterialDecreceDosUnidades(){
        Piedra instanciaPiedra = new Piedra();
        PicoMadera PicoMadera = Mockito.mock(PicoMadera.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(PicoMadera);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia - 2);}

    @Test
    public void seUsaPicoMetalContraMaterialPiedraYDurabilidadMaterialDecreceDoceUnidades(){
        Piedra instanciaPiedra = new Piedra();
        PicoMetal picoMetal = Mockito.mock(PicoMetal.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(picoMetal);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia - 12);}

    @Test
    public void seUsaPicoPiedraContraMaterialPiedraYDurabilidadMaterialDecreceCuatroUnidades(){
        Piedra instanciaPiedra = new Piedra();
        PicoPiedra picoPiedra = Mockito.mock(PicoPiedra.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(picoPiedra);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia - 4); }
    @Test
    public void seUsaPicoFinoContraMaterialPiedraYDurabilidadMaterialDecreceVeinteUnidades(){
        Piedra instanciaPiedra = new Piedra();
        PicoFino picoFino = Mockito.mock(PicoFino.class);
        int durabilidadInstancia = instanciaPiedra.durabilidad();
        instanciaPiedra.desgastar(picoFino);
        Assert.assertEquals(instanciaPiedra.durabilidad(), durabilidadInstancia - 20); }


}

