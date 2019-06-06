package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLogaritmica;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLogaritmicaTest {

    @Test
    public void desgasteDivididaDeDurabilidadReduceSegunDurabilidadYDivisorAsiganad() {

        int durabilidadInical = 200;
        double divisor = 10;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteLogaritmica desgaste = new EstrategiaDesgasteLogaritmica(durabilidadInical, divisor) ;

        desgaste.desgastar();
        durabilidadActual -= (durabilidadActual / divisor);

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }

}
