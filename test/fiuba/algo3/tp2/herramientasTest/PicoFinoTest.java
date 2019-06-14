package fiuba.algo3.tp2.herramientasTest;


import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;
import org.junit.Assert;
import org.junit.Test;


public class PicoFinoTest {

    @Test
    public void seCreaUnPicoFinoYNoEsNulo(){

        PicoFino picoFino = new PicoFino();
        Assert.assertNotNull(picoFino);
    }

    @Test
    public void picoFinoIniciaConMilDeDurabilidad(){

        PicoFino picoFino = new PicoFino();
        Assert.assertEquals(1000, picoFino.getDurabilidad(), 0.01);
    }

    @Test
    public void picoFinoIniciaConVeinteDeFuerza(){

        PicoFino picoFino = new PicoFino();
        Assert.assertEquals(20,picoFino.getFuerza());
    }

    @Test
    public void picoFinoSeUsaContraDiamanteYReducePorEstrategiaDivididaPorDurabilidad(){

        PicoFino picoFino = new PicoFino();
        DiamanteMaterial diamante = new DiamanteMaterial();

        double durabilidad = picoFino.getDurabilidad();
        double divisor = 10;
            picoFino.romper(diamante);
            durabilidad -= durabilidad / divisor;
        Assert.assertEquals(durabilidad, picoFino.getDurabilidad(), 0.01);
    }

    @Test
    public void picoFinoSeUsaContraMaderaYNoReduceDurabilidad(){

        PicoFino picoFino = new PicoFino();
        MaderaMaterial madera = new MaderaMaterial();

        double durabilidadInicial = picoFino.getDurabilidad();

        picoFino.romper(madera);
        picoFino.romper(madera);
        picoFino.romper(madera);

        Assert.assertEquals(durabilidadInicial, picoFino.getDurabilidad(), 0.01);

    }
    @Test
    public void picoFinoSeUsaContraPiedraYNoReduceDurabilidad(){

        PicoFino picoFino = new PicoFino();
        PiedraMaterial piedra = new PiedraMaterial();

        double durabilidadInicial = picoFino.getDurabilidad();

        picoFino.romper(piedra);
        picoFino.romper(piedra);
        picoFino.romper(piedra);

        Assert.assertEquals(durabilidadInicial, picoFino.getDurabilidad(), 0.01);

    }
    @Test
    public void picoFinoSeUsaContraMetalYNoReduceDurabilidad(){

        PicoFino picoFino = new PicoFino();
        MetalMaterial metal = new MetalMaterial();

        double durabilidadInicial = picoFino.getDurabilidad();

        picoFino.romper(metal);
        picoFino.romper(metal);
        picoFino.romper(metal);

        Assert.assertEquals(durabilidadInicial, picoFino.getDurabilidad(), 0.01);

    }
}
