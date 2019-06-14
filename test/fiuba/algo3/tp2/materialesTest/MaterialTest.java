package fiuba.algo3.tp2.materialesTest;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.excepciones.HerramientaRotaExcepcion;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.herramientas.hachas.HachaMetal;
import fiuba.algo3.tp2.herramientas.hachas.HachaPiedra;
import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoMadera;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
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
        try {
            unHacha.romper(unaMadera);
            assertEquals(8, unaMadera.getDurabilidad());
            unHacha.romper(unaMadera);
            assertEquals(6, unaMadera.getDurabilidad());
            unHacha.romper(unaMadera);
            assertEquals(4, unaMadera.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void PiedraEsGolpeadaPorUnHachaYNoSeReduceSuDurabildiad() {
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        HachaMadera unHachaMadera = new HachaMadera();
        HachaMetal unHachaMetal = new HachaMetal();
        HachaPiedra unHachaPiedra = new HachaPiedra();
        try {
            unHachaMadera.romper(unaPiedra);
            assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
            unHachaMetal.romper(unaPiedra);
            assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
            unHachaPiedra.romper(unaPiedra);
            assertEquals(durabilidadInicial, unaPiedra.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void PiedraEsGolpeadaPorUnPicoMaderaYSeReduceSuDurabilidad() {
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        PicoMadera unPicoMadera = new PicoMadera();
        try {
            unPicoMadera.romper(unaPiedra);
            Assert.assertEquals(durabilidadInicial - 2, unaPiedra.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void PiedraEsGolpeadaPorUnPicoPiedraYSeReduceSuDurabilidad(){
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        PicoPiedra unPicoPiedra = new PicoPiedra();
        try {
            unPicoPiedra.romper(unaPiedra);
            Assert.assertEquals(durabilidadInicial - 4, unaPiedra.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void PiedraEsGolpeadaPorUnPicoMetalYSeReduceSuDurabilidad(){
        PiedraMaterial unaPiedra = new PiedraMaterial();
        int durabilidadInicial = unaPiedra.getDurabilidad();
        PicoMetal unPicoMetal = new PicoMetal();
        try {
            unPicoMetal.romper(unaPiedra);
            Assert.assertEquals(durabilidadInicial - 12, unaPiedra.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void MetalEsGolpeadoPorUnPicoDeMaderaYNoSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoMadera unPicoDeMadera = new PicoMadera();
        try {
            unPicoDeMadera.romper(unMetal);
            assertEquals(durabilidadInicial, unMetal.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }

    }

    @Test
    public void MetalEsGolpeadoPorUnPicoDePiedraYSeReduceSuDurabilidad() {
        MetalMaterial unMetal = new MetalMaterial();
        int durabilidadInicial = unMetal.getDurabilidad();
        PicoPiedra unPicoDePiedra = new PicoPiedra();
        try {
            unPicoDePiedra.romper(unMetal);
            assertEquals(durabilidadInicial - 4, unMetal.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
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
        try {
            unPicoDeMetal.romper(unMetal);
            assertEquals(durabilidadInicial - 12, unMetal.getDurabilidad());
        }
        catch (HerramientaRotaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }
}
