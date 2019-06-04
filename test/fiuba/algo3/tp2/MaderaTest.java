package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;


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
        HachaDeMadera hachaMadera = mock(HachaDeMadera.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(hachaMadera);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia - 2);
    }

    @Test
    public void seUsaHachaPiedraContraMaterialMaderaYDurabilidadMaterialDecreceCincoUnidades(){
        Madera instanciaMadera = new Madera();
        HachaDePiedra HachaPiedra = mock(HachaDePiedra.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(HachaPiedra);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia - 5);
    }

    @Test
    public void seUsaHachaMetalContraMaterialMaderaYDurabilidadMaterialDecreceDiezUnidades(){
        Madera instanciaMadera = new Madera();
        HachaDeMetal hachaMetal = mock(HachaDeMetal.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(hachaMetal);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia - 10);
    }

    @Test
    public void seUsaPicoMaderaContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoDeMadera picoMadera = Mockito.mock(PicoDeMadera.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(picoMadera);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia);}

    @Test
    public void seUsaPicoMetalContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoDeMetal picoMetal = Mockito.mock(PicoDeMetal.class);
        int durabilidadInstancia = instanciaMadera.durabilidad();
        instanciaMadera.desgastar(picoMetal);
        Assert.assertEquals(instanciaMadera.durabilidad(), durabilidadInstancia);}

    @Test
    public void seUsaPicoPiedraContraMaterialMaderaYDurabilidadMaterialNoDecrece(){
        Madera instanciaMadera = new Madera();
        PicoDePiedra picoPiedra = Mockito.mock(PicoDePiedra.class);
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
