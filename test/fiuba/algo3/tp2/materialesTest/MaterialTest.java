package fiuba.algo3.tp2.materialesTest;

import fiuba.algo3.tp2.herramientas.hachas.Hacha;
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
    public void MaderaEsGolpeadaPorHachaDePiedraYSeReduceSuDurabildiad(){
        MaderaMaterial unaMadera = new MaderaMaterial();
        HachaPiedra unHacha = new HachaPiedra();
        unHacha.romper(unaMadera);
        assertEquals(5, unaMadera.getDurabilidad());
    }

    @Test
    public void MaderaEsGolpeadaPorHachaDeMetalYSeReduceSuDurabildiad(){
        MaderaMaterial unaMadera = new MaderaMaterial();
        HachaMetal unHacha = new HachaMetal();
        unHacha.romper(unaMadera);
        assertEquals(0, unaMadera.getDurabilidad());
    }

    @Test
    public void MaderaEsGolpeadaPorUnPicoMaderaYNoDisminuyeDurabilidad(){
        MaderaMaterial unaMadera = new MaderaMaterial();
        int durabilidadMadera = unaMadera.getDurabilidad();
        PicoMadera unPico = new PicoMadera();
        unPico.romper(unaMadera);
        assertEquals(durabilidadMadera, unaMadera.getDurabilidad());
    }

    @Test
    public void MaderaEsGolpeadaPorUnPicoPiedraYNoDisminuyeDurabilidad(){
        MaderaMaterial unaMadera = new MaderaMaterial();
        int durabilidadMadera = unaMadera.getDurabilidad();
        PicoPiedra unPico = new PicoPiedra();
        unPico.romper(unaMadera);
        assertEquals(durabilidadMadera, unaMadera.getDurabilidad());
    }

    @Test
    public void MaderaEsGolpeadaPorUnPicoMetalYNoDisminuyeDurabilidad(){
        MaderaMaterial unaMadera = new MaderaMaterial();
        int durabilidadMadera = unaMadera.getDurabilidad();
        PicoMetal unPico = new PicoMetal();
        unPico.romper(unaMadera);
        assertEquals(durabilidadMadera, unaMadera.getDurabilidad());
    }

    @Test
    public void MaderaEsGolpeadaPorUnPicoFinoYNoDisminuyeDurabilidad(){
        MaderaMaterial unaMadera = new MaderaMaterial();
        int durabilidadMadera = unaMadera.getDurabilidad();
        PicoFino unPico = new PicoFino();
        unPico.romper(unaMadera);
        assertEquals(durabilidadMadera, unaMadera.getDurabilidad());
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

    @Test
    public void metalEsGolpeadoPorHachasYNoSeReduceDurabilidad(){
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        HachaMadera hachaMadera = new HachaMadera();
        HachaMetal hachaMetal = new HachaMetal();
        HachaPiedra hachaPiedra = new HachaPiedra();
        hachaMadera.romper(unMetal);
        Assert.assertEquals(durabilidadInicial, unMetal.getDurabilidad());
        hachaPiedra.romper(unMetal);
        Assert.assertEquals(durabilidadInicial, unMetal.getDurabilidad());
        hachaMetal.romper(unMetal);
        Assert.assertEquals(durabilidadInicial, unMetal.getDurabilidad());
    }

    @Test
    public void diamanteEsGolpeadoPorHachasYNoSeReduceDurabilidad(){
        DiamanteMaterial diamante = new DiamanteMaterial();
        int durabilidadInicial = diamante.getDurabilidad();
        HachaMadera hachaMadera = new HachaMadera();
        HachaMetal hachaMetal = new HachaMetal();
        HachaPiedra hachaPiedra = new HachaPiedra();
        hachaMadera.romper(diamante);
        Assert.assertEquals(durabilidadInicial, diamante.getDurabilidad());
        hachaPiedra.romper(diamante);
        Assert.assertEquals(durabilidadInicial, diamante.getDurabilidad());
        hachaMetal.romper(diamante);
        Assert.assertEquals(durabilidadInicial, diamante.getDurabilidad());
    }

    @Test
    public void diamanteEsGolpeadoPorPicosYNoSeReduceDurabilidad(){
        DiamanteMaterial diamante = new DiamanteMaterial();
        int durabilidadInicial = diamante.getDurabilidad();
        PicoMadera picoMadera = new PicoMadera();
        PicoMetal picoMetal = new PicoMetal();
        PicoPiedra picoPiedra = new PicoPiedra();
        picoMadera.romper(diamante);
        Assert.assertEquals(durabilidadInicial, diamante.getDurabilidad());
        picoPiedra.romper(diamante);
        Assert.assertEquals(durabilidadInicial, diamante.getDurabilidad());
        picoMetal.romper(diamante);
        Assert.assertEquals(durabilidadInicial, diamante.getDurabilidad());
    }

    @Test
    public void diamanteEsGolpeadoPorPicoFinoYSeReduceSuDurabilidad(){
        DiamanteMaterial diamante = new DiamanteMaterial();
        int durabilidadInicial = diamante.getDurabilidad();
        PicoFino picoFino = new PicoFino();
        picoFino.romper(diamante);
        Assert.assertEquals(durabilidadInicial - 20, diamante.getDurabilidad());
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
