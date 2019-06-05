package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteDivididaDeDurabilidad;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteDivididaDeDurabilidadTest {

    @Test
    public void desgasteDivididaDeDurabilidadReduceSegunDurabilidadYDivisorAsiganad() {

        int durabilidadInical = 200;
        double divisor = 10;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteDivididaDeDurabilidad desgaste = new EstrategiaDesgasteDivididaDeDurabilidad(durabilidadInical, divisor) ;

        desgaste.desgastar();
        durabilidadActual -= (durabilidadActual / divisor);

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }

}
