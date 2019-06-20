package fiuba.algo3.tp2.materialesTest;

import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.materiales.DiamanteMaterial;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import fiuba.algo3.tp2.materiales.PiedraMaterial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaterialTest {

    @Test
    public void MaderaEsGolpeadaPorHachaDeMaderaYSeReduceSuDurabildiad() {
        MaderaMaterial unaMadera = new MaderaMaterial();
        HachaMadera unHacha = new HachaMadera();
        unHacha.romper(unaMadera);
        assertEquals(8, unaMadera.getDurabilidad());
        unHacha.romper(unaMadera);
        assertEquals(6, unaMadera.getDurabilidad());
        unHacha.romper(unaMadera);
        assertEquals(4, unaMadera.getDurabilidad());
    }

    @Test
    public void PiedraEsGolpeadaPorUnHachaYNoSeReduceSuDurabildiad() {
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        HachaMadera unHachaMadera = new HachaMadera();
        HachaMetal unHachaMetal = new HachaMetal();
        HachaPiedra unHachaPiedra = new HachaPiedra();
        unHachaMadera.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
        unHachaMetal.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
        unHachaPiedra.romper(unaPiedra);
        assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
    }

    @Test
    public void PiedraEsGolpeadaPorUnPicoMaderaYSeReduceSuDurabilidad() {
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        PicoMadera unPicoMadera = new PicoMadera();
        unPicoMadera.romper(unaPiedra);
        Assert.assertEquals(durabilidadInicial - 2, unaPiedra.getDurabilidad());
    }

    @Test
    public void PiedraEsGolpeadaPorUnPicoPiedraYSeReduceSuDurabilidad(){
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        PicoPiedra unPicoPiedra = new PicoPiedra();
        unPicoPiedra.romper(unaPiedra);
        Assert.assertEquals(durabilidadInicial - 4, unaPiedra.getDurabilidad());
    }

    @Test
    public void PiedraEsGolpeadaPorUnPicoMetalYSeReduceSuDurabilidad(){
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        PicoMetal unPicoMetal = new PicoMetal();
        unPicoMetal.romper(unaPiedra);
        Assert.assertEquals(durabilidadInicial - 12, unaPiedra.getDurabilidad());
    }

    @Test
    public void MetalEsGolpeadoPorUnPicoDeMaderaYNoSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoMadera unPicoDeMadera = new PicoMadera();
        unPicoDeMadera.romper(unMetal);
        assertEquals(durabilidadInicial, unMetal.getDurabilidad());

    }

    @Test
    public void MetalEsGolpeadoPorUnPicoDePiedraYSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoPiedra unPicoDePiedra = new PicoPiedra();
        unPicoDePiedra.romper(unMetal);
        assertEquals(durabilidadInicial - 4, unMetal.getDurabilidad());
    }

    @Test
    public void MetalEsGolpeadoPorUnPicoFinoYSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoFino unPicoFino = new PicoFino();

        unPicoFino.romper(unMetal);
        assertEquals(durabilidadInicial - 20, unMetal.getDurabilidad());

    }

    @Test
    public void MetalEsGolpeadoPorUnPicoDeMetalYSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoMetal unPicoDeMetal = new PicoMetal();
        unPicoDeMetal.romper(unMetal);
        assertEquals(durabilidadInicial - 12, unMetal.getDurabilidad());
    }

    @Test (expected = MaterialRotoExcepcion.class)
    public void MaderaEsGolpeadaHastaAgotarSuDurabilidadYSeLanzaExcepcion(){
        MaderaMaterial madera = new MaderaMaterial();
        HachaMetal hacha = new HachaMetal();
        madera.desgastarCon(hacha);
        madera.desgastarCon(hacha);
    }

    @Test (expected = MaterialRotoExcepcion.class)
    public void PiedraEsGolpeadaHastaAgotarSuDurabilidadYSeLanzaExcepcion(){
        PiedraMaterial piedra = new PiedraMaterial();
        PicoMetal pico = new PicoMetal();
        piedra.desgastarCon(pico);
        piedra.desgastarCon(pico);
        piedra.desgastarCon(pico);
        piedra.desgastarCon(pico);
    }

    @Test (expected = MaterialRotoExcepcion.class)
    public void MetalEsGolpeadaHastaAgotarSuDurabilidadYSeLanzaExcepcion(){
        MetalMaterial metal = new MetalMaterial();
        PicoFino pico = new PicoFino();
        metal.desgastarCon(pico);
        metal.desgastarCon(pico);
        metal.desgastarCon(pico);
        metal.desgastarCon(pico);
    }

    @Test (expected = MaterialRotoExcepcion.class)
    public void DiamanteEsGolpeadaHastaAgotarSuDurabilidadYSeLanzaExcepcion(){
        DiamanteMaterial diamante = new DiamanteMaterial();
        PicoFino pico = new PicoFino();
        diamante.desgastarCon(pico);
        diamante.desgastarCon(pico);
        diamante.desgastarCon(pico);
        diamante.desgastarCon(pico);
        diamante.desgastarCon(pico);
        diamante.desgastarCon(pico);
    }
}
