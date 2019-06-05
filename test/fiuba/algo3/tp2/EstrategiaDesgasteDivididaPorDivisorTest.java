package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDivididaPorDivisor;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteDivididaPorDivisorTest {

    @Test
    public void desgasteDivididaPorDivisorReduceSegunFuerzaYDivisorAsigando() {

        int durabilidadInical = 10;
        int fuerza = 3;
        double divisor = 2;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteDivididaPorDivisor desgaste = new EstrategiaDesgasteDivididaPorDivisor(durabilidadInical, fuerza, divisor);

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

        EstrategiaDesgasteDivididaPorDivisor desgaste = new EstrategiaDesgasteDivididaPorDivisor(durabilidadInical, fuerza, divisor);

        desgaste.desgastar();
        durabilidadActual -= fuerza / divisor;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }


}