package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteDivididaTest {

    @Test
    public void desgasteDivididaReduceSegunFactorDeReduccionYDivisorAsigando() {

        int durabilidadInical = 10;
        int factorReduccion = 3;
        double divisor = 2;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteDividida desgaste = new EstrategiaDesgasteDividida(durabilidadInical, factorReduccion, divisor);

        desgaste.desgastar();
        durabilidadActual -= factorReduccion / divisor;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }


    @Test
    public void desgasteDivididaReduceSegunFactorDeReduccionYDivisorAsigando2() {

        /* el divisor es numero con decimal */

        int durabilidadInical = 10;
        int factorReduccion = 3;
        double divisor = 1.5;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteDividida desgaste = new EstrategiaDesgasteDividida(durabilidadInical, factorReduccion, divisor);

        desgaste.desgastar();
        durabilidadActual -= factorReduccion / divisor;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }


}