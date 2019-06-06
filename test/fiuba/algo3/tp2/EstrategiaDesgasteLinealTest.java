package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLinealTest {

    @Test
    public void desgasteLinealinciaConDurabilidadAsignadaTest(){

        int durabilidadInical = 10;
        int fuerza = 3;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInical, fuerza,1);

        Assert.assertEquals(durabilidadInical, desgaste.durabilidad());
    }

    @Test
    public void desgasteLinealNoRecibeDivisorEntoncesReduceSegunFuerzaAsiganda(){

        int durabilidadInical = 10;
        int fuerza = 3;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInical, fuerza);

        desgaste.desgastar();
        durabilidadActual -= fuerza;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }

    @Test
    public void desgasteDivididaPorDivisorReduceSegunFuerzaYDivisorAsigando() {

        int durabilidadInical = 10;
        int fuerza = 3;
        double divisor = 2;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInical, fuerza, divisor);

        desgaste.desgastar();
        durabilidadActual -= fuerza / divisor;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }


    @Test
    public void desgasteDivididaPorDivisorReduceSegunFuerzaYDivisorAsigando2() {

        /* el divisor es numero con decimal */

        int durabilidadInical = 10;
        int fuerza = 3;
        double divisor = 1.5;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInical, fuerza, divisor);

        desgaste.desgastar();
        durabilidadActual -= fuerza / divisor;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }


}